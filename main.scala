import scala.io.StdIn.readLine
import scala.util.control.Breaks._ // Import for using break statements

object Main {
  def main(args: Array[String]): Unit = {

    var turns = 5; // Initialize the number of turns the user has

    val randomNumber = scala.util.Random.nextInt(101) // Generates a random integer between 0 (inclusive) and 101 (exclusive)

    for (x <- 1 to 5) { // Loop for 5 turns
      var input = readLine("Enter a number between 1 and 100... ") // Prompt user for input
      turns = turns - 1; // Decrease the number of turns left

      var guess: Int = input.toInt; // Convert user input to an integer

      if (guess < randomNumber && tries > 0) { // Check if guess is lower than the random number
        println("Random number is greater than your guess, you have this many tries left:")
        println(turns)
      } else if (guess > randomNumber && tries > 0) { // Check if guess is higher than the random number
        println("Random number is less than your guess, you have this many tries left:")
        println(turns)
      } else { // User guessed the correct number
        println("Great Job! You guessed the number, it took you this many tries:")
        println(turns)
        break; // Exit the loop since the user guessed correctly
      }
    }

    println("No more tries left! Actual number:")
    println(randomNumber) // Display the correct random number
  }
}
