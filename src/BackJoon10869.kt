//https://www.acmicpc.net/problem/10869
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = br.readLine().split(" ").map(String::toInt)

    bw.write((a + b).toString())
    bw.newLine()
    bw.write((a - b).toString())
    bw.newLine()
    bw.write((a * b).toString())
    bw.newLine()
    bw.write((a / b).toString())
    bw.newLine()
    bw.write((a % b).toString())
    bw.flush()
    bw.close()
}