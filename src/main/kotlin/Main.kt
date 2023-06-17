fun main() {
    // Testing
    printMsg("Hello, Kotlin")
    printMsg("This is pretty cool")
    printMsg(square(3))

    val testArray = arrayOf(1, 2, 3, 4, 5, 6)

    println(testArray.contentToString())
    print("The index of \"2\" is: ")
    printMsg(linearSearch(testArray, 2))

    print("The index of \"5\" is: ")
    printMsg(binarySearch(testArray, 2))

    print("The index of \"4\" is: ")
    printMsg(recursiveBinarySearch(testArray, 4, 0, testArray.size - 1))
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

fun binarySearch(theArray: Array<Int>, key: Int): Int {
    // Returns the index of key in the array if present
    var left = 0
    var right = theArray.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (theArray[mid] == key) {
            return mid
        }

        if (theArray[mid] > key) {
            right = mid - 1
            continue
        }

        left = mid + 1
    }

    return -1
}

fun recursiveBinarySearch(theArray: Array<Int>, key: Int, left: Int, right: Int): Int {
    if (left > right)
        return -1

    val mid = left + (right - left) / 2

    if (theArray[mid] == key)
        return mid

    if (theArray[mid] > key)
        return recursiveBinarySearch(theArray, key, left, mid - 1)

    return recursiveBinarySearch(theArray, key, mid + 1, right)
}