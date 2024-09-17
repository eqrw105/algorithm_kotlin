//https://www.acmicpc.net/problem/10952
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true) {
        val (a, b) = br.readLine().split(" ").map(String::toInt)
        if (a == 0 && b == 0) {
            break
        }
        bw.write(a.plus(b).toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}