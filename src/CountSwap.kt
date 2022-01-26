fun main() {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    countSwaps(a)
}
fun countSwaps(a: Array<Int>): Unit {
    var count = 0
    for (i in 0 until a.size) {
        for (j in 0 until a.size - 1) {
            if (a[j] > a[j + 1]) {
                val temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
                count++
            }
        }
    }
    println("Array is sorted in $count swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size - 1]}")

}
