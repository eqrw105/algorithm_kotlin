//https://www.acmicpc.net/problem/9012

import java.io.*
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    repeat(n) {
        val vps = Stack<String>()
        br.readLine().forEach {
            when(it) {
                '(' -> vps.push("(")
                ')' -> {
                    if (vps.isNotEmpty() && vps.peek() == "(") {
                        vps.pop()
                    } else {
                        vps.push(")")
                        return@forEach
                    }
                }
            }
        }
        if (vps.isEmpty()) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}