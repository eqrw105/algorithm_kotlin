//https://www.acmicpc.net/problem/10816
/**
 * Map 자료구조에 count를 +1씩 한다.
 * 입력된 정수를 키로 갖는 값을 출력한다.
 * 시간복잡도
 * O(N+M)
 */
import java.util.StringTokenizer
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val nSt = StringTokenizer(br.readLine())
    val map = mutableMapOf<Int, Int>()
    repeat(n) {
        val num = nSt.nextToken().toInt()
        map[num] = (map[num] ?: 0) + 1
    }
    val m = br.readLine().toInt()
    val mSt = StringTokenizer(br.readLine())
    repeat(m) {
        val num = mSt.nextToken().toInt()
        bw.write("${map[num] ?: 0} ")
    }
    bw.flush()
    bw.close()
}