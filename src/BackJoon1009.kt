//https://www.acmicpc.net/problem/1009

fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (a, b) = readln().split(" ").map(String::toInt)
        val num = (1..<b).fold(a) { acc, _ -> acc * a % 10 }
        if (num % 10 == 0) {
            println(10)
        } else {
            println(num % 10)
        }
    }
}