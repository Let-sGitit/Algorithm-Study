import java.io.BufferedReader
import java.io.InputStreamReader

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
fun readIntsForChar(): List<Int> = bufferedReader.readLine().map { it.toInt() - 48 }

fun main() {
    val numbers = readIntsForChar()
    var result = numbers[0]

    for (i in 1 until numbers.size) {
        result = maxOf(result + numbers[i] , result * numbers[i])
    }

    println(result)
}