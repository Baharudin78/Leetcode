package hackerearth

fun main() {
    println("== Unsorted Item ==")
    val number = listOf(3,5,3,7,4,7,8,9)
    print(number)

    println("\n== Sorted Item ==")
    val  sorted = quickSortInt(number)
    print(sorted)
}
fun quickSortInt(items : List<Int>) : List<Int> {
    /*
     cek apakah item nya lebih dari 2 atau tidak, jika hanya 1
     maka tidak di urutkan lagi
     */
    if (items.count() < 2) {
        return items
    }
    //mencari nilai pivod dari tengah array
    val pivot = items[items.count() / 2]
    val equals = items.filter {
        it == pivot
    }
    //mencari nilai lebih kecil dari pivod
    val less = items.filter { it < pivot }
    //nilai lebih besar dari pivod
    val greater = items.filter { it > pivot }
    return quickSortInt(less) + equals + quickSortInt(greater)
}
 