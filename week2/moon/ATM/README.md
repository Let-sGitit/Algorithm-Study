## **1. 개요**

[https://www.acmicpc.net/problem/11399](https://www.acmicpc.net/problem/11399)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    readInt() // numberOfPersons
    val sortedTimesByAscending = readInts().sorted()
    var prev = 0
    var result = 0

    sortedTimesByAscending.forEach { time ->
        result += time + prev
        prev += time
    }

    println(result)
}
```

## **3. 설명**

각 사람이 돈을 인출하는데 필요한 시간의 합이 최소로 걸리려면 인출하는데 시간이 적은 사람부터 돈을 뽑으면 된다.

왜냐하면 각 걸린 시간의 합을 모두 더한 값이 제일 작아야 하므로 가장 작은 값을 더하는 것이 최솟값을 구하는 것이다.