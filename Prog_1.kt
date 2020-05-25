import java.util.Scanner;

fun main(){
    val number1 = Scanner (System.`in`)
    var n:Int=number1.nextInt();
    var i=1;
    while (i<=10)
    {
        println(i*n);
        i++;
    }
}