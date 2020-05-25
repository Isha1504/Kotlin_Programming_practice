import java.util.*

///Write a program to print all the factors of a number.

fun main() {
    val read = Scanner(System.`in`)
    var n:Int=read.nextInt()
    var i:Int=2
    while(i<n){
        if(n%i==0){
            print(i)
            print(" ")
        }
        i++
    }
}