package net.ikenna.toys.figures          //Top of file syntax. Package clauses at top of file without braces.
package train

class Train3 {
  def driver() = new Bob        //Package net.ikenna.toys.figures  was 'opened up' on line 1, so we can refer to figures.Bob
                                //(defined in relativepaths.scala)
}



object Test {
  def main(args: Array[String]) {
    println(new Train3().getClass.getPackage)   //Output: package net.ikenna.toys.figures.train
  }

}