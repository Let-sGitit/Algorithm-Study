## **1. 개요**

[https://www.acmicpc.net/problem/1931](https://www.acmicpc.net/problem/1931)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
fun readIntsForChar(): List<Int> = bufferedReader.readLine().map { it.toInt() - 48 }
fun readLongs(): List<Long> = bufferedReader.readLine().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    val timeInfoQueue = PriorityQueue<Pair<Long, Long>> { o1, o2 ->
        when (o1.second) {
            o2.second -> (o1.first - o2.first).toInt()
            else -> (o1.second - o2.second).toInt()
        }
    }
    var result = 1

    for (i in 0 until n) {
        readLongs().also {
            timeInfoQueue.offer(Pair(it[0], it[1]))
        }
    }

    var currEnd = timeInfoQueue.poll().second

    while (timeInfoQueue.isNotEmpty()) {
        val (start, end) = timeInfoQueue.poll()

        if (start >= currEnd) {
            currEnd = end
            result++
        }
    }

    println(result)
}
```

## **3. 설명**

빨리 끝나는 회의를 우선으로 배정한다면 회의에 사용할 수 있는 시간을 그만큼 더 확보할 수 있다.
만약 회의 끝나는 시간이 같다면 시작 시간이 더 짧은 것을 선택한다. (앞의 시간도 마찬가지로 더 확보할 수 있기 때문에)