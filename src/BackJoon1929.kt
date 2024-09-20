//https://www.acmicpc.net/problem/1929

/**
 * 아이디어
 * M+1 사이즈의 배열을 사용한다.
 * N부터 M까지 for문을 돌면서 i의 배수를 배열에서 flase으로 변경한다.
 * 0이 아닌 수만 출력한다.
 * 시간복잡도
 * O(m log log m)
 */
import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = BooleanArray(m + 1) { true }
    arr[0] = false
    arr[1] = false

    for (i in 2..m) {
        if (arr[i]) {
            for (j in i * i.toLong()..m.toLong() step i.toLong()) {
                if (j <= m) {
                    arr[j.toInt()] = false
                }
            }
        }
    }
    arr.forEachIndexed { idx, isPrime ->
        if (idx in (n..m) && isPrime) {
            bw.write("$idx \n")
        }
    }
    bw.flush()
    bw.close()
}