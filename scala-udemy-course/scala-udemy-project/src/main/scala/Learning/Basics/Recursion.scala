package Learning.Basics

import scala.annotation.tailrec

object Recursion extends App {

  def aFactorialFunction(n: Int): Int = {
    if (n == 1) 1
    else n * aFactorialFunction(n - 1)
  }

  println(aFactorialFunction(5))

  @tailrec
  def concatTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatTailRec(aString, n - 1, aString + " " + accumulator)

  println(concatTailRec("Hello", 3, ""))

}
