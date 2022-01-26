fun main() {
//    var bilangan = intArrayOf(4,3,5,6,3)
//    print(selectionSortInt(bilangan))

//    var nama = arrayOf("Farhan"," "," Farras", " ", " Baharudin", " ", " Budi")
//    print(selectionSortString(nama))

    var ipk = doubleArrayOf(1.5, 1.3, 9.5, 4.9, 5.3)
    print(selectionSortDouble(ipk))
}
// fungtion untuk tipe data integer
fun selectionSortInt(arr : IntArray) {
    println("==SEBELUM==")
    arr.forEach {
        print(it)
    }
    println()

    //logic
    for (i in 0 until arr.size) {
        var indexArray = i
        for (j in i until arr.size) {
            if (arr[indexArray] < arr[j]) {
                indexArray = j
            }
        }
        //tukar nilai
        var tampungan = arr[i]
        arr[i] = arr[indexArray]
        arr[indexArray] = tampungan
    }

    println("==SESUDAH==")
    arr.forEach {
        print(it)
    }
    println()
}

// fungtion untuk selection tipe data string
fun selectionSortString(kata : Array<String>) {
    println("==SEBELUM==")
    kata.forEach {
        print(it)
    }
    println()

    //Logic
    for (i in 0 until kata.size) {
        var indexArray = i
        for (j in i until kata.size) {
            if (kata[indexArray].compareTo(kata[j]) < 0) {
                indexArray = j
            }
        }
        var tampungKata = kata[i]
        kata[i] = kata[indexArray]
        kata[indexArray] = tampungKata
    }

    println("==SESUDAH==")
    kata.forEach {
        print(it)
    }
    println()
}

//fungtion utuk tipe data double
fun selectionSortDouble(nilai : DoubleArray) {
    println("==Sebelum==")
    nilai.forEach {
        print(it)
    }
    println()

    //Loogic
    for (i in 0 until nilai.size) {
        var indexDouble = i
        for (j in i until nilai.size) {
            if (nilai[indexDouble] < nilai[j]) {
                indexDouble = j
            }
        }
        var tampungDouble = nilai[i]
        nilai[i] = nilai[indexDouble]
        nilai[indexDouble] = tampungDouble
    }

    println("==sesudah==")
    nilai.forEach {
        print(it)
    }
    println()

}