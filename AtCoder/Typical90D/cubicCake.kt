/**
 * https://atcoder.jp/contests/typical90/tasks/typical90_v
 * ユークリッドの互除法を使って求める。
 * ユークリッドの互除法は最大公倍数を求めるときに使う。
 */
fun main(args: Array<String>) {
    // 降順で代入
    var (a, b, c) = readLine()!!.split(" ").sortedDescending().map { it.toLong() }
    val copyA = a
    val copyB = b
    val copyC = c

    while (true) {
        if (a == 0L) {
            if (b >= c) {
                b %= c
            } else {
                c %= b
            }
            if (c == 0L) {
                println((copyA / b - 1) + (copyB / b - 1) + (copyC / b - 1))
                return
            }
            if (b == 0L) {
                println((copyA / c - 1) + (copyB / c - 1) + (copyC / c - 1))
                return
            }
        } else if (b == 0L) {
            if (a >= c) {
                a %= c
            } else {
                c %= a
            }
            if (a == 0L) {
                println((copyA / c - 1) + (copyB / c - 1) + (copyC / c - 1))
                return
            }
            if (c == 0L) {
                println((copyA / a - 1) + (copyB / a - 1) + (copyC / a - 1))
                return
            }

        } else if (a >= b) {
            a %= b
        } else {
            b %= a
        }
    }
}
