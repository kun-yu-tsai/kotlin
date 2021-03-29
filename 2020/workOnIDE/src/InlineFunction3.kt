inline fun higherfunc3(str: String, noinline mycall: (String) -> Unit) {
    //inovkes the print() by passing the string str
    mycall(str)
}

inline fun higherFun4(noinline call: () -> Unit, call2: () -> Unit){
    call()
    call2()
}

// main function
fun main(args: Array<String>) {
//    higherfunc3("A Computer Science portal for Geeks2", ::print)
    higherFun4({ println("123")}, { println("456")})
    /*
        基本上，沒有 inline, Kotlin & Java code 是一樣的。
        但如果有 inline.
        higher4 會直接把 他裡面的程式碼，轉貼出來。
        =>
            println("123")
            println("456")

        意思就是，inline function, 它 parameters 裡面所有 function, 都會變成 inline functions.
     */
}
