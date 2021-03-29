class Human2 {
    val age = 20
}

class Human5 {
    var age = 50
    get() {
        return field
    }

    set(value) {
        field = value
    }
}

fun main(){
    val human = Human2()
    human.age
}