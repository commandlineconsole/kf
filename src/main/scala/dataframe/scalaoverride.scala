package dataframe

object scalaoverride {

/*  override def hashCode(): Int = super.hashCode()
  override def clone(): AnyRef = super.clone()
  override def finalize(): Unit = super.finalize()
  override def equals(obj: scala.Any): Boolean = super.equals(obj)*/

  def main(args: Array[String]): Unit = {

        val str1 = "Hello world."
        val str2 = "Hello world."

        if (str1 eq str2) System.out.print("str1 == str2\n")
        else System.out.print("str1 != str2\n")


      }

  //    override def toString = s"scalaoverride($hashCode)"
}
