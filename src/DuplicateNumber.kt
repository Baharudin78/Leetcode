fun main() {
    val number = listOf(2,5,4,5,5,6,3,4)
    println(findDuplicateNumber(number))
}
fun findDuplicateNumber(number: List<Int>): Int {
    var result = 0
    for (element in number) {
        result = result xor element
    }
    return result
}
