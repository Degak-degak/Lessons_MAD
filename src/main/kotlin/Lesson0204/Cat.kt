package Lesson0204

class Kitty(
    voice:String,
    name:String,
    caste:String,
    color:String
    ): Animal(voice, name, caste, color) {
    fun woolreturn() {
        println("Khr-khr")
    }
    override fun sleep(){
        println( "$name is sleeping on the battery")
    }
}

