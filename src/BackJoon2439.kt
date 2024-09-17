//https://www.acmicpc.net/problem/2439
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    (1..n).forEach { i ->
        repeat(n) { j ->
            if (j >= n-i) {
                bw.write("*")
            } else {
                bw.write(" ")
            }
        }
        if (i < n) {
            bw.newLine()
        }
    }
    bw.flush()
    bw.close()
}