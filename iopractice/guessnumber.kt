package iopractice
import java.util.*

// guess the generated random number

fun main(){
    var randnum = java.util.Random().nextInt(101)
    var guess = -1

    while (guess != randnum){
        print("Enter your guess  between 1 .. 100::")
        guess = readLine()?.toInt()!!


    if (guess < randnum){
        println("Less than guess")
    } else if (guess > randnum){
        println("More than guess")
    }else {
        println ("Bang on!!!")
    }
    }
}