fun main() {
    val list = listOf(1, 2, 3, 4)
    val list2 = list.map { i -> i + 1 }

    val bigList = listOf(list, list2)

    println(list2)

    val m = { i: Int, j : Int -> i * j}
    val reduce = list.reduce { acc, i -> acc + i }
    val reduce2 = list.reduce(m)
    println(reduce)
    println(reduce2)

    val resultList = bigList.flatMap { it }
    println(resultList)
}