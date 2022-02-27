## **1. 개요**

[https://www.acmicpc.net/problem/11047](https://www.acmicpc.net/problem/5585)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    var change = 1000 - readInt() // 1 <= readInt() < 1000
    var result = 0

    while (change > 0) {
        when {
            change >= 500 -> {
                result += change / 500
                change %= 500
            }
            change >= 100 -> {
                result += change / 100
                change %= 100
            }
            change >= 50 -> {
                result += change / 50
                change %= 50
            }
            change >= 10 -> {
                result += change / 10
                change %= 10
            }
            change >= 5 -> {
                result += change / 5
                change %= 5
            }
            change >= 1 -> {
                result += change / 1
                change %= 1
            }
        }
    }
    println(result)
}
```

## **3. 설명**

특정 금액을 거슬러 주기 위해 거슬러 줘야 하는 동전의 개수를 최소화하기 위해서는 가장 큰 금액의 동전부터 금액을 거슬러주면 된다.

### 4. 더 나은 풀이

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    var change = 1000 - readInt() // 1 <= readInt() < 1000
    var result = 0
    val coins = listOf(500, 100, 50, 10, 5, 1)

    // 중복되는 로직을 간소화
    coins.forEach { coin ->
        if (change >= coin) {
            result += change / coin
            change %= coin
        }
    }

    println(result)
}
```