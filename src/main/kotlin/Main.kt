fun main(args: Array<String>) {
    var mylist = arrayListOf<Int> (1,2,3,4,5,6,7)

    println(mylist)
    println(reverse(mylist))
}

fun reverse (list:List<Int>): List<Int>{
    var result = arrayListOf<Int>()

    for( i in list.size downTo 1 ){

        result.add(list[i-1])


    }
    return result
}