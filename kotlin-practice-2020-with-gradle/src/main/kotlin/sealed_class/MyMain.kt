package sealed_class

fun main() {
    var sub1 = Sub1()
    sealClassSwitch(sub1)
    sealClassSwitch(ThisIsSingletonClass)
}

fun sealClassSwitch(a: ParentSealClass) =
    when (a) {
        is Sub1 -> println("This is Sub1")
        is Sub2 -> println("This is Sub2")
        is Sub3 -> println("This is Sub3")
        ThisIsSingletonClass -> println("This is Singleton")

    }
