//https://www.acmicpc.net/problem/1149

/**
 * 아이디어
 * for문을 돌면서 i번째 집을 각 색으로 칠했을 때 최소비용을 저장한다.
 * red: blue로 칠했을 때 최소비용과 green으로 칠했을 때 최소비용중 적은 값 + red 값
 * 시간복잡도
 * O(N)
 */

import java.util.StringTokenizer
import kotlin.math.min

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = Array<IntArray>(n) {
        val st = StringTokenizer(br.readLine())
        IntArray(3) {
            st.nextToken().toInt()
        }
    }
    val rDp = IntArray(n)
    val gDp = IntArray(n)
    val bDp = IntArray(n)
    rDp[0] = arr[0][0]
    gDp[0] = arr[0][1]
    bDp[0] = arr[0][2]
    for(i in 1 until n) {
        rDp[i] = min(gDp[i-1], bDp[i-1]) + arr[i][0]
        gDp[i] = min(rDp[i-1], bDp[i-1]) + arr[i][1]
        bDp[i] = min(rDp[i-1], gDp[i-1]) + arr[i][2]
    }
    bw.write(min(rDp[n-1], min(gDp[n-1], bDp[n-1])).toString())
    bw.flush()
    bw.close()
}