fun main() {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!

        val result = alternatingCharacters(s)

        println(result)
    }
}
fun alternatingCharacters(s: String): Int {
    var count = 0
    for (i in 1 until s.length) {
        if (s[i - 1] == s[i]) {
            count++
        }
    }
    return count
}