//https://www.acmicpc.net/problem/1193

/**
 * 아이디어
 * 대각선에 포함 된 분수 수
 * 1번째 : 1, 2번째 : 2, 3번째 : 3, 4번째 : 4...
 * 대각선에 포함 된 분수 수 + 누적 된 분수 수가 x를 넘지 않을 때 까지 값을 누적
 * n번째 대각선 수 n이 홀 수 일 때 분모 : n번째 대각선 수 - (x - 누적 값 - 1), 분자 : x - 누적 값
 * 짝 수 일 때는 분모 분자가 반대
 * 시간복잡도
 * O(루트X)
 */

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine().toInt()

    var count = 1
    var sum = 0
    while(x > count + sum) {
        sum += count
        count++
    }
    val a = count - (x - sum - 1)
    val b = x - sum
    if (count % 2 == 1) {
        bw.write("$a/$b")
    } else {
        bw.write("$b/$a")
    }
    bw.flush()
    bw.close()
}