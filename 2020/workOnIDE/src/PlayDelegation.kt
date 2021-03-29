interface Base{
    var message : String
    fun showInt(): Int
    fun showString(): String
}

class BaseImpl(): Base{

    override var message: String = "hello"
        get() = field
        set(value) {
            field = value
        }

    override fun showInt(): Int {
        println("showInt")
        return 0
    }

    override fun showString(): String {
        println("showString")
        return "string"
    }
}

class MyDelegation(b: Base) : Base by b

fun main(){
    val myDelegation = MyDelegation(BaseImpl())
    println(myDelegation.message)
    myDelegation.showInt()
    myDelegation.showString()
}