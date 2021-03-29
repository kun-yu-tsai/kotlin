
fun main() {
    evalPay(PaymentOption.Transfer)
//    evalEnum(MyEnum.D)
}

fun evalEnum(e: MyEnum) : Unit =
    when (e) {
        MyEnum.A -> println("A")
        MyEnum.B -> println("A")
        MyEnum.C -> println("A")
        MyEnum.D -> println("A")
    }


fun evalPay(p: PaymentOption) {
    when (p) {
        is PaymentOption.P2 -> print("P2")
    }
}

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // the `else` clause is not required because we've covered all the cases
}

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

sealed class PaymentOption2 {
    object Cash
    object Card
}

sealed class PaymentOption {
    object Cash : PaymentOption()
    object Card : PaymentOption()
    object Transfer : PaymentOption()
    class P2(name: String) : PaymentOption()
    class P3(age: Int) : PaymentOption()
}


enum class MyEnum {
    A,
    B,
    C,
    D
}