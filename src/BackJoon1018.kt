//https://www.acmicpc.net/problem/1018

/**
 * 아이디어
 * y = n - 8번, x = m - 8번 반복하는 2중 for문을 돌린다.
 * for문 내부에서 8x8번 반복하는 2중 for문을 추가로 돌리면서 체스판 패턴에 맞는지 count
 * q+p로 체스 패턴을 번갈아가면서 비교
 * count된 숫자를 min 변수 값과 비교하요 최소 값만 저장한다.
 * 시간 복잡도((n-7)*(m-7))
 * (n-7) * (m-7) = 43 * 43 = 1849
 */

import java.util.StringTokenizer
import kotlin.math.min

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val st = StringTokenizer(br.readLine())
    val y = st.nextToken().toInt()
    val x = st.nextToken().toInt()
    val arr = Array<CharArray>(y) {
        br.readLine().toCharArray()
    }

    var min = Int.MAX_VALUE
    repeat(y - 7) { i ->
        repeat(x - 7) { j ->
            var black = 0
            var white = 0
            for (q in i until i+8) {
                for(p in j until j+8) {
                    if ((q+p) % 2 == 0) {
                        if (arr[q][p] == 'W') white++
                        else black++
                    } else {
                        if (arr[q][p] == 'W') black++
                        else white++
                    }
                }
            }
            min = min(min, min(black, white))
        }
    }

    bw.write(min.toString())
    bw.flush()
    bw.close()
}