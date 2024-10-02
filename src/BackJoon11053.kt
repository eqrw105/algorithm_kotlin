//https://www.acmicpc.net/problem/11053

/**
 * 아이디어
 * 2중 for문으로 수열을 순회하면서 이전 수열과 비교하여 큰 경우 길이(dp)의 값을 증가시킨다.
 * 시간복잡도
 * O(N^2)
 */
import java.util.StringTokenizer
import kotlin.math.max

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = IntArray(n)
    val st = StringTokenizer(br.readLine())
    repeat(n) {
        arr[it] = st.nextToken().toInt()
    }

    val dp = IntArray(n) { 1 }
    for (i in 0 until arr.size) {
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }
    bw.write(dp.max().toString())
    bw.flush()
    bw.close()
}