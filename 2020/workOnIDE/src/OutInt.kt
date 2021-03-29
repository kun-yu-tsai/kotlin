import java.util.ArrayList

open class AAA {
    fun aaa() {}
}

fun main() {
    val listB = mutableListOf<BBB>()
    val listB2 = mutableListOf<BBB2>()
    val listC = mutableListOf<CCC1>()

    tryOut(listB)
    tryOut(listB2)
    tryOut(listC)

    tryStar(listB)
    tryStar(listB2)
//    tryStar(listOf<Int>())
}

open class BBB : AAA()
class BBB2 : AAA()
class CCC1 : BBB()

fun tryOut(arg: MutableList<out Any>) {
    arg.get(0)
    arg.get(1)
}

fun tryIn(arg: MutableList<in AAA>) {
    arg.get(0)
    arg.get(1)
}

fun tryStar(arg: MutableList<*>){
    arg.get(0).toString()

}



