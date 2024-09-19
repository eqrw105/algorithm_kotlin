//https://www.acmicpc.net/problem/1463

import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val dp = IntArray(n+1)

    for (i in 2..n) {
        dp[i] = dp[i - 1] + 1

        if (i % 2 == 0) {
            dp[i] = min(dp[i / 2] + 1, dp[i])
        }
        if (i % 3 == 0) {
            dp[i] = min(dp[i / 3] + 1, dp[i])
        }
    }

    bw.write(dp[n].toString())
    bw.flush()
    bw.close()
}