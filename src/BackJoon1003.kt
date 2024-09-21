//https://www.acmicpc.net/problem/1003

/**
 * //0 -> 1 0
 * //1 -> 0 1
 * //2 -> 1 1
 * //3 -> 1 2
 * //4 -> 2 3
 * //5 -> 3 5
 * //6 -> 5 8
 * 아이디어
 * zero[i] = one[i-1]
 * one[i] = zero[i-1] + one[i-1]
 * 시간 복잡도
 * O(n)
 */

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val zero = IntArray(n+1)
        val one = IntArray(n+1)
        zero[0] = 1
        one[0] = 0
        when(n) {
            0 -> bw.write("1 0\n")
            else -> {
                for (i in 1..n) {
                    zero[i] = one[i-1]
                    one[i] = zero[i-1] + one[i-1]
                }
                bw.write("${zero[n]} ${one[n]}\n")
            }
        }
    }
    bw.flush()
    bw.close()
}