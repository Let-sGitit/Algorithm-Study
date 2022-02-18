## 1. 개요

[https://www.acmicpc.net/problem/2839](https://www.acmicpc.net/problem/2839)

## 2. 코드

```kotlin
import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()

fun main() {
    var kilogram = readInt()
    var result = 0

    while (kilogram > 0) {
        when {
            kilogram < 3 -> {
                result = -1
                break
            }
            kilogram % 5 == 0 -> {
                result += kilogram / 5
                break
            }
            else -> {
                kilogram -= 3
                result++
            }
        }
    }
    print(result)
}
```

## 3. 설명

3킬로그램 봉지와 5킬로그램 봉지를 최소로 사용하여 설탕을 담아내야 하는 문제인데

5킬로그램 봉지로 담을 수 있을만큼 최대한 많이 담고 나머지를 3킬로그램 봉지로 담으면 최소한의 봉지로 설탕을 담아낼 수 있게 됨을 알 수 있는 전형적인 그리디 문제이다.

따라서 5로 나누어 떨어지기 전까지 3킬로그램 봉지를 담아내고 5로 나누어 떨어질 때 5킬로그램 봉지로 담아내도록 하였다.