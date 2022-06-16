package Learning.Basics

object Functions extends App {

  def aFunction(a: String, b: String): String =
    a + " " + b


  println(aFunction("Hello", "World"))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

}
