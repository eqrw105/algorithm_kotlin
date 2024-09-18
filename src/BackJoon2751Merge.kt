//https://www.acmicpc.net/problem/2751
//병합 정렬

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        val v = br.readLine().toInt()
        list.add(v)
    }

    val mergedList = split(list)

    bw.write(mergedList.joinToString("\n"))
    bw.flush()
    bw.close()
}

fun split(list: MutableList<Int>) : MutableList<Int> {
    if (list.size <= 1) return list
    val mid = list.size / 2

    val left = split(list.subList(0, mid))
    val right = split(list.subList(mid, list.size))

    return merge(left, right)
}

fun merge(left: MutableList<Int>, right: MutableList<Int>) : MutableList<Int> {
    val mergedList = mutableListOf<Int>()
    var leftIdx = 0
    var rightIdx = 0

    while (leftIdx <= left.lastIndex && rightIdx <= right.lastIndex) {
        if (left[leftIdx] < right[rightIdx]) {
            mergedList.add(left[leftIdx])
            leftIdx++
        } else {
            mergedList.add(right[rightIdx])
            rightIdx++
        }
    }

    mergedList.addAll(right.subList(rightIdx, right.size))
    mergedList.addAll(left.subList(leftIdx, left.size))

    return mergedList
}