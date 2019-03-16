package basics

fun main() {
    var name = "Ari"

    when(name) {
        "Ari" -> print("Yes, I'm Ari")
        "Yogi" -> print("Yes, I'm Yogi")
        else -> print("No name")
    }
}