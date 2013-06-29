
package net{
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

      }
      package figures{

      class Bob {
            def build() = {
              println("Bob the Builder is building");
              println("rails for " +  new trains.Thomas().name)}   //Relative package paths - you don't need the absolute path -  net.ikenna.toys.trains.Thomas- like in Java
          }
      }



    }
  }
}

package test {

object ToysTest{
  def main(args: Array[String]){
    import net.ikenna.toys.figures.Bob
    new Bob().build()
    }
  }
}

