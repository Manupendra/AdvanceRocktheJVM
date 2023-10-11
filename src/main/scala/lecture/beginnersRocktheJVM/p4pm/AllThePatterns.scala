package lecture.beginnersRocktheJVM.p4pm

import lecture.beginnersRocktheJVM.excercises.MyList
import lecture.tos.AdvancedPatternMatching.Cons

object AllThePatterns extends App {

  // 1 - constants
  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "The Scala"
    case true => "The Truth"
    case AllThePatterns => "A singleton object"
  }

  // 2 - match anything
  // 2.1 - wildcard

  val matchAnything = x match {
    case _ =>
  }

  // 2.2 variable
  val matchAVariable = x match {
    case something => s"I've found $something"
  }

  // 3 - tuples
  val aTuple = (1,2)
  val matchATuple = aTuple match {
    case (1,1) =>
    case (something,2) => s"I've found $something"
  }

  val nestedTuple = (1,(2,3))
  val matchNestedTuple = nestedTuple match {
    case (_,(2,v)) =>
  }
  // PMs can be NESTED!


  // 5 - list patterns
  val aStandardList = List(1,2,3,42)
  val standardListMatching = aStandardList match {
    case List(1, _, _, _) => // extractor - advanced
    case List(1, _*) => // list of arbitrary length - advanced
    case 1 :: List(_) => // infix pattern
    case List(1,2,_) :+ 42 => "lala"// infix pattern
  }

  // 6 - type specifiers
  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => // explicit type specifiers
  }

  // 7 - name binding

  // 8 - multi patterns

  // 9 - if guards

  // ALL.

  /*
    Question.
   */

  val numbers = List(1,2,3)
  val numbersMatch = numbers match {
    case listOfStrings: List[String] => "a list of Strings"
    case listOfNumbers: List[Int] => "a list of Numbers"
    case _ => ""
  }

  println(numbersMatch)
  // JVM trick question
}
