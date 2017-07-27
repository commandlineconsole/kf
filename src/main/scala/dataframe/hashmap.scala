package dataframe

// String s = new String("text");
// Always create a new location in memory and returns a new reference each time. for Exp -

object hashmap {

  def main(args: Array[String]): Unit = {

      val str1 = "Hello world."
      val str2 = "Hello world."

      if (str1 eq str2) System.out.print("str1 == str2\n")
      else System.out.print("str1 != str2\n")

      if (str1 == str2) System.out.print("str1 equals to str2\n")
      else System.out.print("str1 doesn't equal to str2\n")

      val str3 = new String("Hello world.")
      val str4 = new String("Hello world.")

      if (str3 eq str4) System.out.print("str3 == str4\n")
      else System.out.print("str3 != str4\n")
      if (str3 == str4) System.out.print("str3 equals to str4\n")
      else System.out.print("str3 doesn't equal to str4\n")
    }
  }
