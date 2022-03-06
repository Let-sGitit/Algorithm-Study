## **1. 개요**

[https://www.acmicpc.net/problem/13305](https://www.acmicpc.net/problem/13305)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
private fun readIntsForChar(): List<Int> = bufferedReader.readLine().map { it.toInt() - 48 }

fun main() {
    val n = readInt()
    val roads = readInts()
    val prices = readInts()

    var currPrice = Int.MAX_VALUE
    var totalPrice: Long = 0L

    for (i in roads.indices) {
        currPrice = minOf(currPrice, prices[i])
        totalPrice += currPrice.toLong() * roads[i]
    }
    println(totalPrice)
}
```

## **3. 설명**

최소 비용을 구하기 위해서는 지금까지 거쳐온 도시들의 가장 낮은 기름 가격을 기억하고,
새로운 도시를 거쳐갈 때마다 가격을 비교하고, 해당 가격으로 기름을 구매하면 된다.

단, 리터 당 가격이 1,000,000,000 이하까지 가능하므로 int 데이터 범위를 초과하기 때문에 totalPrice는 long 타입으로 선언하였다.