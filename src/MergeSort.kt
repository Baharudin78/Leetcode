package hackerearth

fun mergeSort(list: List<Int>) : List<Int> {
    if (list.size <= 1) {
        return list
    }
    val middle = list.size / 2
    //kiri mengambil data dari index ke 0 sampai nilai middle
    val left = list.subList(0, middle)
    //kanan mengambil nilai dari nilai middle sampai sisa panjang list
    val right = list.subList(middle, list.size)
    return merge(mergeSort(left), mergeSort(right))
}
fun merge(left : List<Int>, right : List<Int>) : List<Int> {
    var indexLeft = 0
    var indexRight = 0
    var newList : MutableList<Int> = mutableListOf()
    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        }else {
            newList.add(right[indexRight])
            indexRight++
        }
    }
    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }
    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList
}
fun main() {
    val number = mutableListOf(43, 56, 56, 45, 65 , 43 ,56 ,54 )
    val sortedList = mergeSort(number)
    println("Unsorted list = $number ")
    println("Sorted list = $sortedList")
}