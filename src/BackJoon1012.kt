//https://www.acmicpc.net/problem/1012
/**
 * 아이디어
 * 이중 for문을 돌면서 방문하지 않고 값이 1인 경우 bfs를 실행한다.
 * bfs에서는 위, 아래, 오른쪽, 왼쪽 모두 bfs를 실행한다.
 * bfs가 완료될 때 count를 +1씩 한다.
 * 시간복잡도
 * O(M*N)
 */
import java.util.StringTokenizer
import java.util.Queue
import java.util.LinkedList

private val dx = arrayOf(0, 1, 0, -1)
private val dy = arrayOf(-1, 0, 1, 0)

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine().toInt()

    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val m = st.nextToken().toInt()
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        val graph: Array<Array<Int>> = Array(n) {
            Array<Int>(m) {
                0
            }
        }

        repeat(k) {
            val graphSt = StringTokenizer(br.readLine())
            val x = graphSt.nextToken().toInt()
            val y = graphSt.nextToken().toInt()
            graph[y][x] = 1
        }

        var count = 0
        for(y in 0 until n) {
            for(x in 0 until m) {
                if (graph[y][x] == 1) {
                    graph[y][x] = 0
                    bfs(x, y, graph, m, n)
                    count++
                }
            }
        }
        bw.write(count.toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}

private fun bfs(x: Int, y: Int, graph: Array<Array<Int>>, m: Int, n: Int) {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.offer(x to y)

    while(queue.isNotEmpty()) {
        val (x, y) = queue.poll()
        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]
            if (nx in (0 until m) && ny in (0 until n)) {
                if (graph[ny][nx] == 1) {
                    graph[ny][nx] = 0
                    queue.offer(nx to ny)
                }
            }
        }
    }
}