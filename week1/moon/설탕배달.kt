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