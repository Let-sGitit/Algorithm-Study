import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }

fun main() {
    val testCase = readInt()

    repeat(testCase) {
        println(result())
    }
}

fun result(): Int {
    val ranks = IntArray(readInt())

    // Parsing
    repeat(ranks.size) {
        readInts().also {
            val documentRankByIndex = it[0] - 1
            val interviewRank = it[1]
            ranks[documentRankByIndex] = interviewRank
        }
    }

    var result = 1
    var highestInterviewRank = ranks[0]

    for (i in 1 until ranks.size) {
        if (highestInterviewRank > ranks[i]) {
            highestInterviewRank = ranks[i]
            result++
        }
    }

    return result
}