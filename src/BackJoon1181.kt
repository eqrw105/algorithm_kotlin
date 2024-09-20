//https://www.acmicpc.net/problem/1181

/**
 * 아이디어
 * 중복 단어를 하나만 남기기 위해 Set 자료구조를 사용한다.
 * 단어 클래스를 만들어서 정렬 조건을 추가한다.
 * 데이터 삽입 시 자동 정렬을 위해 sortedSetOf(TreeSet)을 사용한다.
 * 시간복잡도
 * O(n log n)
 */
data class Word(val string: String): Comparable<Word> {
    override fun compareTo(other: Word): Int {
        return if (string.length == other.string.length) {
            string.compareTo(other.string)
        } else {
            string.length - other.string.length
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val set = sortedSetOf<Word>()
    repeat(n) {
        set.add(Word(br.readLine()))
    }
    set.forEach {
        bw.write(it.string)
        bw.newLine()
    }

    bw.flush()
    bw.close()
}