import kotlin.random.Random

class PhraseOMatic {
    private val phraseOne = arrayOf("a 24/7", "a multi-tier", "a B-to-B", "a dynamic", "a pervasive")
    private val phraseTwo = arrayOf("empowered", "leveraged", "aligned", "targeted")
    private val phraseThree = arrayOf("process", "paradigm", "solution", "portal", "vision")

    fun makePhrase(): String {
        val lenOne = phraseOne.size
        val lenTwo = phraseTwo.size
        val lenThree = phraseThree.size

        val phraseOne = Random.nextInt(lenOne)
        val phraseTwo = Random.nextInt(lenTwo)
        val phraseThree = Random.nextInt(lenThree)

        return "What we need is $phraseOne $phraseTwo $phraseThree"
    }
}