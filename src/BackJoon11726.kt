//https://www.acmicpc.net/problem/11726

/**
 * 아이디어
 * 1 -> 1
 * 2 -> 2
 * 3 -> 3
 * 4 -> 5
 * 5 -> 8
 * a[i] = a[i-2] + a[i-1]
 * a[n] = n번째 경우의 수
 * 시간 복잡도
 * O(n)
 * n = 최대 1000
 */

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val answer = when(n) {
        1 -> 1
        2 -> 2
        else -> {
            val arr = IntArray(n+1) { 0 }
            arr[1] = 1
            arr[2] = 2
            for (i in 3..n) {
                arr[i] = (arr[i-2] + arr[i-1]) % 10_007
            }
            arr[n]
        }
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
}