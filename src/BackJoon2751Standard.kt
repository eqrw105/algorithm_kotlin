//https://www.acmicpc.net/problem/2751
//표준 라이브러리

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        val v = br.readLine().toInt()
        list.add(v)
    }

    for (i in list.sorted()) {
        bw.write(i.toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}