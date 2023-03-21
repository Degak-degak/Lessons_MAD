import java.lang.Math.sqrt
import kotlin.math.roundToInt

fun main() {
//    for (item in (1..9)) {
//        if (item == 5) {
//            println("item = 5")
//            continue
//        }
//
//        println(item * item)
//
//    }
    /*   var item = 1
    while (item <=9 ){

        if (item == 5) {
            println("item = 5")
            item ++
            continue
        }
        println(item * item)
        item ++
    }
    print(item)
*/

//    fun summ (a:Int,b:Int): Int {
//        return(a + b)
//    }
//    print(summ(2,3))

    fun hat (name:String, surname:String, version:String){
        println("Author: $name $surname\nVersion: $version")
    }
    hat("Andrey", "Degtiar", "1.001")

    fun sqex (a:Double, b:Double, c:Double ){
        var d = b*b - 4*a*c
        if (d > 0.0){
            var x1 = (-b + sqrt(d))/(2*a)
            var x2 = (-b - sqrt(d))/(2*a)
            println("x1 = ${String.format("%.2f", x1)} \nx2 = ${String.format("%.2f", x2)}")
        }
        else if (d == 0.0){
            var x1 = (-b)/(2*a)
            println("x = $x1")
        }
        else {
            println("Уравнение корней не имеет")
        }


    }
    sqex(2.0,8.0,4.0)
}