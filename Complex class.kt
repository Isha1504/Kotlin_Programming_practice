import java.util.*
fun main (args: Array<String>) {
    val read = Scanner(System.`in`)
    var N1=read.nextDouble()
    var D1=read.nextDouble()
    var N2=read.nextDouble()
    var D2=read.nextDouble()
    var ch:Int=read.nextInt()
    var obj:Complex=Complex(N1,D1,N2,D2)
    when(ch){
        1 -> obj.Add()
        2 -> obj.Multiply()
    }
}
class Complex(n1:Double,n2:Double,n3:Double,n4:Double){
    var a:Double=n1
    var b:Double=n2
    var c:Double=n3
    var d:Double=n4
    var r1:Double=0.0
    var r2:Double=0.0
    fun Add(){
        r1=a+c
        r2=b+d
        print((r1).toInt())
        print(" + i")
        print((r2).toInt())
    }
    fun Multiply(){
        r1=(a*c)-(b*d)
        r2=(a*d)+(c*b)
        print((r1).toInt())
        print(" + i")
        print((r2).toInt())
    }
}