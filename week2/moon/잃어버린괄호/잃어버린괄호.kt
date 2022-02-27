import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readLine(): String = bufferedReader.readLine()
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
private fun readChars(): List<Char> = bufferedReader.readLine().toList()

fun main() {
    val expression = readLine()
    val numberQueue = LinkedList<Int>()

    parseNumberAndOperator(expression, numberQueue)

    var result = numberQueue.poll()

    while (numberQueue.isNotEmpty()) {
        result -= numberQueue.poll()
    }
    println(result)
}

fun parseNumberAndOperator(expression: String, numberQueue: LinkedList<Int>) {
    var numberString = ""
    var prevOperator = ' '

    expression.forEach {
        when (it) {
            '+' -> {
                val number = if (prevOperator == '+') numberQueue.pollLast() + numberString.toInt() else numberString.toInt()
                numberQueue.offer(number)
                numberString = ""
                prevOperator = it
            }
            '-' -> {
                val number = if (prevOperator == '+') numberQueue.pollLast() + numberString.toInt() else numberString.toInt()
                numberQueue.offer(number)
                numberString = ""
                prevOperator = it
            }
            else -> {
                numberString += it
            }
        }
    }

    if (numberString.isNotBlank()) {
        val number = if (prevOperator == '+') numberQueue.pollLast() + numberString.toInt() else numberString.toInt()
        numberQueue.offer(number)
    }
}