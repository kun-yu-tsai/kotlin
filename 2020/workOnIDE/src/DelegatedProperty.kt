import kotlin.properties.Delegates
import kotlin.reflect.KProperty
import kotlin.reflect.jvm.isAccessible

class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println(prop)
        println("$old -> $new")
    }
}

class User2(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}

class Example {
    val someName by NameDelegate()
}

class NameDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return property.name
    }
}

fun main() {
    val ex = Example()
    println(ex.someName)
}

//fun main() {
//    val user = User()
//    user.name = "first"
//    user.name = "second"
//
//    val user2 = User2(
//        mutableMapOf(
//            "name" to "John Doe",
//            "age" to 25
//        )
//    )
//
//    user2.map["name"] = "David"
//    user2.name = "Steve"
//
//
////    println(user2.name) // Prints "John Doe"
//    println(user2.map["name"]) // Prints "John Doe"
//    println(user2.age)  // Prints 25
//}