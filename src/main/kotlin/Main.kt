fun main() {
    // Testing
    printMsg("Hello, Kotlin")
    printMsg("This is pretty cool")
    printMsg(square(3))

    val testArray = arrayOf(1, 2, 3, 4, 5, 6)
    println(testArray.contentToString())
    print("The index of \"2\" is: ")
    printMsg(linearSearch(testArray, 2))
}

fun printMsg(msg: String) {
    // Prints a string to standard output
    println(msg)
}

fun printMsg(msg: Int) {
    // Overloaded: prints an integer to standard output
    println(msg)
}

fun square(num: Int): Int {
    // Returns the square of an integer number
    return num * num
}

fun linearSearch(theArray: Array<Int>, key: Int): Int {
    // Simple linear search
    for (i in 0..theArray.size) {
        if (theArray[i] == key) {
            return i
        }
    }

    return -1
}
