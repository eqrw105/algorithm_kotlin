//https://www.acmicpc.net/problem/10814

/**
 * 아이디어
 * 가입 순서, 나이, 이름을 갖는 클래스를 생성
 * 클래스는 Comarable 인터페이스를 상속받음
 * compareTo 함수를 override하여 나이가 같다면 가입 순서로, 나이가 다르다면 나이로 오름차순 정렬
 *
 * 시간복잡도
 * O(n log n)
 * n = 최대 10만
 */
import java.util.StringTokenizer

class Member(
    val seq: Int,
    val age: Int,
    val name: String
) : Comparable<Member> {

    override fun compareTo(other: Member): Int {
        return if (age == other.age) {
            seq.compareTo(other.seq)
        } else {
            age.compareTo(other.age)
        }
    }
}

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()

    val arr = Array<Member>(n) {
        Member(-1, 0, "")
    }
    repeat(n) { idx ->
        val st = StringTokenizer(br.readLine())
        val age = st.nextToken().toInt()
        val name = st.nextToken()
        arr[idx] = Member(idx, age, name)
    }
    arr.sorted().forEach {
        bw.write("${it.age} ${it.name}\n")
    }
    bw.flush()
    bw.close()
}