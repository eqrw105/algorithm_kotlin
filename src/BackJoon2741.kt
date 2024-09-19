//https://www.acmicpc.net/problem/2741

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    (1..n).forEach {
        bw.write("$it")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}