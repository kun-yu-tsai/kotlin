
import java.util.*


fun tryGeneric(arg: Int): Int{
    return arg*2
}

fun main222() {
    println(tryGeneric(10))

    val listOfObject = mutableListOf<Any>()
    val listOfInt: List<Int> = listOf(1,2,3,4,5)

    listOfObject.add(1)
    listOfObject.add(2)
    listOfObject.add(3)
    listOfObject.addAll(listOfInt)

    tryBase(listOf<EXTEND1>())
}

fun tryBase(arg: List<out BASE>){
    arg[0].base()
    arg[1].base()
}

fun main(args: Array<String>) { //List of Integers
    val ints = Arrays.asList(1, 2, 3, 4, 5)
    println(sum(ints))
    //List of Doubles
    val doubles = Arrays.asList(1.5, 2.0, 3.0)
    println(sum(doubles))
    val strings = Arrays.asList("1", "2")
    //This will give compilation error as :: The method sum(List<? extends Number>) in the
//type GenericsExample<T> is not applicable for the arguments (List<String>)
//    println(sum(strings))
}

fun sum(numbers: List<Number>): Number? {
    var s = 0.0
    for (n in numbers) {
        s += n.toDouble()
    }
    return s
}
open class BASE{
    fun base(){ println("base")}
}
class EXTEND1 : BASE()
class EXTEND2 : BASE()
class EXTEND3 : BASE()