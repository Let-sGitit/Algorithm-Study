import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readLine(): String = bufferedReader.readLine()
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val n = readInt()
    val weightMap = hashMapOf<Char, Int>()
    val numberMap = hashMapOf<Char, Int>()
    val lines = mutableListOf<String>()
    var number = 9
    var result = 0

    // Parsing
    repeat(n) {
        val line = readLine()
        line.forEachIndexed { index, alphabet ->
            val digit = line.length - index

            weightMap[alphabet] = weightMap.getOrDefault(alphabet, 0) + 10.0.pow(digit).toInt()
        }
        lines.add(line)
    }

    // find Number
    weightMap.entries
        .sortedBy { -it.value }
        .forEach { numberMap[it.key] = number-- }

    lines.forEach { line ->
        result += mapLineToNumber(line, numberMap)
    }

    print(result)
}

fun mapLineToNumber(line: String, numberMap: HashMap<Char, Int>): Int {
    var number = 0

    line.forEachIndexed { index, alphabet ->
        number += numberMap.getOrDefault(alphabet, 0) * 10.0.pow(line.length - index - 1).toInt()
    }
    return number
}