//https://www.acmicpc.net/problem/1427
/**
 * 아이디어
 * 입력받은 정수를 배열로 변경 후 내림자순 정렬
 * 시간복잡도
 * O(n log n)
 */
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine()
    val arr = n.toCharArray().sortedDescending()
    bw.write(arr.joinToString(""))
    bw.flush()
    bw.close()
}