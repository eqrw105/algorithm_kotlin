//https://acmicpc.net/problem/15649
/**
 * 재귀함수를 깊이가 M일 때 까지 호출
 * 함수에서는 for문으로 방문한 자연수를 제외하고 +1하여 재귀함수를 호출
 */
import java.util.StringTokenizer
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val visited = BooleanArray(n+1)
    val arr = IntArray(m)
    backtracking(0, m, n, visited, arr)
}

private fun backtracking(depth: Int, m: Int, n: Int, visited: BooleanArray, arr: IntArray) {
    if (depth == m) {
        println(arr.joinToString(" "))
        return
    }
    for (i in 1..n) {
        if (!visited[i]) {
            visited[i] = true
            arr[depth] = i
            backtracking(depth+1, m, n, visited, arr)
            visited[i] = false
        }
    }
}