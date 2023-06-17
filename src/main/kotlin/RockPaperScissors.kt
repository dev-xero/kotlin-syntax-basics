import org.testng.annotations.Test
import kotlin.random.Random

class RockPaperScissors {
    private val options = arrayOf("rock", "paper", "scissors")
    private var guess: String = ""

    private fun showInstructions() {
        println("This is a basic rock-paper-scissors game")
        println("The computer will pick one of these and your objective is to guess it correctly")
        println("You can answer with [R] for rock, [P] for paper or [S] for scissors")
        println("The game doesn't end until you get it right...")
    }

    private fun guess(): String {
        guess = options[Random.nextInt(options.size)]
        return guess
    }

    private fun isCorrectGuess(userGuess: String): Boolean {
        val correctedGuess = when (userGuess.lowercase()) {
            "r" -> "rock"
            "p" -> "paper"
            "s" -> "scissors"
            else -> ""
        }
        return correctedGuess == guess
    }

    private fun getUserGuess(): String? {
        print("Guess: ")
        return readlnOrNull()
    }

    private fun endGame() {
        println("You guessed right!")
        print("The computer picked $guess!")
        print("The game will now end :3")
    }

    fun startGame() {
        showInstructions()
        guess()

        while (true) {
            val userGuess = getUserGuess()
            if (userGuess != null) {
                if (isCorrectGuess(userGuess)) {
                    endGame()
                    break
                }
            }
        }
    }

}