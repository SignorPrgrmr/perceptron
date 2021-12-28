package ir.tbz.uni.ann.sample.data

case class CharacterSampleData(character: Array[Array[Int]], target: Int)

object CharacterSampleData {

	lazy val sampleData: Array[CharacterSampleData] = createSampleData

	private def createSampleData: Array[CharacterSampleData] =
		Array[CharacterSampleData](
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 0, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 0, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 0, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 0, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 0)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 1, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 0, 1, 0, 0),
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](0, 1, 1, 0, 0),
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1)
				),
				1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 0),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 0, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 0, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 0, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 0, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 1, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 1, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 1)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](1, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 1, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 1, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 1, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 1, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 1, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 1, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			),
			CharacterSampleData(
				Array[Array[Int]](
					Array[Int](0, 1, 1, 1, 0),
					Array[Int](1, 0, 1, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](1, 0, 0, 0, 1),
					Array[Int](0, 1, 1, 1, 0)
				),
				-1
			)
		)

}
