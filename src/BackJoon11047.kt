//https://www.acmicpc.net/problem/11047
/**
 * 아이디어
 * for문을 가장 큰 동전부터 나눈 몫을 카운트하고 남은 금엑은 나머지로 변경한다.
 * 시간복잡도
 * O(n)
 */

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    var k = st.nextToken().toInt()
    val coins = IntArray(n)
    repeat(n) {
        coins[n - it - 1] = br.readLine().toInt()
    }

    var count = 0
    for (i in coins) {
        count += k / i
        k %= i
    }
    bw.write(count.toString())
    bw.flush()
    bw.close()
}