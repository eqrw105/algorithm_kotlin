//https://www.acmicpc.net/problem/9095
/**
 * 아이디어
 * n = n-1의 경우의 수 + n-2의 경우의 수 + n-3의 경우의 수
 * dp로 앞의 경우의 수를 저장하여 계산
 * 시간 복잡도
 * O(N)
 */

import java.util.*
import kotlin.math.max

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val arr = IntArray(n+1)
        when(n) {
            1 -> bw.write("1 \n")
            2 -> bw.write("2 \n")
            3 -> bw.write("4 \n")
            else -> {
                arr[1] = 1
                arr[2] = 2
                arr[3] = 4

                for (i in 4..n) {
                    arr[i] = arr[i-1] + arr[i-2] + arr[i-3]
                }
                bw.write("${arr[n]} \n")
            }
        }
    }

    bw.flush()
    bw.close()
}