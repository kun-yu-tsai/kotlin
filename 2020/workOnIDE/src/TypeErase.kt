class MyClass<T>(var data: T)

fun <T, R> test(param: T, param2: R) : R{
    val data = param
    val value = "hello ${data}"
    println(value)
    return param2
}

fun <T> checkType(data: T, clazz: Class<T>){
    println(clazz.isInstance(data))
}

inline fun <reified T> checkType2(data: T){
    val b = data is T
    println(b)
}
