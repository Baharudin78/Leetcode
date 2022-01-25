import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = substrCount(n, s)

    println(result)
}

fun substrCount(n: Int, s: String): Long {
    var count = 0L
    for (i in 0 until n) {
        var count1 = 1
        for (j in i + 1 until n) {
            if (s[i] == s[j]) {
                count1++
            }
        }
        if (s[i] == s[i + 1]) {
            count1++
        }
        count += count1
    }
    return count
}