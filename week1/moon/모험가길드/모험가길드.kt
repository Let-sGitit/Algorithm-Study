import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
fun readIntsForChar(): List<Int> = bufferedReader.readLine().map { it.toInt() - 48 }

fun main() {
    val n = readInt()
    val sortedFears = readInts().sorted()
    var result = 0
    var person = 0

    sortedFears.forEach { fear ->
        if (++person >= fear) {
            result++
            person = 0
        }
    }
    println(result)
}