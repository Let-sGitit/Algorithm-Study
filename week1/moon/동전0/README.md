## 1. 개요

[https://www.acmicpc.net/problem/11047](https://www.acmicpc.net/problem/11047)

## 2. 코드

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val numbers = readInts()
    val kindOfCoins = numbers[0]
    var targetMoney = numbers[1]

    val coins = IntArray(kindOfCoins)
    var result = 0

    for (i in coins.size - 1 downTo 0) {
        coins[i] = readInt()
    }

    coins.forEach { coin ->
        result += targetMoney / coin
        targetMoney %= coin
    }

    println(result)
}
```

## 3. 설명

N, K가 주어지면 다른 종류의 동전 N개로 K원을 만드는 데 필요한 동전의 최소 개수를 구하는 문제이다.

최소 개수의 동전을 구하는 것은 가장 큰 금액의 동전을 먼저 사용함으로써 만들어지므로 전형적인 그리디 문제이다.

가장 큰 동전부터 거꾸로 저장하여 가장 큰 동전부터 사용하도록 하였다.