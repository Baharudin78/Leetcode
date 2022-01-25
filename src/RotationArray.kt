fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val result = Array(a.size) { 0 }
    for (i in 0 until a.size) {
        result[(i + d) % a.size] = a[i]
    }
    return result
}