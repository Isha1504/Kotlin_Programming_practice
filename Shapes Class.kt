import java.util.*

class Sphere(r: Int){
    var rad=r
    fun LSA():Int{
        return (4*3*rad*rad).toInt();
    }
    fun TSA():Int{
        return (4*3*rad*rad).toInt();
    }
    fun Vol():Int{
        return((4*rad*rad*rad)).toInt()
    }
}
class Cylinder(r: Int, h: Int){
    var rad=r;
    var hei=h;
    fun LSA():Int{
        return(2*3*rad*hei).toInt()
    }
    fun TSA():Int{
        return((2*3*rad)*(rad+hei)).toInt()
    }
    fun Vol():Int{
        return(3*rad*rad*hei).toInt()
    }
}
class Cube(s: Int){
    var le=s;
    fun LSA():Int{
        return(4*le*le).toInt()
    }
    fun TSA():Int{
        return(6*le*le).toInt()
    }
    fun Vol():Int{
        return(le*le*le).toInt()
    }
}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    when(read.nextInt()) {
        1 -> {
            val r = read.nextInt()
            var sp:Sphere=Sphere(r)
            var l1=sp.LSA()
            var l2=sp.TSA()
            var l3=sp.Vol()
            print(l1)
            print(" ")
            print(l2)
            print(" ")
            print(l3)
        }
        2 -> {
            val r = read.nextInt()
            val h = read.nextInt()
            var sp:Cylinder=Cylinder(r,h)
            var l1=sp.LSA()
            var l2=sp.TSA()
            var l3=sp.Vol()
            print(l1)
            print(" ")
            print(l2)
            print(" ")
            print(l3)
        }
        3 -> {
            val r = read.nextInt()
            var sp:Cube=Cube(r)
            var l1=sp.LSA()
            var l2=sp.TSA()
            var l3=sp.Vol()
            print(l1)
            print(" ")
            print(l2)
            print(" ")
            print(l3)
        }
    }
}