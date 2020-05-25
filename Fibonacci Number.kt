import java.util.Scanner;
//CHECK IF THE NUMBER BELONGS TO FIBONACCI AND TELL THE POSITION OF A NUMBER IN FIBONACCI
fun main() {
    val read = Scanner(System.`in`)
    var n:Int=read.nextInt();
    var a:Int=0
    var b:Int=1
    var flag:Int=0
    var cnt:Int=1
    var t:Int=1
    while(flag==0 && t<=n){

        if(n==0){
            println(cnt)
            flag=1
        }
        else{
            cnt++;
            //print(t)
            if (t==n){
                println("Yes it belongs to Fibonacci")
                print("And it is at postion: ")
                print(cnt-1)
                flag=1
                break;
            }
            t=a+b
            b=a
            a=t
            //print(t)
            }

        }
    if(flag==0){
        println("Not a part of fibonacci")
    }
}