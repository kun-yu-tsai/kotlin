class A(var name: String) {
    private fun test() {
        println("test")
    }
}

class B(){
    fun test(){
        println("testB")
    }
}

fun main() {
    val myFun : () -> Int = { 5+2 }
    val a = A("123")

    val cls = A::class.java

    val cls2 = B::class.java

    val instanceA = cls.getConstructor(String::class.java).newInstance("123")
    println(instanceA.name)

    val instance = cls2.getDeclaredConstructor().newInstance()
    instance.test()

    val method = cls.getDeclaredMethod("test")
    val field = cls.getDeclaredField("name")
    field.trySetAccessible()
    field.set(a, "ggg")

    method.trySetAccessible()
    method.invoke(a)
//    method.invoke(instance)

    println(field.get(a))
    println(a.name)
}