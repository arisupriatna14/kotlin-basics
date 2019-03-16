package basics

fun main() {
    for (i in 1..5) { // includes 5
        println("Number $i")
    }

    for (i in 1 until 5) { // not include 5
        println("Number with loop until: $i")
    }

    for (i in 1..10 step 3) {
        println("Number with loop step: $i")
    }

    for (i in 10 downTo 5) {
        println("Number with loop downTo: $i")
    }

    val x = 9

    if (x in 1..10) {
        println("Masuk if brur")
    }
}