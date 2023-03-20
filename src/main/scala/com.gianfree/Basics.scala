package com.gianfree

object Basics  extends App {

  // defining a value
  val meaningOfLife: Int = 42

  val aBoolean = false
 
  val aString = "ciao"
  val aComposedString: String = "i" + " " + "love"
  val interpolatedString = s"lol is $meaningOfLife" 

  // code blocks
  val aCodeBlock = {
    val aLocalValue = 67

    // need to return something
    aLocalValue + 3
  }


  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  def factorial(n: Int): Int =
    if (n<= 1) 1
    else n*factorial(n-1)

  
  // In scala we don't use loop or interation, they use RECURSION

  

}
