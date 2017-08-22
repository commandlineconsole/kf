object LearningScala21 {

	def main(args: Array[String]): Unit = {

		if (1 > 3)
			println("Impossible!")
		else println("The world makes sense.")

		// ************

		val number = 3
		number match {
			case 1 => println("One")
			case 2 => println("Two")
			case 3 => println("Three")
			case _ => println("Something else")
		} //> Three

		// ************

		for (x <- 1 to 4) {
			val squared = x * x
			println("squared :" + squared)
		}

		// ************

		var x = 10
		while (x >= 0) {
			println("x :" + x)
			x -= 1
		}

			// ************

		x = 0
		do {
			println(x);
			x += 1
		} while (x <= 10) //> 0


		{
			val x = 10; x + 20
		} //> res0: Int = 30

		println({
			val x = 10; x + 20
		}) //> 30

	}
}
