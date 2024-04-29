//fun main() {
//    var age: Int?
//    if (age != null) {
//        println(age)
//    }
//}


fun main() {
    var age : Int? = null
    var sum : Int = 0
    if (age != null) {
        sum = age!! + 10
    }
    println(sum)
} //nullsafty 강제로 사용 !!