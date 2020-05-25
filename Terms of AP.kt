import java.util.*
///Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
fun main() {
    val read = Scanner(System.`in`)
    var n:Int=read.nextInt()
    var i:Int=1;
    while(i<=n){
        var c:Int=3*i+2
        if(c%4!=0){
            print(3*i+2)
            print(" ")
        }

        i++
    }
}