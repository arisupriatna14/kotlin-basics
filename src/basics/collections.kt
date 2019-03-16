package basics

fun main() {
    val fruits = listOf("banana", "avocado", "apple", "kiwi")

    fruits
        .filter { it.startsWith("c") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}