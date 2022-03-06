import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
fun readInt(): Int = bufferedReader.readLine().toInt()
fun readInts(): List<Int> = bufferedReader.readLine().split(" ").map { it.toInt() }
fun readIntsForChar(): List<Int> = bufferedReader.readLine().map { it.toInt() - 48 }
fun readLongs(): List<Long> = bufferedReader.readLine().split(" ").map { it.toLong() }

fun main() {
    val n = readInt()
    val timeInfoQueue = PriorityQueue<Pair<Long, Long>> { o1, o2 ->
        when (o1.second) {
            o2.second -> (o1.first - o2.first).toInt()
            else -> (o1.second - o2.second).toInt()
        }
    }
    var result = 1

    for (i in 0 until n) {
        readLongs().also {
            timeInfoQueue.offer(Pair(it[0], it[1]))
        }
    }

    var currEnd = timeInfoQueue.poll().second

    while (timeInfoQueue.isNotEmpty()) {
        val (start, end) = timeInfoQueue.poll()

        if (start >= currEnd) {
            currEnd = end
            result++
        }
    }

    println(result)
}