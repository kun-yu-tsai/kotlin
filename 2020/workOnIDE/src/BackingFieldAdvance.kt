import kotlin.reflect.KProperty

class Human123 {
    var age = 20
}

class Human456 {
    var age: Int = 20
        get() = 30
}

class HumanDelegation {
    val age: Int by MyDelegation123()
}

class MyDelegation123 {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return 10
    }
}

fun main() {
    val hd = HumanDelegation()
    println(hd.age)
}