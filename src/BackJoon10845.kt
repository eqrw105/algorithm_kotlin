//https://www.acmicpc.net/problem/10845

import java.util.StringTokenizer

private class Queue<T> {
    val list = mutableListOf<T>()

    fun push(value: T) {
        list.add(value)
    }

    fun pop(): T? {
        return front()?.also {
            list.removeAt(0)
        }
    }

    fun size(): Int {
        return list.size
    }

    fun empty(): Boolean {
        return list.isEmpty()
    }

    fun front(): T? {
        return list.firstOrNull()
    }

    fun back(): T? {
        return list.lastOrNull()
    }
 }

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val queue: Queue<Int> = Queue()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val cmd = st.nextToken()
        when (cmd) {
            "push" -> queue.push(st.nextToken().toInt())
            "pop" -> bw.write("${queue.pop() ?: -1}\n")
            "size" -> bw.write("${queue.size()}\n")
            "empty" -> bw.write("${if (queue.empty()) 1 else 0}\n")
            "front" -> bw.write("${queue.front() ?: -1}\n")
            "back" -> bw.write("${queue.back() ?: -1}\n")
        }
    }
    bw.flush()
    bw.close()
}