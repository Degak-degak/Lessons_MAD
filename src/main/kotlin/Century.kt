fun main (){
    var year = 1234
    var century: Int
    if (year > 0){
        century = ((year - 1) / 100) + 1
    } else {
        century = ((year + 1) / 100) - 1
    }
   // print(century)
    print("${century}th century")

}