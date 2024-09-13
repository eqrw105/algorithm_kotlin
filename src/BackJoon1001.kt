//https://www.acmicpc.net/problem/1001
fun main() {
    val (a, b) = readln().split(" ").map(String::toInt)
    print(a.minus(b))
}