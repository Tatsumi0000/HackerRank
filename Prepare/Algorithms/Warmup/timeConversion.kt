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
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val judgeTime12 = { s: String -> s.take(2) == "12" }
    if (s.contains("PM")) {
        if (judgeTime12(s)) {
            return s.replace("PM", "")
        }
        val time = s.take(2).toInt() + 12
        return time.toString() + s.drop(2).replace("PM", "")
    }

    if (judgeTime12(s)) {
        val time = "00"
        return time + s.drop(2).replace("AM", "")
    }
    return s.replace("AM", "")
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
