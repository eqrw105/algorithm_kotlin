//https://www.acmicpc.net/problem/2579
/**
 * 아이디어
 * 마지막 계단(N)으로부터 N-2 뒤로 갔을 때와 N-3칸 + N-1칸 뒤로 갔을 때 값을 비교하여 최대값을 dp에 추가
 * 시간복잡도
 * O(N)
 */
import kotlin.math.max
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = IntArray(n) {
        br.readLine().toInt()
    }
    val dp = IntArray(n+1)
    dp[1] = arr[0]
    if (n > 1) {
        dp[2] = arr[0] + arr[1]
    }
    for (i in 3..n) {
        dp[i] = max(dp[i-2], dp[i-3] + arr[i-2]) + arr[i-1]
    }
    bw.write(dp[n].toString())
    bw.flush()
    bw.close()
}