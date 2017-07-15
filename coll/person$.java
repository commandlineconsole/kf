package coll;object person {

  def main(args: Array[String]): Unit = {

    class Person() {
      // Private age variable, renamed to _age

      private var _age = 0
   //   println(age)
      var name = ""
   //   println(name)

      // Getter
      def age = _age

      // Setter
      def age_= (value:Int):Unit = _age = value

      println(_age)
      println(age)
    }




    }


}
