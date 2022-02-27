## **1. 개요**

[https://www.acmicpc.net/problem/1541](https://www.acmicpc.net/problem/1541)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readLine(): String = bufferedReader.readLine()
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
private fun readChars(): List<Char> = bufferedReader.readLine().toList()

fun main() {
    val expression = readLine()
    val numberQueue = LinkedList<Int>()

    parseNumber(expression, numberQueue)

    var result = numberQueue.poll()

    while (numberQueue.isNotEmpty()) {
        result -= numberQueue.poll()
    }
    println(result)
}

fun parseNumber(expression: String, numberQueue: LinkedList<Int>) {
    var numberString = ""
    var prevOperator = ' '

    expression.forEach {
        when (it) {
            '+' -> {
                val number = if (prevOperator == '+') numberQueue.pollLast() + numberString.toInt() else numberString.toInt()
                numberQueue.offer(number)
                numberString = ""
                prevOperator = it
            }
            '-' -> {
                val number = if (prevOperator == '+') numberQueue.pollLast() + numberString.toInt() else numberString.toInt()
                numberQueue.offer(number)
                numberString = ""
                prevOperator = it
            }
            else -> {
                numberString += it
            }
        }
    }

    if (numberString.isNotBlank()) {
        val number = if (prevOperator == '+') numberQueue.pollLast() + numberString.toInt() else numberString.toInt()
        numberQueue.offer(number)
    }
}
```

## **3. 설명**

수식에 더하기와 빼기만 존재하는데, 가장 작은 수를 만들기 위해서는 항상 가장 큰 수를 뺴주어야 한다를 전제 조건으로 삼을 수 있다.

그래서 뺄셈을 진행하기 전에 덧셈을 모두 진행한 뒤 나머지 뺼셈을 진행하도록 하였다.