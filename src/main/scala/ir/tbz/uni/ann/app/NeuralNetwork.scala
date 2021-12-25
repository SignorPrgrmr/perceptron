package ir.tbz.uni.ann.app

import ir.tbz.uni.ann.core.{Bias, InputNeuron, OutputNeuron}
import ir.tbz.uni.ann.sample.data.Data

import scala.annotation.tailrec
import scala.collection.mutable

object NeuralNetwork extends App {

	private val outputNeuron = OutputNeuron(3)
	private val inputNeuron1 = InputNeuron(mutable.Map(outputNeuron -> 0))
	private val inputNeuron2 = InputNeuron(mutable.Map(outputNeuron -> 0))
	private val bias = Bias(mutable.Map(outputNeuron -> 0))
	private val data = Data.andSampleData
	private val ALPHA = 1

	@tailrec
	private def trainNeuralNetwork(): Unit =
		var isChanged = false
		for sampleData <- data do
			inputNeuron1 put sampleData.x1
			inputNeuron2 put sampleData.x2
			bias.sendSignal()
			val result = OutputNeuron.getOutput(outputNeuron.neuron)
			println(s"Result: $result")
			readInput("Please enter 1 to continue: ")
			if result != sampleData.y then
				isChanged = true
				inputNeuron1.neuron updateWeights mutable.Map(outputNeuron -> sampleData.x1 * sampleData.y * ALPHA)
				inputNeuron2.neuron updateWeights mutable.Map(outputNeuron -> sampleData.x2 * sampleData.y * ALPHA)
				bias updateBiases mutable.Map(outputNeuron -> sampleData.y * ALPHA)
		if isChanged then trainNeuralNetwork()

	trainNeuralNetwork()
	println("Neural network is trained")

	@tailrec
	def readInput(text: String): String =
		import scala.io.StdIn.readLine
		print(text)
		val input = readLine
		if input.equals("1") || input.equals("-1") then input
		else
			println("Invalid input!")
			readInput(text)

	@tailrec
	def interactWithUser(): Unit =
		inputNeuron1 put readInput("x1: ").toInt
		inputNeuron2 put readInput("x2: ").toInt
		bias.sendSignal()
		println("output: " + (OutputNeuron getOutput outputNeuron.neuron))
		interactWithUser()

	interactWithUser()
}
