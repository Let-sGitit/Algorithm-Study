import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    var change = 1000 - readInt() // 1 <= readInt() < 1000
    var result = 0
    val coins = listOf(500, 100, 50, 10, 5, 1)

    coins.forEach { coin ->
        if (change >= coin) {
            result += change / coin
            change %= coin
        }
    }

    println(result)
}