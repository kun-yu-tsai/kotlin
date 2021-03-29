class CCC(number: Int){
    val l = number
    fun ccc(){}
}
fun main() {
//    println(intFunction(10))

    val c = CCC(10)
    // val fr = c.ccc  // We can't do this in Kotlin. But in many other language, this is available.
    val fr = c::ccc
    var lll = c::l
    println(lll.get())

    lll = CCC(20)::l
    println(lll.get())

    val l2 = CCC::l
    l2.get(c)

    function(::Foo)
}

class Foo(val name: String)

fun function(factory: (String) -> Foo) {
    val x: Foo = factory("david")
}

//val intFunction: (Int) -> Int = IntTransformer()