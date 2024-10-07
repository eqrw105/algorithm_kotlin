//https://www.acmicpc.net/problem/1932
/**
 * 현재 값과 dp[i-1]의 왼쪽, 오른쪽 중 최대값을 더해 dp[i]에 저장한다.
 * 시간복잡도
 * O(N^2)
 */
import kotlin.math.max
import java.util.StringTokenizer
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = Array(n) { row ->
        when(row) {
            0 -> {
                val num = br.readLine().toInt()
                IntArray(1) { num }
            }
            else -> {
                val numSt = StringTokenizer(br.readLine())
                IntArray(row+1) {
                    numSt.nextToken().toInt()
                }
            }
        }
    }
    val dp = Array(n) {
        IntArray(arr[it].size)
    }
    dp[0][0] = arr[0][0]

    for (i in 1 until n) {
        for(j in dp[i].indices) {
            val prev = dp.getOrNull(i-1)?.getOrNull(j - 1) ?: 0
            val next = dp.getOrNull(i-1)?.getOrNull(j) ?: 0
            dp[i][j] = max(prev, next) + arr[i][j]
        }
    }

    bw.write(dp[n-1].max().toString())
    bw.flush()
    bw.close()
}