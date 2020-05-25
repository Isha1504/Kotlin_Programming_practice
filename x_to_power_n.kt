import java.util.Scanner;

fun main(){
    val number1 = Scanner (System.`in`)
    var n:Int=number1.nextInt();
    var x:Int=number1.nextInt();
    var result:Int=1;
    var i:Int=1;
    while (i<=x)
    {
        result=result*n;
        i++;
    }
    println(result)
}