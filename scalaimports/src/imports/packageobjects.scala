package net.ikenna.toys

package object trains {
  /* Package objects are a good place to put utility functions and fields that apply to the package*/
  def  move = println("choo choo choo")

  /*On a real project, this package object would be in file net/ikenna/toys/trains/package.scala */
}


class Train4 {
    def moveTrain = move
  }

  object Test{
    def main(args: Array[String]) {
      new Train4().moveTrain
    }
  }

