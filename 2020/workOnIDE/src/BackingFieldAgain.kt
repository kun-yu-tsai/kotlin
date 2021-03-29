class MyTime(){
    var hours = 10
    val minusOneHour: Int
        get(){
            return hours - 1
        }

    var minusHour: Int
        get() = hours
        set(value) {
            hours -= value
        }

    fun funMinusOneHour() : Int {
        return hours - 1
    }
}

fun main(){
    val myTime = MyTime()
//    println(myTime.minusOneHour)
//    println(myTime.funMinusOneHour())
    myTime.minusHour = 3
    myTime.minusHour = 3
    println(myTime.minusHour)
}


/*
private val hours = 10
public getHours(){
    return hours
}

public getMinusOneHour(){
    return hours - 1
}
 */