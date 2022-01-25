fun main() {
    val s = readLine()!!
    val t = readLine()!!
    val result = makeAnagram(s, t)
    println(result)
}
fun makeAnagram(a: String, b: String): Int {
    var count = 0
    val aMap = a.groupingBy { it }.eachCount()
    val bMap = b.groupingBy { it }.eachCount()
    for (key in aMap.keys) {
        if (bMap.containsKey(key)) {
            count += Math.abs(aMap[key]!! - bMap[key]!!)
        } else {
            count += aMap[key]!!
        }
    }
    for (key in bMap.keys) {
        if (!aMap.containsKey(key)) {
            count += bMap[key]!!
        }
    }
    return count
}