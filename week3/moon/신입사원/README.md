## **1. 개요**

[https://www.acmicpc.net/problem/1946](https://www.acmicpc.net/problem/1946)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val testCase = readInt()

    repeat(testCase) {
        println(result())
    }
}

fun result(): Int {
    val ranks = IntArray(readInt())

    // Parsing
    repeat(ranks.size) {
        readInts().also {
            val documentRankByIndex = it[0] - 1
            val interviewRank = it[1]
            ranks[documentRankByIndex] = interviewRank
        }
    }

    var result = 1
    var highestInterviewRank = ranks[0]

    for (i in 1 until ranks.size) {
        if (highestInterviewRank > ranks[i]) {
            highestInterviewRank = ranks[i]
            result++
        }
    }

    return result
}
```

## **3. 설명**

두 점수 중 적어도 하나가 다른 지원자보다 떨어진다면 선발되지 않는 점을 주의하자.
우선 서류 점수로 낮은 순위부터 정렬을 한다면 해당 지원자는 면접 점수가 제일 높아야만 선발이 될 수 있다.
그 다음 순서는 서류 점수는 이전 지원자보다 항상 높으므로, 면접 점수에 대해서만 이전의 지원자들보다 높으면 된다.
따라서 이전의 지원자들의 면접 점수를 기억하고, 해당 값을 비교하였다.