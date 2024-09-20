//https://www.acmicpc.net/problem/1260

import kotlin.math.min
import java.util.*

lateinit var visited: BooleanArray
lateinit var graph: Array<Array<Int>>
val bw = System.out.bufferedWriter()

fun main() {
    val br = System.`in`.bufferedReader()

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val v = st.nextToken().toInt()

    graph = Array<Array<Int>>(n + 1) { Array(n + 1) { 0 } }
    visited = BooleanArray(n+1)

    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()

        graph[i][j] = 1
        graph[j][i] = 1
    }

    dfs(v)
    bw.flush()

    Arrays.fill(visited, false)
    bw.newLine()

    bfs(v)
    bw.flush()

    bw.close()
}

private fun dfs(start: Int) {
    visited[start] = true
    bw.write("$start ")

    for(i in 0 until graph.size) {
        if (graph[start][i] == 1 && visited[i] == false) {
           dfs(i)
       }
   }
}

private fun bfs(start: Int) {
    val queue: Queue<Int> = LinkedList()
    bw.write("$start ")
    visited[start] = true
    queue.offer(start)

    while(queue.isNotEmpty()) {
        val node = queue.poll()
        for(i in 0 until graph.size) {
            if (graph[node][i] == 1 && visited[i] == false) {
                bw.write("$i ")
                visited[i] = true
                queue.offer(i)
            }
        }
    }
}