fun main() {

    var nama = arrayOf("Baharudin, farhan, nova, muri")
    sequetialSearchString(nama, "nova")

//    var arr = intArrayOf(3,5,6,7,8,9,1,2,10)
//    var key = 9
//    sequentialSearchInt(arr, key)
}

fun sequetialSearchString(nama : Array<String>, keyWord : String)  {
    var status = false
    for (i in nama.indices) {
        if (nama[i] == keyWord){
            println("Nama $keyWord telah ditemukan di index ke- $i")
            status = true
        }
    }
    if (!status) {
        println("Nama $keyWord tidak ditemukan")
    }
}

fun sequentialSearchInt(arr : IntArray, key : Int) {
    var status = false
    for (i in arr.indices) {
        if (arr[i] == key) {
            status = true
            println("$key telah ditemukan di index ke- $i")
            break
        }
    }
    if (!status) {
        println("$key tidak ditemukan")
    }
}