fun main() {
    // this function is just like Java's "main()" method, it accepts an array of strings
    printMsg("Hello, Kotlin")
    printMsg("This is pretty cool")
    printMsg(square(3))
}

fun printMsg(msg: String) {
    println(msg)
}

fun printMsg(msg: Int) {
    // function overloading
    println(msg)
}

fun square(num: Int): Int {
    // returns an "Int" data type
    return num * num
}
