//https://www.acmicpc.net/problem/11651

/**
 * Comparable을 상속받는 class를 생성하고 compareTo 함수 오버라이드
 * y좌표가 같으면 x기 오름차순, 아니면 y좌표 기준 오름차순
 */
import java.util.StringTokenizer

private fun main() {
    data class Position(
        val x: Int,
        val y: Int
    ): Comparable<Position> {

        override fun compareTo(other: Position): Int {
            return if (y == other.y) {
                x.compareTo(other.x)
            } else {
                y.compareTo(other.y)
            }
        }
    }

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = Array<Position>(n) {
        Position(0 , 0)
    }
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        arr[it] = Position(x, y)
    }

    arr.sorted().forEach {
        bw.write("${it.x} ${it.y}\n")
    }
    bw.flush()
    bw.close()
}