class Human {
    private val _age: Int = 20
    val age: Int
        get() {
            return _age
        }

    val printAge = {
        println("Age is: $_age")
    }
}

fun main(){
    val human = Human()
    human.age
}