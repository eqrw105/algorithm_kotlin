//https://www.acmicpc.net/problem/1436

/**
 * 아이디어
 * while문을 count가 n과 같을 때 까지 반복한다.
 * while문에서는 int값을 계속 1씩 더해주고 int값을 천의자리부터 10씩 나눠가며 666이 포함되어있는지 체크한다.
 * 666이 포함되어있다면 count +1을한다.
 *
 * 시간복잡도
 * O(N * log(num))
 */
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    var num = 666
    var count = 1
    while (count < n) {
        num++

        var temp = num
        while(temp >= 666) {
            if (temp % 1000 == 666) {
                count++
                break
            } else {
                temp /= 10
            }
        }
    }
    bw.write(num.toString())
    bw.flush()
    bw.close()
}