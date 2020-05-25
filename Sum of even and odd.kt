import java.util.*

///Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.

fun main() {
    val read = Scanner(System.`in`)
    var n:Int=read.nextInt()
    var n2=n
    var odd:Int=0;
    var even:Int=0;
    var cnt=0
    while(n2!=0){
        var t=n2%10
        n2=n2/10
        cnt++
    }
    var i:Int=cnt;
    //println(cnt)
    while(n!=0){
        var r=n%10
        //println(r)
        n=n/10
        if(cnt%2!=0){
            odd+=r
        }
        else
            even+=r
         cnt--;
    }
    print("odd ")
    print(odd)
    println()
    print("even ")
    print(even)
}