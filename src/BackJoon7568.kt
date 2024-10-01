//https://www.acmicpc.net/problem/7568
/**
 * 아이디어
 * 본인을 제외한 사람들의 수만큼 for문을 돌며 덩치를 비교하여 본인보다 키와 몸무게가 크면 +1한다.
 *
 * 시간복잡도
 * O(N^2)
 */

import java.util.StringTokenizer

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = Array<Pair<Int, Int>>(n) {
        0 to 0
    }
    val rank = IntArray(n) {
        1
    }
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        arr[it] = st.nextToken().toInt() to st.nextToken().toInt()
    }

    repeat(n) { i ->
        repeat(n) { j ->
            if (i != j) {
                val myHeight = arr[i].first
                val myWeight = arr[i].second
                val otherHeight = arr[j].first
                val otherWeight = arr[j].second
                if (myHeight < otherHeight && myWeight < otherWeight) {
                    rank[i]++
                }
            }
        }
    }

    bw.write(rank.joinToString(" "))
    bw.flush()
    bw.close()
}