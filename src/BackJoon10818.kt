//https://www.acmicpc.net/problem/10818

import java.io.*
import java.util.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var min = Int.MAX_VALUE
    var max = -Int.MAX_VALUE

    val st = StringTokenizer(br.readLine())

    repeat(n) {
        val num = st.nextToken().toInt()
        min = min(min, num)
        max = max(max, num)
    }

    bw.write("$min $max")
    bw.flush()
}