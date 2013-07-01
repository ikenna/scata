
package net.ikenna {
  class Driver

}
package net.ikenna.toys.trains2 {  //Example of chained packages
  class Train() {
    def trainDriver() = println("Train driver is %s".format(new net.ikenna.Driver)) // When using chained packages,
                                                                                    //class Driver is not visible in Train.
                                                                                    // The absolute package for Driver has to be supplied
                                                                                    //You would not have needed to do this if you
                                                                                    //were using nested packages.
  }

  object Train{
    def main(args: Array[String]){
      new Train().trainDriver()
    }
  }
}

