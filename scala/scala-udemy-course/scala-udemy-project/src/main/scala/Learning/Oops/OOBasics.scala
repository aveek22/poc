package Learning.Oops

object OOBasics extends App {
  val person = new Person("Aveek", 29)
  println(person.age)
}

class Person (val name: String, val age: Int)