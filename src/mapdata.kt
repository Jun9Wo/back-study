//fun main() {
//    var myMap = mapOf(
//        "name" to "빵빵이",
//        "age" to "26",
//        "job" to "backsu"
//    )
//    println(myMap)
//    println(myMap["name"])
//    println(myMap["job"])
//}

fun main() {
    var myMap = mutableMapOf(
        "name" to "빵빵이",
        "age" to "26",
        "job" to "backsu"
    )
    println(myMap)
    println(myMap["name"])
    myMap["name"] = "옥지"
    println(myMap)
}