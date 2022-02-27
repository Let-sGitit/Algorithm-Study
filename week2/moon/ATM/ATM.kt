import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    readInt() // numberOfPersons
    val sortedTimesByAscending = readInts().sorted()
    var prev = 0
    var result = 0

    sortedTimesByAscending.forEach { time ->
        result += time + prev
        prev += time
    }

    println(result)
}