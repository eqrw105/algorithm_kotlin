//https://www.acmicpc.net/problem/1874

/**
 * 아이디어
 * n번의 for문을 돌면서 입력받은 정수보다 작은 경우 스택에 push한다.
 * stack의 최상단 데이터가 입력받은 정수와 같으면 pop한다.
 * 최상단의 데이터가 같지 않다면 NO 출력
 * 시간복잡도
 * O(N)
 */
import java.util.Stack
private fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    var k = 1
    for (i in 0 until n) {
        val num = br.readLine().toInt()

        while(k <= num) {
            stack.push(k)
            sb.append("+\n")
            k++
        }
        if (stack.peek() != num) {
            sb.clear()
            sb.append("NO")
            break
        }

        stack.pop()
        sb.append("-\n")
    }

    print(sb)
}