package ir.tbz.uni.ann.core

import scala.collection.mutable

trait Neuron:

	def sendSignal(netInput: Int): Unit

	def updateWeights(data: Map[NeuralNetworkInput, Int]): Unit
