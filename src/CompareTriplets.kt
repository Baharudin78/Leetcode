fun main() {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var result = arrayOf(0, 0)
    for (i in a.indices) {
        if (a[i] > b[i]) {
            result[0]++
        } else if (a[i] < b[i]) {
            result[1]++
        }
    }
    return result
}