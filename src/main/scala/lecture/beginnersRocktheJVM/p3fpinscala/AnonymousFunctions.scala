package lecture.beginnersRocktheJVM.p3fpinscala

object AnonymousFunctions extends App {

  // anonymous functions (LAMBDA)
  val doubler: Int => Int = (x: Int) => x + 2

  //multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  //careful
  println(justDoSomething) //function itself
  println(justDoSomething()) //call

  //curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val nicerIncrementer: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _

}
