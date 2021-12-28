package ir.tbz.uni.ann.core

import ir.tbz.uni.ann.core.OutputNeuron.THETA

import scala.collection.mutable

class OutputNeuron extends Neuron :

	private var output: Option[Int] = None

	override def sendSignal(netInput: Int): Unit =
		output = Some(activationFunction(netInput))

	private def activationFunction(input: Int): Int =
		if input > THETA then +1
		else if -THETA <= input && input <= THETA then 0
		else -1

	override def updateWeights(data: Map[NeuralNetworkInput, Int]): Unit = ()

object OutputNeuron:
	def getOutput(neuron: Neuron): Int =
		neuron match {
			case neuron: OutputNeuron =>
				neuron.output match {
					case None => throw RuntimeException("There is no output")
					case Some(output) => output
				}

			case _ => throw RuntimeException("Invalid neuron: Neuron must be an OutputNeuron")
		}

	def apply(inputCount: Int): NeuralNetworkInput =
		val neuron = new OutputNeuron
		NeuralNetworkInput(neuron, inputCount)

	private val THETA = 0.2