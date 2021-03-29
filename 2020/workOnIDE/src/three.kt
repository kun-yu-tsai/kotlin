import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

interface MyInterface {

    var test: String   // abstract property

    fun foo()          // abstract method
    fun hello() = "Hello there" // method with default implementation
    fun goo() {
        var a = 10
        print(a)
    }
}

enum class PureEnum {
    a,
    b,
    c
}

data class People(val name: String, val age: Int, val height: Float) {
    companion object Printer{
        fun hello() = print("hello")
    }
}

sealed class MySeal
class AA(val name: String) : MySeal()
class BB(val age: Int) : MySeal()
class CC(val name: String, age: Int) : MySeal()

fun main(a: Array<String>) {
    println("This is three")
    People.Printer.hello()

//    val p = People("David", 20, 175.09f)
//    val (n, a) = p
//    println("$n, $a")
//    print("${p.component1()}, ${p.component2()}, ${p.component3()}")
//
//    val enum = PureEnum.a
//    when (enum) {
//        PureEnum.a -> println(PureEnum.a)
//        PureEnum.b -> println(PureEnum.b)
//        PureEnum.c -> println(PureEnum.c)
//        else -> return
//    }
//
//    val aa1 = AA("1")
//    val aa2 = AA("2")
//    val aa3 = AA("3")
//
//    eval(aa1)
//    eval(aa2)
//    eval(aa3)

}

fun evalEnum(e: PureEnum): String {
    when (e) {
        PureEnum.a -> return "a"
        PureEnum.b -> return "b"
        PureEnum.c -> return "c"
    }
}

fun eval(e: MySeal): String {
    when (e) {
        is AA -> return e.name
        is BB -> return "BB"
        is CC -> return "BB"
    }
}