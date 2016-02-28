package d1129

object hello {
  def main(args: Array[String]): Unit = {

    //import scala.math.BigInt._

    def gcd(a: BigInt, b: BigInt): BigInt = if(b == BigInt(0)) a else gcd(b, a%b)
    def lcm(a: BigInt, b: BigInt): BigInt = (a * b) / gcd(a, b)
    //val n: BigInt = 20
    //val ans = (1 to n).reduce(lcm)
    //val ans = (1 to n).reduce((a, b) => a * b / a.gcd(b))
    val ans = (1 to 20).map(BigInt(_)).reduce(lcm)
    //val ans = (BigInt(1) to BigInt(20)).reduce(lcm)

    println(ans)
    //println((1 to 20).map(BigInt(_)).reduce((a, b) => a * b / a.gcd(b)))

    val ans2 = (BigInt(1) to BigInt(2000000)).filter(_.isProbablePrime(10)).sum
    println(ans2)
  }

}
