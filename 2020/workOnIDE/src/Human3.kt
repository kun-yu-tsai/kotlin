class Human4 {
    private val _age: Int = 20
    var age: Int = 100
        get() {
            return _age
        }
        set(value) {
            field = value
        }

    val printAge = {
        println("Age is: $_age")
    }
}