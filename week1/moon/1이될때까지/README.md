## 1. 코드

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts() = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val inputs = readInts()
    var n = inputs[0]
    val k = inputs[1]
    var result = 0

    while (n != 1) {
        if (n % k == 0) {
            n /= k
        } else {
            n--
        }
        result++
    }
    println(result)
}
```

## 2. 더 나은 풀이

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts() = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val inputs = readInts()
    var n = inputs[0]
    val k = inputs[1]
    var result = 0

    while (true) {
        if (n < k) {
            result += n - 1
            break
        }
        val target = (n / k) * k
        result += n - target

        n = target / k
        result++
    }
    
    println(result)
}
```

n을 1씩 빼서 k와 나누어 떨어질 때까지 연산하지 않고 (n / k) * k 수식을 사용하여 미리 나누어 떨어지는 값을 알 수 있다.

연산량을 더 줄인 것이기 때문에 더 나은 풀이라고 생각하였다.