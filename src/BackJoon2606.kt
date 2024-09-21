//https://www.acmicpc.net/problem/2606
/**
 * 아이디어
 * 1번부터 DFS를 통해 연결되어 있는 노드의 수를 count한다.
 * 간선을 구하는 것이기 때문에 count-1을 해준다.
 * 시간 복잡도
 * O(N+M)
 */

import java.util.*

var count: Int = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val graph = Array<Array<Int>>(n+1) { Array<Int>(n+1) { 0 } }
    val visited = BooleanArray(n+1) { false }
    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()
        graph[i][j] = 1
        graph[j][i] = 1
    }

    dfs(1, graph, visited)
    bw.write(count.minus(1).toString())
    bw.flush()
    bw.close()
}

fun dfs(start: Int, graph: Array<Array<Int>>, visited: BooleanArray) {
    visited[start] = true
    count++

    for (i in 0 until graph.size) {
        if (graph[start][i] == 1 && !visited[i]) {
            visited[i] = true
            dfs(i, graph, visited)
        }
    }
}

fun bfs(start: Int, graph: Array<Array<Int>>, visited: BooleanArray) {
    visited[start] = true
    count++
    val queue: Queue<Int> = LinkedList()
    queue.offer(start)

    while(queue.isNotEmpty()) {
        val node = queue.poll()
        for (i in 0 until graph.size) {
            if (graph[node][i] == 1 && !visited[i]) {
                visited[i] = true
                count++
                queue.offer(i)
            }
        }
    }
}