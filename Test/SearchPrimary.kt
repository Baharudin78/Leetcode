import org.junit.Test

class SearchPrimary {
    fun whatIsPrimary(num : Int) {
        var cek = 0
        for (i in 2 until num) {
            if (num % i == 0) {
                cek++
            }
        }
        if (cek == 1) {
            println("$num is primary")
        }else {
            println("$num is not primary")
        }
    }
    fun primaryNumber(num : Int) {
        for (i in 0 .. num) {
            var bil = 0
            for (j in 1 until num) {
                if (i % j == 0) {
                    bil += 1
                }
            }
            if (bil == 2) {
                println("$i ")
            }
        }
    }
    @Test
    fun showPrimaryNumber() {
//        whatIsPrimary(3)
        primaryNumber(100)
    }
}

