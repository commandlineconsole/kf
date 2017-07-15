package Edureka.traits

// ToDO if (Amount > Balance then print you have no enough amount in your account
// TODO else if print you remain amount in your account that is Amount - Balance

class savingaccount {
  var Balance : Double = 0.0
  var Amount : Double = 0.0

  def cal(Amount: Double )  = {
    if (Amount > Balance)  println(" OOPs you haven't got enought amount in your account")
 else println("You don't have enough amount in your account")

  }
}


object sc extends savingaccount with App {
    {
      val saccount = new savingaccount
      saccount.cal(100)
    }
}