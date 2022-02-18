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