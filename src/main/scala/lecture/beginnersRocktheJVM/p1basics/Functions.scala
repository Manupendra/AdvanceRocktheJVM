package lecture.beginnersRocktheJVM.p1basics

object Functions extends App {
  /*
  * 1. greeting function (name,age) => "Hi, my name is $name and I am $age years old."
  * 2. Factorial function 1*2*3*...n
  * 3. Fibonacci function
  * 4. Test if a number is prime
  * */

  def greeting(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old."
  }

  println(greeting("Manu", 26))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5)) // 120

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(6)) // 1 1 2 3 5 8 13

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  println(17)
}
