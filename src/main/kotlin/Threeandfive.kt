fun main(){
    var number = readln().toInt()
    var sum = 0
    if (number <= 0){
        println("0")
    } else {
        for (item  in (3..number-1)){
            if ((item % 3 == 0) || (item % 5 == 0)){
                sum += item
                println(item)
            }
        }
    }
    println("Sum: $sum")
}

//(1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()

//Если мы перечислим все натуральные числа до 10, кратные 3 или 5,
//мы получим 3, 5, 6 и 9. Сумма этих кратных равна 23.
//Завершите решение так, чтобы оно возвращало сумму всех чисел,
//кратных 3 или 5, меньше переданного числа.
//Кроме того, если число отрицательное, верните 0.
//Примечание. Если число кратно и 3, и 5, считайте его только один раз.
