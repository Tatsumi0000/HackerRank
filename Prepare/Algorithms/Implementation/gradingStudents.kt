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
            points[i] = 5 - surplus + grades[i]
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
