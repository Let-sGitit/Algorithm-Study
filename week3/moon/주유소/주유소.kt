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