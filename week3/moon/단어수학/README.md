## **1. 개요**

[https://www.acmicpc.net/problem/1339](https://www.acmicpc.net/problem/1339)

## **2. 코드**

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readLine(): String = bufferedReader.readLine()
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val n = readInt()
    val weightMap = hashMapOf<Char, Int>()
    val numberMap = hashMapOf<Char, Int>()
    val lines = mutableListOf<String>()
    var number = 9
    var result = 0

    // Parsing
    repeat(n) {
        val line = readLine()
        line.forEachIndexed { index, alphabet ->
            val digit = line.length - index

            weightMap[alphabet] = weightMap.getOrDefault(alphabet, 0) + 10.0.pow(digit).toInt()
        }
        lines.add(line)
    }

    // find Number
    weightMap.entries
        .sortedBy { -it.value }
        .forEach { numberMap[it.key] = number-- }

    lines.forEach { line ->
        result += mapLineToNumber(line, numberMap)
    }

    print(result)
}

fun mapLineToNumber(line: String, numberMap: HashMap<Char, Int>): Int {
    var number = 0

    line.forEachIndexed { index, alphabet ->
        number += numberMap.getOrDefault(alphabet, 0) * 10.0.pow(line.length - index - 1).toInt()
    }
    return number
}
```

## **3. 설명**

자릿수가 가장 높은 알파벳에 대해 높은 수를 부여해도 될 것 같지만,
결국 더해서 가장 큰 수를 구해야 하는 것이므로
ABB라고 한다면 100A + 10B + B인 것이므로 여기서 A는 100의 가중치, B는 11의 가중치를 나타낸다고 볼 수 있다.
따라서 자릿수에 따른 가중치를 모두 더하고, 가장 큰 가중치에 대해 높은 수를 부여하였다.