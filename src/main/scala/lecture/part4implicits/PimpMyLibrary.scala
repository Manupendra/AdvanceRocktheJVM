package lecture.part4implicits

object PimpMyLibrary extends App {

  //2.isPrime

  implicit class RichInt(val value: Int) extends AnyVal {
    def isEven: Boolean = value % 2 == 0

    def sqrt: Double = Math.sqrt(value)

    def times(function: () => Unit) = {
      def timesAux(n: Int): Unit =
        if (n <= 0) ()
        else {
          function()
          timesAux(n - 1)
        }

      timesAux(value)
    }

    def *[T](list: List[T]): List[T] = {
      def concatenate(n: Int): List[T] =
        if (n <= 0) List()
        else concatenate(n - 1) ++ list

      concatenate(value)
    }


  }

  implicit class RicherInt(richInt: RichInt) {
    def isOdd: Boolean = richInt.value % 2 != 0
  }

  new RichInt(42).sqrt

  42.isEven
  //type enrichment = pimping

  1 to 10

  import scala.concurrent.duration._

  3.seconds

  //compiler doesn't do multiple implicit searches.
  //42.isOdd

  implicit class RichString(string: String) {
    def asInt: Int = Integer.valueOf(string) //java.lang.Integer -> Int

    def encrypt(cypherDistance: Int): String = string.map(c => (c + cypherDistance).asInstanceOf[Char])
  }

  println("3".asInt + 4)
  println("John".encrypt(2))

  println(() => println("Scala Rocks!"))
  println(4 * List(1, 2))

}
