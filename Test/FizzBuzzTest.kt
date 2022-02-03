import org.junit.Test

class FizzBuzzTest {

    fun fizzBuzz(total : Int) {
        for (i in 1 until total) {
            if(i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            }else if (i % 5 == 0) {
                println("Buzz")
            }else if (i % 3 == 0) {
                println("Fizz")
            }else {
                println(i)
            }
        }
    }

    @Test
    fun testFizzBuz() {
        fizzBuzz(100)
    }
}