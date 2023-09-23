import scala.::
import scala.annotation.tailrec

val l1 = List(1,2,3)
val l2 = List(3,4,5)

l1.intersect(l2)
val commonEle: PartialFunction[Int,Int] ={
  case x if l2.contains(x) => x
}

l1.collect(commonEle)
val s1 = Set(1,2,3)
s1(3)

def palindrome(str: String): Boolean = {
  @tailrec
  def checkPalindrome(low:Int,high:Int):Boolean ={
    if(high <= low) true
    else if (str.charAt(low)!= str.charAt(high)) false
    else checkPalindrome(low+1,high-1)
  }
  checkPalindrome(0,str.length-1)
}

palindrome("abcba")

class MyList[+A] {
  // use the type A
  def add[B >: A](element: B): MyList[B] = ???
  /*
    A = Cat
    B = Animal
   */
}

class MyMap[Key, Value]

val listOfIntegers = new MyList[Int]
val listOfStrings = new MyList[String]

// generic methods
//object MyList {
//  def empty[A]: MyList[A] = ???
//}
//val emptyListOfIntegers = MyList.empty[Int]

// variance problem
// (don't stress about it)
class Animal
class Cat extends Animal
class Dog extends Animal

// 1. yes, List[Cat] extends List[Animal] = COVARIANCE
class CovariantList[+A]
val animal: Animal = new Cat
val animalList: CovariantList[Animal] = new CovariantList[Cat]
// animalList.add(new Dog) ??? HARD QUESTION => we return a list of Animals

// 2. NO = INVARIANCE
class InvariantList[A]
val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

// 3. Hell, no! CONTRAVARIANCE
class Trainer[-A]
val trainer: Trainer[Cat] = new Trainer[Animal]

// bounded types
class Cage[A <: Animal](animal: A)
val cage = new Cage(new Dog)

class Car
/*
* Backtracking
*                 [abc]
*                /      \
*               [a]       []
*             /   \
*        [a,b]      [a]   [b]   []
*        /    \      /  \
*     [a,b,c] [a,b] [a,c] [a]
*
* */
