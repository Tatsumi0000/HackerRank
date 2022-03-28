import java.io.PrintWriter


fun main(args: Array<String>) {

    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val a = List(h) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    val column = Array(h) { 0 }
    val row = Array(w) { 0 }

    val b = Array(h) { Array(w) { 0 } }

    for (i in 0 until h) {
        for (j in 0 until w) {
            row[j] += a[i][j]
            column[i] += a[i][j]
        }
    }

    for (i in 0 until h) {
        for (j in 0 until w) {
            b[i][j] = row[j] + column[i] - a[i][j]
        }
    }

    val fp = PrintWriter(System.out)
    
    b.forEach { rowArray ->
        rowArray.forEach {
            fp.print("$it ")
        }
        fp.println()
    }
    fp.close()
}
