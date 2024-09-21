//https://www.acmicpc.net/problem/10773
/**
 * 아이디어
 * stack 자료구조를 사용하여 0이 입력되면 pop 하고 stack의 합계를 출력
 * 시간 복잡도
 * O(N)
 */
import java.util.Stack

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    repeat(n) {
        val num = br.readLine().toInt()
        if (num == 0) {
            stack.pop()
        } else {
            stack.push(num)
        }
    }
    bw.write(stack.sum().toString())
    bw.flush()
    bw.close()
}