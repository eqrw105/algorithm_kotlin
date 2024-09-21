//https://www.acmicpc.net/problem/1920
/**
 * 아이디어
 * 맵 자료구조에 주어진 정수 N개 리스트를 1로 초기화
 * 찾아야 하는 정수 M개 리스트의 값이 맵에 있으면 저장된 값인 1 없으면 0 출력
 * 시간 복잡도
 * O(N+M)
 */

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val nListSt = StringTokenizer(br.readLine())
    val map = hashMapOf<Int, Int>()
    repeat(n) {
        map[nListSt.nextToken().toInt()] = 1
    }
    val m = br.readLine().toInt()
    val mListSt = StringTokenizer(br.readLine())
    repeat(m) {
        val v = map[mListSt.nextToken().toInt()] ?: 0
        bw.write(v.toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}