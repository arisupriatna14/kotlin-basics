package basics

fun main() {
    PrintFullName("Ari Supriatna")
    addNumbers(12, 4)
}

fun PrintFullName(name: String) {
    print(name)
}

fun addNumbers(a: Int, b: Int) {
    var sum = a + b
    print(sum)
}