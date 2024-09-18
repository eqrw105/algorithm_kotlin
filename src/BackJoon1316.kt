//https://www.acmicpc.net/problem/1316

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    var answer = 0
    repeat(n) {
        val str = br.readLine()
        val set = mutableSetOf<Char>()
        var prevChar: Char? = null
        var isGroupWord = true

        for (c in str) {
            if (c != prevChar) {
                if (set.contains(c)) {
                    isGroupWord = false
                    break
                }
                set.add(c)
            }
            prevChar = c
        }

        if (isGroupWord) {
            answer++
        }
    }
    bw.write(answer.toString())
    bw.flush()
    bw.close()
}