import org.junit.Test

class PalindromTest {
    fun palindromTest(value : String) : Boolean {

        for (i in 0 until value.length) {
            var indexAwal = i
            var indexAkhir = value.length -i -1
            if (value[indexAwal] != value[indexAkhir]) {
                return false
            }
        }
//        var temp = ""
//        for (i in (value.length -1)downTo 0) {
//            temp += value[i]
//        }
//        if (value.equals(temp, ignoreCase = true)) {
//            print("$value is palindrom")
//        }else {
//            print("$value is not palindrom")
//        }
//        return temp.equals(value)
        return true
    }
    @Test
    fun palindrom() {
        palindromTest("kodcok")
    }
}