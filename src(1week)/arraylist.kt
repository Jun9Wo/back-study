//fun main() {
//    var arr = listOf(1, 2, 3, 4, 5)
//    println(arr)
//    println(arr[0])
//    println(arr[3])
//    println(arr.get(2))
//}

fun main() {
    var arr = mutableListOf(1, 2, 3, 4, 5) //배열을 사용할떄 뮤터블리스트 많이 사용
    println(arr)
    println(arr[0])
    println(arr[3])
    arr[0] = 10
    println(arr)

    arr.removeLast()
    println(arr)
    arr.removeFirst()
    println(arr)
}