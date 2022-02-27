import java.io.BufferedReader
import java.io.InputStreamReader

private val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
private fun readInt(): Int = bufferedReader.readLine().toInt()
private fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
private fun readChars(): List<Char> = bufferedReader.readLine().toList()

fun main() {
    val seatNumber = readInt()
    val seatInfo = readChars()
    var availableCupHolders: Double = 1.0

    for (i in 0 until seatNumber) {
        if (seatInfo[i] == 'S') { // S : 일반석
            availableCupHolders += 1
        }
        else if (seatInfo[i] == 'L') { // 커플석
            availableCupHolders += 0.5
        }
    }

    println(minOf(seatNumber, availableCupHolders.toInt()))
}