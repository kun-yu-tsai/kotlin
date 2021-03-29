fun main() {
    val s1: Int.(Int) -> Int = { a -> this + a }

    val s2 = fun Int.(other: Int) : Int = this + other

    val s3 = fun Int.(a: Int) : Int = this + a
}

