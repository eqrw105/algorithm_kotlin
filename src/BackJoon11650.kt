//https://www.acmicpc.net/problem/11650

/**
 * 아이디어
 * x, y를 포함하고 Comparable을 상속받는 클래스를 생성
 * compareTo 메서드를 오버라이드하여 x가 같으면 y를 기준으로 오름차순 정렬 다르면 x를 기준으로 오름차순 정렬
 * 시간 복잡도
 * O(n log n)
 */
import java.util.StringTokenizer

data class Position(val x: Int, val y: Int): Comparable<Position> {
    override fun compareTo(other: Position): Int {
        return if (x == other.x) {
            y.compareTo(other.y)
        } else {
            x.compareTo(other.x)
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val list = mutableListOf<Position>()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        list.add(Position(x, y))
    }
    for (pos in list.sorted()) {
        bw.write("${pos.x} ${pos.y}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}