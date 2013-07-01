
package net{                    // packaging with the curly brace syntax. Nested packages.
  package ikenna{
    package books{
      class TomSawyer{
        def title() = println("Tom Sawyer")
      }
    }
    package toys {
      package trains{
        class Thomas{
          def name = "Thomas the tank engine"
        }
        class Tanya {
          def name = "Tanya the train"
        }
        class Ted {
          def name = "Ted the train"
        }

      }
      package figures{

      class Bob {
            def build() = {
              print("Bob the Builder is building ");
              println("rails for " +  new trains.Thomas().name)}   //Relative package paths - you don't need the
                                                                   // absolute path -  net.ikenna.toys.trains.Thomas- like in Java.
                                                                   //Note that package in net.ikenna.toys.trains is visible to Bob.
                                                                   //This would not be so if you were using chained packages.

          }
      }
    }
  }
}

package test {


object ToysTest{
    def main(args: Array[String]){
      import net.ikenna.toys.figures.Bob   // Import statements can appear anywhere
      new Bob().build()

      import net.ikenna.toys.trains.{Thomas => TheTank} // Using import selectors to rename imported members
      println("Hello " + new TheTank().name)
    }
  }

  object ToysTest2{
    def main(args: Array[String]){
      import net.ikenna.toys.trains.{Ted => _, _}   //Import all the trains except Ted
      println(new Thomas().name)
      println(new Tanya().name)
//      println(new Ted().name)     Wouldn't compile
    }
  }
}

