package net.ikenna.toys.trains{

  class Train5{
    private[trains] def move = println("choo choo choo")
    //Scope of protection: private[trains] means move is private to class Train 5 but also visible in package trains.
    // Note that it will not be visible from package toys.
  }

  object TestTrain5{
    def main(args: Array[String]) {
      new Train5().move  /*We are only able to access private method move, because of our scope of protection rule*/
    }
  }
}


package net.ikenna.toys{
  object TestTrain5Again{
    def main(args: Array[String]) {
//      new trains.Train5().move()   // wouldnt compile. Shows Train5.move is not visible from toys
    }
  }
}


/* Also note that in Scala, protected members are only visible to subclasses, not subclasses and packages as in java*/