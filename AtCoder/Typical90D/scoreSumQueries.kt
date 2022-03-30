import java.io.PrintWriter

/**
 * https://atcoder.jp/contests/typical90/tasks/typical90_j
 */

fun main(args: Array<String>) {
    // 学生数
    val n = readLine()!!.trim().toInt()
    // 組と点数(学籍番号は+1したもの)
    val c = Array(n) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    // 知りたい質問の個数
    val q = readLine()!!.trim().toInt()
    val lr = Array(q) {
        readLine()!!.split(" ").map { it.toInt() }
    }

    // 累積和
    val s = MutableList(n + 1) { List(2) { 0 } }
    for (studentNumber in 0 until n) {
        if (c[studentNumber].first() == 1) s[studentNumber + 1] =
            listOf(s[studentNumber][0] + c[studentNumber][1], s[studentNumber][1])
        else s[studentNumber + 1] = listOf(s[studentNumber][0], s[studentNumber][1] + c[studentNumber][1])
    }

    val pw = PrintWriter(System.out)
    lr.forEach {
        val firstClassResult = s[it[1]].first() - s[it[0] - 1].first()
        val secondClassResult = s[it[1]][1] - s[it[0] - 1][1]
        pw.println("$firstClassResult $secondClassResult")
    }
    pw.close()
}

/**
 * 累積和を知らない頃
fun main(args: Array<String>) {
// 学生数
val n = readLine()!!.trim().toInt()
// 組と点数(学籍番号は+1したもの)
val c = Array(n) {
readLine()!!.split(" ").map { it.toInt() }
}
// 知りたい質問の個数
val q = readLine()!!.trim().toInt()
val lr = Array(q) {
readLine()!!.split(" ").map { it.toInt() }
}

val pw = PrintWriter(System.out)
lr.forEach {
val firstClass = c.slice(it[0] - 1 until it[1])
.filter { classNumber -> classNumber.first() == 1 }
.map { point -> point[1] }
.sum()

val secondClass = c.slice(it[0] - 1 until it[1])
.filter { classNumber -> classNumber.first() == 2 }
.map { point -> point[1] }
.sum()

pw.println("$firstClass $secondClass")
}
pw.close()
}
 **/