package Car

class Car(val logo:String, val color: String = "White"){
    val wheels = 4
    val doors = 4
    val engine = 1

    fun drive(){
        println("$color $logo is driving")
    }

    fun stop(){
        println("$color $logo is stopping")
    }
}


