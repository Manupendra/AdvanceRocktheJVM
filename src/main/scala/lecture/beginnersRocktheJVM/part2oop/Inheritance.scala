package lecture.beginnersRocktheJVM.part2oop

object Inheritance extends App {

  // single class Inheritance
  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idcard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType = "domestic"
    override def eat= {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (board: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overriding vs overloading

  // super

  // preventing overrides
  // 1. keyword final on member
  // 2. keyword final on the entire class
  // 3. seal the class - extend class in THIS FILE, prevent extension in other files

}
