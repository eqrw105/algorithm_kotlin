//https://www.acmicpc.net/problem/2839

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt()

    var answer = 0
    while(n > 0) {
        if (n % 5 == 0) {
            answer += n.div(5)
            break
        } else {
            n -= 3
            answer++
        }
        if (n < 0) {
            answer = -1
        }
    }

    bw.write(answer.toString())
    bw.flush()
    bw.close()
}