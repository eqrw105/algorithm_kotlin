//https://www.acmicpc.net/problem/9498

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    val answer = when {
        n >= 90 -> "A"
        n >= 80 -> "B"
        n >= 70 -> "C"
        n >= 60 -> "D"
        else -> "F"
    }
    bw.write(answer)
    bw.flush()
    bw.close()
}