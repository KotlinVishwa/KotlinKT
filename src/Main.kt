
// Hello, World Program
fun main() {
    println("Hello, World!")
    println("Viswanatha Reddy Nagireddy")

// Variables
    var name: String = "ViShWA"
    println("My Name: " +name)

    val number: Int = 458
    println("My Number: " +number)


// Arithmetic Operaions
    val a = 15.5
    val b = 25.5
    var result: Double

    result = a + b
    println("ADDITION of a and b is $result")

    result = a - b
    println("SUBTRACTION of a and b is $result")

    result = a * b
    println("MULTIPLICATIN of a and b is $result")

    result = a / b
    println ("DIVISION of a and b is $result")

    result = a % b
    println("MODULUS of a and b is $result")

// Another way to do operations
    result = a.plus(b)
    println("$result")

    result = a.minus(b)
    println("$result")

    result = a.times(b)
    println("$result")

    result = a.div(b)
    println("$result")

// Comparisions

    val i = 15
    val j = 10

    val max = if (i > j) {
        println("i is greater than j")
        i
    } else {
        println("j is greater than i")
        j
    }
    println("max value is $max")

//Comments
    /* ABC
    * DEF
    * GHI
    * JKL
     */



}