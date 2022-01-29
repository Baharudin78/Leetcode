package hackerearth

fun main() {

}
fun maximumToys(prices: Array<Int>, k: Int): Int {
    var count = 0
    var sum = 0
    prices.sort()
    for (i in prices.indices) {
        if (sum + prices[i] <= k) {
            sum += prices[i]
            count++
        }
    }
    return count
}