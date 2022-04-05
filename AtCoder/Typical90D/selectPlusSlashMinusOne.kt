import kotlin.math.abs

fun main(args: Array<String>) {
    // 長さN,操作回数K
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }
    val B = readLine()!!.split(" ").map { it.toInt() }
    val C = MutableList<Int>(N) { 0 }

    for (i in 0 until N) {
        C[i] = abs(A[i] - B[i])
    }

    val cSum = C.sum()
    /**
     * K回で操作完了したいので合計の差分がK以上じゃないとそもそも目的の数値に届かない
     * かつ
     * 合計の差分が目的の操作回数以上なら後は目的の数字で-1と+1を繰り返せば答えにたどり着く。
     * ので、目的地までの(+1と-1)の操作で1セットなのでペアのあまりが出ないかもチェックする。
     */
    if (K >= cSum && (K - cSum) % 2 == 0) println("Yes")
    else println("No")

}
