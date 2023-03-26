fun main(){
    var arkadstring = readln()
    var current_substring = ""
    var min_polyndrome = arkadstring
    for (pollen in 2..arkadstring.length){
        for (charindex in 0..arkadstring.length-pollen){
            current_substring = arkadstring.substring(charindex,charindex+pollen)
            if (ispolyndrome(current_substring)){
                min_polyndrome = lexic_min(min_polyndrome, current_substring)
            }
        }
        if (min_polyndrome != arkadstring){
            break
        }
    }
    if (min_polyndrome != arkadstring) {
        println(min_polyndrome)
    } else {
        println("В строке нет полиндромов")
    }

}
fun ispolyndrome(strng:String):Boolean{
    var flag = true
    for (index in 0..(strng.length / 2)){
        if (strng[index] != strng[strng.length-index-1]){
            flag = false
            break
        }
    }
    return(flag)
}

fun lexic_min(strng1:String, strng2:String):String{
    var minstr = strng1
    if (strng1.length < strng2.length){
        minstr = strng1
    } else if (strng2.length < strng1.length){
        minstr = strng2
    } else { //строки одинаковой длины
        for (index in 0..(strng1.length-1)){
            if (strng1[index] < strng2[index]){
                minstr = strng1
                break
            } else if (strng2[index] < strng1[index]){
                minstr = strng2
                break
            }

        }
    }
    return (minstr)
}
/*Для каждой строки в своей базе данных
Аркадий хочет найти самую короткую её подстроку,
состоящую хотя бы из двух символов и являющуюся
палиндромом. Если таких подстрок несколько,
Аркадий хочет выбрать лексикографически минимальную.*/

/*
Найти в строке полиндром (минимальный)
Берём длину полиндрома pol_len сначала 2, потом +1 до длины строки
Проходим по исходной строке и выбираем подстроку длинной текущего pol_len
Записать полиндромы, сравнить их лексиграфический размер
 */