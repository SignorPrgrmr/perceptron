package ir.tbz.uni.ann.core

import scala.collection.mutable

class InputNeuron(private val nextLayer: mutable.Map[NeuralNetworkInput, Int]) extends Neuron :

	override def sendSignal(netInput: Int): Unit =
		for (nni, w) <- nextLayer do nni put netInput * w

	override def updateWeights(data: Map[NeuralNetworkInput, Int]): Unit =
		for nni <- data.keys do
			val delta = data(nni)
			nextLayer get nni match {
				case None => throw RuntimeException("Invalid nni")
				case Some(weight) =>
					nextLayer += (nni -> (weight + delta))
			}


object InputNeuron:

	def apply(nextLayer: mutable.Map[NeuralNetworkInput, Int]): NeuralNetworkInput =
		val neuron = new InputNeuron(nextLayer)
		NeuralNetworkInput(neuron, 1)