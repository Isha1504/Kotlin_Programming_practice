import java.util.Scanner;

fun main(){
    val read=Scanner(System.`in`)
    var rows:Int=read.nextInt()
    for (i in 1..rows) {
        var j:Int=i;
        while(j>=1) {
            print(j)
            j--
        }
        println()
    }
}