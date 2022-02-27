## **1. 개요**

[https://www.acmicpc.net/problem/2810](https://www.acmicpc.net/problem/2810)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
private fun readChars(): List<Char> = bufferedReader.readLine().toList()

fun main() {
    val seatNumber = readInt()
    val seatInfo = readChars()
    var availableCupHolders: Double = 1.0

    for (i in 0 until seatNumber) {
        if (seatInfo[i] == 'S') { // S : 일반석
            availableCupHolders += 1
        }
        else if (seatInfo[i] == 'L') { // 커플석
            availableCupHolders += 0.5
        }
    }

    println(minOf(seatNumber, availableCupHolders.toInt()))
}
```

## **3. 설명**

컵홀더에 컵을 꽂을 수 있는 사람의 수를 구하는 것이기 때문에 좌석 수와 컵홀더의 수 중 작은 수임을 알 수 있다.

첫 좌석에는 양옆에 컵홀더가 비치되어 있기 때문에 미리 1개를 쥐어주고 일반석일 경우 1개를, 커플석일 경우 0.5개를 추가하였다. (커플석은 항상 2개가 붙어있다는 전제가 있기 때문)