package Tscala


object StringDemo {

    def main(args: Array[String]): Unit = {

      val palindrome = "Dot saw I was Tod"
      val len = palindrome.length
      val tempCharArray = new Array[Char](len)
      val charArray = new Array[Char](len)
      // put original string in an
      // array of chars

      var i = 0
      while ( {
        i < len
      }) {
        tempCharArray(i) = palindrome.charAt(i)

        {
          i += 1; i - 1
        }
      }


      // reverse array of chars
      var j = 0
      while ( {
        j < len
      }) {
        charArray(j) = tempCharArray(len - 1 - j)

        {
          j += 1; j - 1
        }
      }
      val reversePalindrome = new String(charArray)
      System.out.println(reversePalindrome)
    }
  }

