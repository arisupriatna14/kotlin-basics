package basics

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val filterNumber = numbers.filter { x -> x > 2 }
    println(filterNumber)

    val numberEven = listOf(2, 4, 6, 8)
    val filterNumberEvent = numberEven.filter { it > 4 }
    println(filterNumberEvent)
}