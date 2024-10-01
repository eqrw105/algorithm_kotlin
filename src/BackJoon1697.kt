//https://www.acmicpc.net/problem/1697
import java.util.StringTokenizer
import java.util.Queue
import java.util.LinkedList

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val arr = IntArray(100_001)
    val visited = BooleanArray(100_001)
    bw.write(bfs(n, k, arr, visited).toString())
    bw.flush()
    bw.close()
}

private fun bfs(start: Int, k: Int, arr: IntArray, visited: BooleanArray): Int {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.offer(start to 0)
    visited[start] = true

    while(queue.isNotEmpty()) {
        val v = queue.poll()
        val position = v.first
        val count = v.second
        if (position == k) {
            return count
            break
        }

        if ((position+1) in (0..100_000) && !visited[position+1]) {
            visited[position+1] = true
            queue.offer(position+1 to count+1)
        }

        if ((position-1) in (0..100_000) && !visited[position-1]) {
            visited[position-1] = true
            queue.offer(position-1 to count+1)
        }

        if ((position*2) in (0..100_000) && !visited[position*2]) {
            visited[position*2] = true
            queue.offer(position*2 to count+1)
        }
    }

    return 0
}