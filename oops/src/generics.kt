package oops

fun main(){

    var stack = Stack<String> ("a","b","c'")

    println("Push ${stack.push("d")}")
    println("Pop ${stack.pop()}")
    println("Pop ${stack.pop()}")
    println("Pop ${stack.pop()}")
    println("Pop ${stack.pop()}")
    println("Pop ${stack.pop()}")

    //with generic function call
    var stack2 = stackOf(1,2,3,4,5,6)

    println("push ${stack2.push(10)}")
    println("pop ${stack2.pop()}")
    println("pop ${stack2.pop()}")


}