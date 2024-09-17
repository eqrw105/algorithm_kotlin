//https://www.acmicpc.net/problem/10871
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, x) = br.readLine().split(" ").map(String::toInt)
    val arr = br.readLine().split(" ").filter { it.toInt() < x }

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(arr.joinToString(" "))
    bw.flush()
    bw.close()
}