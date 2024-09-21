//https://www.acmicpc.net/problem/2667

/**
 * 아이디어
 * 2중 for문으로 dfs로 노드와 연결되어 있고 방문하지 않은 그래프를 탐색하기
 * 시간복잡도
 * O(N^2)
 * N <= 25
 */
private val dx = arrayOf(0, 1, 0, -1)
private val dy = arrayOf(1, 0, -1, 0)
private val answer = mutableListOf<Int>()
private var count = 0
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val graph: Array<Array<Int>> = Array(n) {
        Array<Int>(n) { 0 }
    }
    val visited: Array<Array<Boolean>> = Array(n) {
        Array<Boolean>(n) { false }
    }
    repeat(n) { i ->
        br.readLine().toCharArray().forEachIndexed { j, value ->
            graph[i][j] = value.toString().toInt()
        }
    }

    for(i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j] && graph[i][j] == 1) {
                dfs(j, i, visited, graph)
                answer.add(count)
                count = 0
            }

        }
    }

    bw.write("${answer.size}\n")
    for (i in answer.sorted()) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}

private fun dfs(x: Int, y: Int, visited: Array<Array<Boolean>>, graph: Array<Array<Int>>) {
    count++
    visited[y][x] = true

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]
        if (nx in (0..graph.lastIndex) && ny in (0..graph.lastIndex)) {
            if (!visited[ny][nx] && graph[ny][nx] == 1) {
                dfs(nx, ny, visited, graph)
            }
        }
    }
}