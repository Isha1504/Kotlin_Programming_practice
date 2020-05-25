import java.util.*

class Account() {
    fun deposit(amount:Int,bal:Int):Int{
        return bal+amount
    }
    fun withdraw(amt:Int,bal:Int):Int{
        return bal-amt
    }
    fun addInterest(intr:Float,bal:Int):Int{
        var x=bal*intr
        return (bal+x).toInt()
    }
}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var balance = read.nextInt()
    var rate = read.nextFloat()
    var account = Account()
    var input = read.nextInt()
    while (input != -1) {
        when(input) {
            1 -> {
                var amt = read.nextInt()
                balance=account.deposit(amt,balance)
            }
            2 -> {
                var amt = read.nextInt()
                balance=account.withdraw(amt,balance)
            }
            3 -> balance=account.addInterest(rate,balance)
        }
        input = read.nextInt()
    }
    print(balance)
}

