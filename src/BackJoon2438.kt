//https://www.acmicpc.net/problem/2438

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    (1..n).forEach {
        repeat(it) {
            bw.write("*")
        }
        if (it != n) {
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}