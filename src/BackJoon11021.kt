//https://www.acmicpc.net/problem/11021

import java.util.StringTokenizer

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val t = br.readLine().toInt()

    repeat(t) { idx ->
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("Case #${idx+1}: ${a+b}\n")
    }
    bw.flush()
    bw.close()
}