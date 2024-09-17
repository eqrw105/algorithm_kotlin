//https://www.acmicpc.net/problem/2588
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num1 = br.readLine().toInt()
    val num2 = br.readLine()

    num2.reversed().forEach {
        val n = it.toString().toInt()
        bw.write(num1.times(n).toString())
        bw.newLine()
    }
    bw.write(num1.times(num2.toInt()).toString())

    bw.flush()
    bw.close()
}