package basics

fun main(args: Array<String>) {
//    var streetNumber = 90
//    var streetName = "Street Gallery"
//    streetName = "High Street"
//
//    val myLong = 10L

    val myInt = 100
    val myLongAgain: Long = myInt.toLong()

    println(args.size)
    print(myLongAgain)

    val myName: String? // question mark
    myName = null
    println(myName)
}