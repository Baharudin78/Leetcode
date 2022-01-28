fun main() {
//    var number = intArrayOf(4,3,6,23,6,4,4)
//    insertionShortInt(number)

//    var nama = arrayOf("baharudin", "raya", "kampang", "ilyas", "budi")
//    insertionShortInt(nama)

    var ipk = doubleArrayOf(2.4, 5.5, 9.5, 3.2, 6.5, 3.5)
    insertionSortDouble(ipk)
}
fun insertionShortInt(arr : Array<String>) {
    println("== SEBELUM ===")
    arr.forEach {
        print("$it , ")
    }

    //Logic in Integer
//    for (i in 1 until arr.size) {
//        for (j in i until arr.size) {
//            if (arr[j] < arr[j -1]) {
//                var tampungan = arr[j]
//                arr[j] = arr[j-1]
//                arr[j - 1] = tampungan
//            }
//        }
//    }
    //Logic in String
    for (i in 1 until arr.size) {
        for (j in i downTo 1) {
            if (arr[j] < arr[j-1]) {
                var tampung = arr[j]
                arr[j] = arr[j - 1]
                arr[j-1] = tampung
            }
        }
    }
    //logic in double


    println("== \nSESUDAH ===")
    arr.forEach {
        print("$it , ")
    }

}

//fungtion in souble
fun insertionSortDouble(arr : DoubleArray) {
    println("==SEBELUM==")
    arr.forEach {
        print("$it, ")
    }
//logic untuk double
    for (i in 1 until arr.size) {
        var ipkNow = 0.0
        for (j in i downTo 1) {
            if (arr[j] > arr[j-1]) {
                //change value
                val tampung = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = tampung
            }
        }
    }
    println("==\nSESUDAH==")
    arr.forEach {
        print("$it, ")
    }
}