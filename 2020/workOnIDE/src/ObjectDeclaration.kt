object thisIsASingletonObject{ // 只會有一個，不會有第二個。（但大家還是可以同時 access 唷，要不能，必須要定義 syncrhonous ）
    var count = 0

}

fun main() {
    thisIsASingletonObject.count += 1

    println(AB.Steve.onlyForA)
}

class AB{
//    companion object{
//        val onlyForA = "123"
//        var numberForA = 15
//    }

    companion object Steve : Factory<String>{
        val onlyForA = "123"
        override fun create(): String {
            return "123"
        }
    }
}

interface Factory<T> {
    fun create(): T
}