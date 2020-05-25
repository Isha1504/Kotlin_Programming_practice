
import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var inout1  = read.nextDouble()
    var input2  = read.nextDouble()
    var operator= read.next()
    var flag:Int=1
    var ch:String;
    var result:Double=calculate(inout1,input2,operator)
    while(flag>0){
        ch=read.next()
        when(ch){
            "y" -> {
                operator=read.next()
                input2=read.nextDouble()
                result=calculate(result,input2,operator)
            }
            "n" -> {
                flag=-1
            }
        }
    }
    println(result);
}
fun calculate(input1:Double,input2:Double,operator:String): Double{
    var res:Double=4.4;
    when(operator){
        "+" -> res=input1+input2
        "-" -> res=input1-input2
        "*" -> res=input1*input2
        "/" -> res=input1/input2
        "%" -> res=input1%input2
    }
    return res;
}
