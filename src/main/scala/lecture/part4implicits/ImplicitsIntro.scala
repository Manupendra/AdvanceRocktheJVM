package lecture.part4implicits

object ImplicitsIntro extends App {

  val pair = "Bob" -> "666"
  val intPair = 1 -> 2

  case class Person(name: String){
    def greet = s"Hi, my Name is $name!"
  }

  implicit def fromStringToPerson(str: String): Person = Person(str)

  println("Bob".greet) //println(fromStringToPerson("Bob").greet)
  //  class A {
  //    def greet: Int = 2
  //  }
  //  implicit def fromStringToA(str: String): A = new A

  // implicit parameters
  def increment(x: Int)(implicit amount: Int) = x + amount
  implicit val defaultAmount: Int = 10 // in Scala 3 we need to explicitly give types (good practice anyway)

  increment(2)
  // NOT the same as default args

}
