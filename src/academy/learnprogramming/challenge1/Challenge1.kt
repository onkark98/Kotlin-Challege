package academy.learnprogramming.challenge1

fun main(args: Array<String>) {
    //Declare two immutable string variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    //Checking equality "==" for checking the structure and "===" for checking the reference
    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    //Declare a mutable variable of type Int and assign a value to it
    var number : Int = 298

    //Declare an immuriable variable of type Any and assign a string to it and use smart casting to print the uppercase version of the string
    val something: Any = "The Any type is the root of the Kotlin class hierarchy"
    if(something is String) {
        println(something.uppercase())
    }

    //Using one line of code, print out the following. Make sure your code is nicely indented
    //    1
    //   11
    //  111
    // 1111

    val pattern = ("""   1
    |  11
    | 111
    |1111""").trimMargin()
    println(pattern)


}