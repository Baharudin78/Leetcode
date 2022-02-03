import org.junit.Assert
import org.junit.Test

class Faktorial {
    //rekursif
    fun numberFaktorialRekursive(num : Int) : Int {
        if (num <= 0) {
            return 1
        }else
            return num * numberFaktorialRekursive(num -1)
    }

    //tail rekursive
    fun numberFaktorialTail(total : Int, value: Int) : Int {
        if (value <= 0) {
            return total
        }else {
            return numberFaktorialTail(total * value, value-1)
        }
    }

    //looping
    fun numberFaktorial(num : Int) : Int{
        if (num <= 0) {
            return 1
        }
        var result = 1
        for (i in num downTo 1) {
            result *= i
        }
        return result
    }
    @Test
    fun faktorialNum() {
        Assert.assertEquals(1, numberFaktorial(1))
        Assert.assertEquals(2, numberFaktorial(2))
        Assert.assertEquals(6, numberFaktorial(3))
        Assert.assertEquals(24, numberFaktorial(4))
        Assert.assertEquals(120, numberFaktorial(5))
    }

    @Test
    fun faktorialNumRek() {
        Assert.assertEquals(1, numberFaktorialRekursive(1))
        Assert.assertEquals(2, numberFaktorialRekursive(2))
        Assert.assertEquals(6, numberFaktorialRekursive(3))
        Assert.assertEquals(24, numberFaktorialRekursive(4))
        Assert.assertEquals(120, numberFaktorialRekursive(5))
    }

    @Test
    fun faktorialNumTail() {
        Assert.assertEquals(1, numberFaktorialTail(1,1))
        Assert.assertEquals(2, numberFaktorialTail(1,2))
        Assert.assertEquals(6, numberFaktorialTail(1,3))
        Assert.assertEquals(24, numberFaktorialTail(1,4))
        Assert.assertEquals(120, numberFaktorialTail(1,5))
    }
}