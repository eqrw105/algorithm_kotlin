//https://www.acmicpc.net/problem/11399
/**
 * 아이디어
 * 배열에 인출에 걸리는 시간을 저장
 * 시간을 기준으로 오름차순 정렬
 * for문으로 누적 시간을 더함
 *
 * 시간복잡도
 * O(n log n)
 */

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val sr = StringTokenizer(br.readLine())
    val arr = IntArray(n)

    repeat(n) {
        arr[it] = sr.nextToken().toInt()
    }

    arr.sort()

    var min = 0
    var cumulativeTime = 0
    for (i in 0 until n) {
        cumulativeTime += arr[i]
        min += cumulativeTime
    }
    bw.write(min.toString())
    bw.flush()
    bw.close()
}