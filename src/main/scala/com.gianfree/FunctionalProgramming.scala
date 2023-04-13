package `com.gianfree`

object FunctionalProgramming  extends App {
  class Person(name: String) {
    def apply(age: Int) = println(s"I have $age years.")
  }

  val bob = new Person("Bob")
  bob(43)
  // The method apply allows us to use  bob as a function!!!!


  // All scala functions are instances of these function_X types.
  // Function1[T,T] takes 1 arg of typoe T and return a type T
  // You can have up to Function22

  // Function1[Int,Int] === Int => Int


  // higher-order function: function that returns a function
   
}


