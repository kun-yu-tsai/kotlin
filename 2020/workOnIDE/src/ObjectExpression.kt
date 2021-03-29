open class ABC{
    open fun show(){}
    fun hide(){}
}

fun doSomething(abc: ABC){
    abc.show()
    abc.hide()
}

fun main() {
    val a = ABC()
    val b = object : ABC(){
        override fun show() {
            super.show()
        }
    }

    val c = object{
        val name = "hello"
        val age = 15
    }

    println(c.name)
}