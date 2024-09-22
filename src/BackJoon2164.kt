//https://www.acmicpc.net/problem/2164

/**
 * 아이디어
 * 1부터 n까지의 데이터를 담은 큐 자료구조 사용
 * while문을 통해 큐가 1개 남을 때 까지 아래 동작을 반복
 * 큐의 첫번째를 poll, 큐의 마지막에 첫번째를 offer (q.offer(q.poll))
 *
 * 시간복잡도
 * O(n log n)
 * n = 최대 50만
 */
import java.util.Queue
import java.util.LinkedList

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    repeat(n) {
        queue.offer(it+1)
    }

    while(queue.size > 1) {
        with(queue) {
            poll()
            offer(poll())
        }
    }
    bw.write(queue.peek().toString())
    bw.flush()
    bw.close()
}