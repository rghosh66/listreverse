package oops

class Stack <E> (vararg var items : E){
    var stack = items.toMutableList()

    fun push(element: E){
        stack.add(element)
    }

    fun pop():E? {
        if (!isEmpty()) {
            return stack.removeAt(stack.size - 1)
        }else {
            return null
        }
    }
    fun isEmpty() : Boolean{
        return stack.isEmpty()

    }
}

fun <T> stackOf(vararg items: T) : Stack<T> {
    return Stack(*items)

}