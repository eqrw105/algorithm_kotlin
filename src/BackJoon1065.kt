//https://www.acmicpc.net/problem/1065

import java.util.*
import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    var count = 0

    for(i in 1..n) {
        when {
            i < 100 -> count++
            i < 1000 -> {
                val arr = IntArray(3)
                var temp = i
                repeat(arr.size) {
                    arr[it] = temp % 10
                    temp /= 10
                }
                if (arr[1] - arr[0] == arr[2] - arr[1]) {
                    count ++
                }
            }
        }
    }

    bw.write(count.toString())
    bw.flush()
    bw.close()
}