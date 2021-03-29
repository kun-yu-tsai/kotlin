fun main(args: Array<String>){
	println("No Class Main")
	val empty = Empty()
	val person = Person("123")
	println(person.name)
}

class Empty{
	init{
		println("Empty init")
	}
}
class Person constructor(firstName: String){
	val name = firstName
}