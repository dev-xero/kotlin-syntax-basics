import kotlin.random.Random

class PhraseOMatic {
    private val phraseArrayOne = arrayOf("a 24/7", "a multi-tier", "a B-to-B", "a dynamic", "a pervasive")
    private val phraseArrayTwo = arrayOf("empowered", "leveraged", "aligned", "targeted")
    private val phraseArrayThree = arrayOf("process", "paradigm", "solution", "portal", "vision")

    fun makePhrase(): String {
        val lenOne = phraseArrayOne.size
        val lenTwo = phraseArrayTwo.size
        val lenThree = phraseArrayThree.size

        val phraseOne = phraseArrayOne[Random.nextInt(lenOne)]
        val phraseTwo = phraseArrayTwo[Random.nextInt(lenTwo)]
        val phraseThree = phraseArrayThree[Random.nextInt(lenThree)]

        return "What we need is $phraseOne $phraseTwo $phraseThree"
    }

}