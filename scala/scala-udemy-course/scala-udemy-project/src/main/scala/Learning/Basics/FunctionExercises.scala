package Learning.Basics

object FunctionExercises extends App {

  def greetingFunction(name: String, age: Int): Unit =
    println("Hello, my name is " + name + " and I am " + age + " years old.")

  greetingFunction("Aveek", 29)
  greetingFunction("Saioni", 28)

  //************************************************************************

  def aFactorialFunction(n: Int): Int = {
    if (n == 1) 1
    else n * aFactorialFunction(n - 1)
  }

  println(aFactorialFunction(5))

  //************************************************************************

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }

  println(aFibonacciFunction(8))


}
