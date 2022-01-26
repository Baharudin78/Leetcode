fun main() {
//    var arre = intArrayOf(1,6,3,7,4,7,2,5,7)
//    println(bubbleSortInt(arre))
//
//    var nama = arrayOf("baharudinf"," ", "maullana"," ", "nur"," ", "dea")
//    print(bubbleSortString(nama))

    var karakter = charArrayOf('w',' ','a',' ', 2.toChar(),'l',' ', 'o',' ','p')
    println(bubbleSortChar(karakter))
}

fun bubbleSortInt(arr : IntArray)  {
    println("==SEBELUM SORTING==")
    arr.forEach {
        print(it)
    }

    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    println("\n==SESUDAH SORTING==")
    arr.forEach {
        print(it)
    }


}

fun bubbleSortString(kata : Array<String>) {
    println("==SEBELUM SORTING==")
    kata.forEach {
        print(it)
    }

    for (i in 0 until kata.size - 1) {
        for (j in 0 until kata.size - i - 1) {
            if (kata[j].compareTo(kata[j + 1]) > 0) {
                val temp = kata[j]
                kata[j] = kata[j + 1]
                kata[j + 1] = temp
            }
        }
    }

    println("\n==SESUDAH SORTING==")
    kata.forEach {
        print(it)
    }
}



fun bubbleSortChar(huruf :CharArray) {
    println{"==SEBELUM=="}
    huruf.forEach {
        print(it)
    }
    for ( i in 0 until huruf.size - 1) {
        for ( j in 0 until huruf.size - 1) {
            if (huruf[j] > huruf[j+1]) {
                var tampung = huruf[j]
                huruf[j] = huruf[j + 1]
                huruf[j+ 1] = tampung
            }
        }
    }
    println("==SESUDAH")
    huruf.forEach {
        print(it)
    }
}