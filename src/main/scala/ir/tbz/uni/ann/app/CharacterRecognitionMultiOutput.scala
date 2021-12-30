package ir.tbz.uni.ann.app

import ir.tbz.uni.ann.app.CharacterRecognition.{bias, frontData, inputNeurons, outputNeuron, range, stage}
import ir.tbz.uni.ann.core.{Bias, InputNeuron, NeuralNetworkInput, OutputNeuron}
import ir.tbz.uni.ann.sample.data.MultiOutputCharacterSampleData
import scalafx.application.JFXApp3
import scalafx.scene.{Node, Scene}
import scalafx.scene.control.Button
import scalafx.scene.layout.AnchorPane
import scalafx.scene.paint.Color
import scalafx.scene.paint.Color.rgb
import scalafx.scene.shape.Rectangle

import scala.annotation.tailrec
import scala.collection.mutable
import scala.language.postfixOps

object CharacterRecognitionMultiOutput extends JFXApp3 {

	private val range = 0 until 5
	private val outputNeuron1 = OutputNeuron(26)
	private val outputNeuron2 = OutputNeuron(26)
	private val inputNeurons = new Array[Array[NeuralNetworkInput]](5)
	for
		i <- range
	do
		val inputNeurons = new Array[NeuralNetworkInput](5)
		for
			j <- range
		do
			inputNeurons(j) = InputNeuron(mutable.Map(outputNeuron1 -> 0, outputNeuron2 -> 0))

		CharacterRecognitionMultiOutput.inputNeurons(i) = inputNeurons

	private val bias = new Bias(mutable.Map(outputNeuron1 -> 0, outputNeuron2 -> 0))
	private val data = MultiOutputCharacterSampleData.data
	private val ALPHA = 1

	@tailrec
	private def trainNeuralNetwork(): Unit =
		var isChanged = false
		for
			MultiOutputCharacterSampleData(character, y1, y2) <- data
		do
			for
				i <- range
				j <- range
			do
				inputNeurons(i)(j) put character(i)(j)

			bias.sendSignal()
			val output1 = OutputNeuron.getOutput(outputNeuron1.neuron)
			val output2 = OutputNeuron.getOutput(outputNeuron2.neuron)
			if output1 != y1 || output2 != y2 then
				isChanged = true
				for
					i <- range
					j <- range
				do
					inputNeurons(i)(j).neuron updateWeights Map(outputNeuron1 -> ALPHA * y1 * character(i)(j), outputNeuron2 -> ALPHA * y2 * character(i)(j))

				bias updateBiases Map(outputNeuron1 -> ALPHA * y1, outputNeuron2 -> ALPHA * y2)

		if isChanged then trainNeuralNetwork()

	trainNeuralNetwork()
	println("Trained")

	private val frontData = Array[Array[Boolean]](
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false),
		Array[Boolean](false, false, false, false, false)
	)

	override def start(): Unit =
		stage = new JFXApp3.PrimaryStage {
			title = "ScalaFX hello World"
			scene = new Scene {
				content = Seq(new AnchorPane {
					val on: Color = rgb(220, 220, 220)
					val off: Color = rgb(160, 160, 160)
					val cells: Seq[Node] =
						for
							i <- 0 until 5
							j <- 0 until 5
						yield
							new Rectangle {
								layoutX = 23 + i * 91
								layoutY = 23 + j * 91
								width = 90
								height = 90
								fill = off
								onMouseClicked = { event =>
									if frontData(i)(j) then {
										fill = off
										frontData(i)(j) = false
									} else {
										fill = on
										frontData(i)(j) = true
									}
								}
							}

					children = cells
					prefWidth = 500
					prefHeight = 500
				},
					new Button {
						text = "Check"
						onMouseClicked = { _ =>
							for
								i <- range
								j <- range
							do
								inputNeurons(i)(j).put(if frontData(i)(j) then 1 else 0)
							bias.sendSignal()
							val output1 = OutputNeuron getOutput outputNeuron1.neuron
							val output2 = OutputNeuron getOutput outputNeuron2.neuron
							println(s"X: ${ if output1 == 1 then "true" else "false" }")
							println(s"O: ${ if output2 == 1 then "true" else "false" }")
						}
						layoutX = 420
						layoutY = 500
					}
				)
			}
			width = 500
			height = 600
		}

}
