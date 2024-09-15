//https://www.acmicpc.net/problem/10430

fun main() {
    val (a, b, c) = readln().split(" ").map(String::toInt)

    println(a.plus(b) % c)
    println((a % c).plus(b % c) % c)
    println(a.times(b) % c)
    println((a % c).times(b % c) % c)
}