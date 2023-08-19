import scala.io.StdIn.readLine
import scala.util.control.Breaks._ // Import for using break statements

// Define a class named 'Number' with a constructor that takes an integer 'num'
class Number(var num: Int) {

  // Define a method 'Sum' that takes another 'Number' object as input
  // The method calculates the sum of 'num' of the current object and the input object
  // Returns the result as an integer
  def Sum(x: Number): Int = {
    return x.num + this.num; // Use 'this.num' instead of 'self.num'
  }

}

// The main object of the program
object Main {
  def main(args: Array[String]): Unit = {

    // Create two instances of the 'Number' class with initial values
    var s1 = new Number(12)
    var s2 = new Number(5)

    // Call the 'Sum' method on 's1' with 's2' as an argument and print the result
    println(s1.Sum(s2)) // Use 'println' to print the result

  }
}
