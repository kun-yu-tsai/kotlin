import javax.annotation.processing.AbstractProcessor

@Deprecated("mate, don't use this.", ReplaceWith("myFunNew()"))
fun myFun(){
    println("123")
}

fun myFunNew(){

}

open class MyAnno{
    open fun steve(){
        println("steve")
    }
}

class MyAnno2 : MyAnno(){

    @Override
    override fun steve(){
        println("STEVE")
    }


//    override fun david(){
//        println("DAVID")
//    }
}

@SuppressWarnings
fun main(){
    myFun()

    val myAnno2 = MyAnno2()
//    myAnno2.david()
}