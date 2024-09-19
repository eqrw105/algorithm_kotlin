//https://www.acmicpc.net/problem/2941

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var str = br.readLine()

    val regex = "c=|c-|dz=|d-|lj|nj|s=|z=".toRegex()
    str = str.replace(regex, "#")

    val count = str.length

    bw.write(count.toString())
    bw.flush()
    bw.close()
}