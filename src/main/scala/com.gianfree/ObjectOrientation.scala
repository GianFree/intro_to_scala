package com.gianfre

object ObjectOrientation extends App {

  // notion of class
  class Animal {
    val age: Int = 0
    def eat() = println("I'm eating")
  }
  // instance, and is denoted by `new`
  val anAnimal = new Animal

  // inheritance `extends Animal`, and constructor definition `(name: String)`
  class Dog(val name: String) extends Animal 
  val aDog = new Dog("Lassie")

  // constructor arguments are NOT fields
  // aDog.name -> complaing, you need `class Dog(val name: String) extends Animal

  // no complain, since in the constructor we used `val`
  aDog.name

  //subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Hachi")
  aDeclaredAnimal.eat() // the most derived method will be called at runtime

  // abstract class
  abstract class WalkingAnimal {
    val hasLegs = true // by default public, can restict with `private` or `protected`
    // private: only the class has access to the method
    // protected: the class and descendants have access to the method
    def walk(): Unit // not providing any implementation
  }

  // "interface" = ultimates abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher { 
    def ?!(thought: String): Unit // valid method name
  }

  // a class can extends only 1 class and how many traits we want
  class Crocodile extends Animal with Carnivore with Philosopher {

    override def ?!(thought: String): Unit = println(s"I was thinking: $thought")

    override def eat(animal: Animal): Unit = println("I am eating you, animal!")
    
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // infix notation = object method argument

  aCroc ?! "what if we could fly?" // only available for methods with ONE argument

  // anonymous classes
  val dinosaur = new Carnivore { 
    override def eat(animal: Animal): Unit = println("I am a dinosaur. I can eat everything!")
  }

  // Singleton
  // only instance of the MySingleton type
  object MySingleton { 
    val mySpecialValue  = 343243
    def mySPecialMethod(): Int = 23241
    // special method:
    def apply(x: Int): Int = x + 1
  }


  // with `apply()` I can use:
  MySingleton.apply(65)
  MySingleton(65) 
  // and these are equivalent.


  // COMPANIONS
  object Animal { 
    // dompanions can access each other's private fields/methods
    // singleton Animal adn isntances fo Animale are fifggerent things
    val canLiveIndefinitely = false
  }

  val animalsCanLiveForever = Animal.canLiveIndefinitely 

  /*
  * case class = lightweight data structures with some boilerplate
  * - sensible equals and hash code
  * - serialization
  * - companion with apply  (no need for `new`)
  * - pattern matching
  */
  case class Person(name: String, age: Int)
  val bob = Person("Bob", 34)


// GENERICS
abstract class MyList[T]{
  def head: T
  def tail: MyList[T]
}

val aList: List[Int] = List(1,2,3) // List`companionObj`.apply(1,2,3)

}
