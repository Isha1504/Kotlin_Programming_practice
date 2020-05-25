import java.util.*
fun main (args: Array<String>) {
    val read = Scanner(System.`in`)
    var N1=read.nextDouble()
    var D1=read.nextDouble()
    var N2=read.nextDouble()
    var D2=read.nextDouble()
    var ch:Int=read.nextInt()
    var obj:Fraction=Fraction(N1,D1,N2,D2)
    when(ch){
        1 -> obj.Add()
        2 -> obj.Subtract()
        3 -> obj.Multiply()
        4 -> obj.Divide()
    }
}
fun Common_factor(a:Double,b:Double):Int{
    var gcd=1
    var i=1
    while (i<=a && i<=b) {
        if ((a%i).toLong()==0L && (b%i).toLong()==0L)
            gcd=i
        i++
    }
    return gcd
}
class Fraction(n1:Double,n2:Double,n3:Double,n4:Double){
    var a:Double=n1
    var b:Double=n2
    var c:Double=n3
    var d:Double=n4
    var r1:Double=0.0
    var r2:Double=0.0
    fun Add(){
        r2=b*d
        r1=(a*d)+(b*c)
        // Result is r1/r2
        var x=Common_factor(r1,r2)
        r1=r1/x
        r2=r2/x
        print((r1).toInt())
        print("/")
        print((r2).toInt())
    }
    fun Subtract(){
        r2=b*d
        r1=(a*d)-(c*b)
        //Result is r1/r2
        var x=Common_factor(r1,r2)
        r1=r1/x
        r2=r2/x
        print((r1).toInt())
        print("/")
        print((r2).toInt())
    }
    fun Multiply(){
        r2=b*d
        r1=a*c
        //Result is r1,r2
        var x=Common_factor(r1,r2)
        r1=r1/x
        r2=r2/x
        print((r1).toInt())
        print("/")
        print((r2).toInt())
    }
    fun Divide(){
        r2=(b*c)
        r1=(a*d)
        //Result r1/r2
        var x=Common_factor(r1,r2)
        r1=r1/x
        r2=r2/x
        print((r1).toInt())
        print("/")
        print((r2).toInt())
    }
}