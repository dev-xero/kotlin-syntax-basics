import org.testng.Assert.assertFalse
import org.testng.Assert.assertTrue
import org.testng.annotations.Test

class TestRockPaperScissors {
    private val game = RockPaperScissors()
    @Test
    fun testUserBeatsCPU() {
        val userGuess = "scissors"
        val cpuGuess = "paper"

        assertTrue(game.testUserGuess(userGuess, cpuGuess))
    }

    @Test
    fun testCorrectedGuess() {
        var userGuess = "r"
        assertFalse(game.testCorrectedGuess(userGuess) == "scissors")

        userGuess = "s"
        assertTrue(game.testCorrectedGuess(userGuess) == "scissors")
    }
}