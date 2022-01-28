fun main() {
    var number = intArrayOf(2,5,3,5,6,8,9)
    print(sumArray(number))
}
fun sumArray(arr : IntArray) : Int {
    var sum = 0
    for (number in arr) {
        sum += number
    }
    return sum
}