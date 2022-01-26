fun main() {
   var rows = 5
//    for (i in 1 .. rows) {
//        for (j in 1.. i) {
//             print("$j ")
//        }
//        println()
//    }
    for (i in 0 .. rows) {
        for ( j in 0 .. rows) {
            print("* ")
            if ((i + j) == 4) {
                break
            }
        }
        println()
    }
}