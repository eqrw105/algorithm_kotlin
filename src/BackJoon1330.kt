//https://www.acmicpc.net/problem/1330

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = br.readLine().split(" ").map(String::toInt)

    val answer = when {
        a > b -> ">"
        a < b -> "<"
        else -> "=="
    }

    bw.write(answer)
    bw.flush()
    bw.close()
}