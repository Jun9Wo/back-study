//fun main() {
//    var isTrue : Boolean = true
//    if (isTrue) {
//        println("참")
//    } else {
//    println("코드 로직")
//    }
//
//

//fun main() {
//    var a: Int = 10
//    if (a == 10) {
//        println(10)
//    } else if (a == 5) {
//        println(5)
//    } else {
//        println("코드 로직")
//    }
//}

fun main() {
    var a : Int = 9
    when(a) {
        10 -> {
            println(10)
        }
        8 -> {
            println(8)
        }
        5 -> {
            println(5)
        } else -> {
            println("없음")
        }
    }
}
