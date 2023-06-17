import kotlin.random.Random

class RockPaperScissors {
    private val options = arrayOf("rock", "paper", "scissors")
    private var guess: String = ""
    private val choiceToBeatMap: Map<String, String> = hashMapOf(
        "scissors" to "paper",
        "paper" to "rock",
        "rock" to "scissors"
    )

    private fun showInstructions() {
        println("This is a basic rock-paper-scissors game.")
        println("The computer will pick one of these and your objective is to guess it correctly.")
        println("You can answer with [R] for rock, [P] for paper or [S] for scissors.")
        println("The game doesn't end until you beat the computer...\n")
    }

    private fun cpuGuess(): String {
        guess = options[Random.nextInt(options.size)]
        return guess
    }

    private fun correctUserGuess(userGuess: String): String {
        return when(userGuess.lowercase()) {
            "r" -> "rock"
            "p" -> "paper"
            "s" -> "scissors"
            else -> ""
        }
    }

    private fun getUserGuess(): String? {
        print("Your Guess: ")
        return readlnOrNull()
    }

    private fun guessBeats(userGuess: String): Boolean {
        return choiceToBeatMap[userGuess] == guess
    }

    private fun endGame(userGuess: String) {
        println("\nYou win! $userGuess beats $guess!")
        println("...The game will end now :3")
    }

    fun startGame() {
        showInstructions()
        cpuGuess()

        while (true) {
            val userGuess = correctUserGuess(getUserGuess() ?: "")
            if (guessBeats(userGuess)) {
                endGame(userGuess)
                break
            } else if (userGuess == guess) {
                println("That's a draw!\n")
                cpuGuess()
            } else {
                println("Nope...${userGuess} doesn't beat $guess\n")
                cpuGuess()
            }
        }
    }

}