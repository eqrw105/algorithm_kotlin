//https://www.acmicpc.net/problem/15650

/**
 * 아이디어
 * DFS를 통해 백트레킹으로 경우의수를 출력한다.
 * for문을 통해 데이터를 하나 고르고 재귀를 호출한다.
 * 데이터를 고를때는 이전보다 큰 값만 고른다.
 * 시간복잡도(N^M)
 */

import java.util.StringTokenizer

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = IntArray(m)
    backtracking(1, n, m, 0, arr, 0)
}

private fun backtracking(start: Int, n: Int, m: Int, depth: Int, arr: IntArray, before: Int) {
    if (depth == m) {
        print("${arr.joinToString(" ")}\n")
        return
    }
    for (i in start..n) {
        if (before < i) {
            arr[depth] = i
            backtracking(start + 1, n, m, depth + 1, arr, i)
        }
    }
}