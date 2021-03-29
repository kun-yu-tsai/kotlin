object Singleton{
    fun myFun(){
        println("gogogo")
    }
}

fun String.myExtensionFun(): String {
    return "good $this"
}

fun main(args: Array<String>) {
    println(Country.JAPAN.code)
    println(Country.TW.code)
}

fun hof(op: (String, Int) -> Unit, op2: (Int) -> Int) {
    op("good", 5)
    println(op2(5))
}

enum class Country(val code: Int){
    CANADA(10),
    TW(886),
    JAPAN(224)
}

class Book4(var isbn: String) {
    var title = "default value"
        set(value) {
            field = value
        }

    var name = "name"
        set(value) {
            field = "$value good good"
        }
        get() {
            return "$field get value"
        }
}

class Book3(var name: String, var number: Int)

class Book2 constructor(name: String, number: Int) {
    var name: String
    var number: Int

    init {
        this.name = name
        this.number = number
    }
}

class Book {
    var name: String
    var number: Int

    constructor(name: String, number: Int) {
        this.name = name
        this.number = number
    }
}

class My {
    fun my(name: String) {
        println("my $name")
    }

    infix fun printOut(string: String) {
        println(string)
    }
}

fun surrounding() {
    val intList = listOf(1, 2, 3, 4, 5)
    intList.forEach {
        if (it % 2 == 0) {
            return@forEach
        }
    }
    println("End of surroundingFunction()") // Now, it will execute
}

fun lambdaInForEach() {
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach {
        if (it == 3)
            println(it)
    }
}
