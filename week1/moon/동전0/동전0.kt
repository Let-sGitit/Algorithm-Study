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