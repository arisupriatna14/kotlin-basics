package basics

fun main(args: Array<String>) {
    val fruits = listOf("Banana", "Apple", "Orange")

    for (item in fruits) {
        println("This is a $item")
    }

    val arrayNumbers = intArrayOf(1, 3, 5, 7, 9)
    // menggunakan withIndex()
    for ((index, value) in arrayNumbers.withIndex()) {
        println("Bilangan $value adalah index ke-$index")
    }
    // menggunakan indices()
    for (index in arrayNumbers.indices) {
        println("Bilangan ${arrayNumbers[index]} adalah index ke-$index")
    }
}