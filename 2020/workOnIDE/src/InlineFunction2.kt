fun higherfunc2(str: String, mycall: (String) -> Unit) {
    //inovkes the print() by passing the string str
    mycall(str)
}

// main function
fun main(args: Array<String>) {
    higherfunc2("A Computer Science portal for Geeks2", ::print)
}