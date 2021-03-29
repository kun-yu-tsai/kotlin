package sealed_class

sealed class SealComplicate(val name: String){
    fun existFun(){}
    abstract fun test()
}

class C1: SealComplicate("C1"){
    override fun test() {

    }
}
class C2: SealComplicate("C2"){
    override fun test() {

    }
}

object myObj : SealComplicate("good"){
    override fun test() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}