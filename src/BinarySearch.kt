fun main() {

//    var nilai = intArrayOf(3,4,6,7,9,56,67,89,90)
//    binarySearchInt(nilai, 9)
    var nama = arrayOf("Baharudin", "fargan", "nova", "muri")
    binartSearchString(nama, "nova")
}
fun binarySearchInt(nilai : IntArray , keyWord : Int) {
    var low = 0
    var high = nilai.size - 1
    var medium : Int
    var status = false

    while (low <= high) {
        medium = (low + high) / 2
        if (nilai[medium] == keyWord) {
            print("$keyWord ditemukan di index $medium")
            status = true
            break
        }else {
            if ( keyWord > nilai[medium]) {
                low = medium + 1
            }else {
                high = medium - 1
            }
        }
    }//akhir while
    if (status == false) {
        print("$keyWord tidak ditemukan")
    }
}

fun binartSearchString(nama: Array<String>, keyWord : String){
    var low = 0
    var high = nama.size -1
    var med = 0
    var status = false

    while (low <= high) {
        med = (low + high) / 2
        if (nama[med].equals(keyWord, ignoreCase = true)) {
            print("$keyWord telah ditemukan di index ke $med")
            status = true
            break
        }else {
            if (keyWord > nama[med]) {
                low = med + 1
            }else {
                high = med -1
            }
        }
    }//akhir while
    if (status == false) {
        print("$keyWord tidak ditemukan")
    }
}