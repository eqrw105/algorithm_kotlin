//https://www.acmicpc.net/problem/1032

fun main() {
    val n = readln().toInt()
    val pattern = readln().toCharArray()

    repeat (n-1) { idx ->
        val fileName = readln()
        pattern.forEachIndexed { i, c ->
            if (c != fileName[i]) {
                pattern[i] = '?'
            }
        }
    }
    print(pattern)
}