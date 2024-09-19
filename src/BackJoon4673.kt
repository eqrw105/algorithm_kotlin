//https://www.acmicpc.net/problem/4673

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val list = BooleanArray(10000) { false }

    var answer = ""
    (1 until 10000).forEach { num ->
        if (!list[num]) {
            answer += "$num\n"
        }

        var dn = num + num.toString().map { it.toString().toInt() }.sum()
        if (dn < 10000) {
            list[dn] = true
        }
    }

    bw.write(answer)
    bw.flush()
    bw.close()
}