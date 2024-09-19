//https://www.acmicpc.net/problem/4673

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = (1..10000).toMutableList()

    (1..10000).forEach { num ->
        val dn = num + num.toString().map { it.toString().toInt() }.sum()
        list.remove(dn)
    }

    bw.write(list.joinToString("\n"))
    bw.flush()
    bw.close()
}