import Car.Car

fun main(){
    val userCar = Car("Lada","Baklajan")
    val enemyCar = Car(
        color = "Tomato",
        logo = "Moskvich")

    println("${userCar.wheels}")
    userCar.drive()
    println(enemyCar.color)
    enemyCar.stop()
}