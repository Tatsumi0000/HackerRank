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
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Long>): Unit {
    val minMaxMap: MutableMap<String, Long> = mutableMapOf("min" to 0L, "max" to 0L)

    for (i in 0 until arr.size ) {
        if (i == 0) {
            minMaxMap["min"] = arr.sum() - arr[i]
            minMaxMap["max"] = arr.sum() - arr[i]
        }

        when {
            minMaxMap["min"]!! > arr.sum() - arr[i] -> minMaxMap["min"] = arr.sum() - arr[i]
            minMaxMap["max"]!! < arr.sum() - arr[i] -> minMaxMap["max"] = arr.sum() - arr[i]
        }
    }
    println("${minMaxMap["min"]} ${minMaxMap["max"]}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    miniMaxSum(arr)
}
