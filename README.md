Youtube playlist:
https://www.youtube.com/watch?v=sby4rxdmabI&list=RDCMUCRS4DvO9X7qaqVYUW2_dwOw&start_radio=1&rv=sby4rxdmabI&t=1
First:
- Download the IDE -- he suggested intellij, but I will use vscode
- go to the website:  
      github.com/rockthejvm


I will not use the git repository. 

The theoretical minimum to create a scala application is:
1. the `sbt` file with the following lines
```Scala
name := "my-application-name"
version := "0.1"
scalaVersion := "2.13.1"
```
2. the `Main.scala` or `Playground.scala` containing 
```Scala
package com.gianfree

object Playground extends App {
  println("I'm learning Scala")
}
```
To compile and run the code, you can either `Ctrl-F5` or launch the the app with `run` in VSCode.