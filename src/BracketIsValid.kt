import java.util.*

fun main() {
    var s = "{()}))"
    println(isVaildH(s))
}
fun isVaildH(str: String): Boolean {
    var stack = Stack<Char>()
    for (c in str) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c)
        } else {
            if (stack.isEmpty()) {
                return false
            }
            var top = stack.pop()
            if (c == ')' && top != '(') {
                return false
            }
            if (c == ']' && top != '[') {
                return false
            }
            if (c == '}' && top != '{') {
                return false
            }
        }
    }
    return stack.isEmpty()
}
