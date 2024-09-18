//https://www.acmicpc.net/problem/10828

import java.io.*
import java.util.*

class Stack<T> {
    private val list = mutableListOf<T>()

    fun push(v: T) {
        list.add(v)
    }

    fun pop(): T? = list.lastIndex.takeIf{ it != -1 }?.let { idx ->
        list[idx].also {
            list.removeAt(idx)
        }
    }

    fun size(): Int = list.size

    fun isEmpty(): Boolean = list.isEmpty()

    fun peek(): T? = list.lastOrNull()
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val stack = Stack<Int>()
    val n = br.readLine().toInt()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val cmd = st.nextToken()
        when(cmd) {
            "push" -> {
                val v = st.nextToken().toInt()
                stack.push(v)
            }
            "pop" -> {
                val print = (stack.pop() ?: -1).toString()
                bw.write(print)
                bw.newLine()
            }
            "top" -> {
                val print = (stack.peek() ?: -1).toString()
                bw.write(print)
                bw.newLine()
            }
            "size" -> {
                bw.write(stack.size().toString())
                bw.newLine()
            }
            "empty" -> {
                val print = if (stack.isEmpty()) {
                    1
                } else {
                    0
                }.toString()
                bw.write(print)
                bw.newLine()
            }
        }
    }
    bw.flush()
    bw.close()
}