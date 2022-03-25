import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val points = Array(grades.size) { 0 }
    for (i in 0 until grades.size) {
        val surplus = grades[i] % 5
        if (grades[i] < 38) {
            points[i] = grades[i]
            // 点数を5で割ってそれを5で引いたときの数字が3未満だと次の5の倍数に切り上げて良い
        } else if (5 - surplus < 3) {
            /**
             * ceilで常に切り上げる
             * 最も近い5の倍数に切り上げたいので、5で割って商を求める
             * 出てきた商に+1すると次の5の倍数になるので+1する
             * 5で割っているからもとに戻すために5をかける
             */
            points[i] = ((ceil((grades[i] / 5).toDouble()) + 1) * 5).toInt()
        } else {
            points[i] = grades[i]
        }
    }
    return points
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
