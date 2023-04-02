package Lesson0204

open class Animal (
    val voice:String,
    val name:String,
    val caste:String,
    val color:String
    ) {
    fun animalInfo(){
        println(
            "Name: $name\n"+
                    "Caste: $caste\n"+
                    "Color: $color\n"+
                    "Voice: $voice\n"
        )
    }
    init {
        println(
            "Name: $name\n"+
                    "Caste: $caste\n"+
                    "Color: $color\n"+
                    "Voice: $voice\n" +
                    "Is successfuly created"
        )
    }
    fun makeVoice(){
        println(voice.repeat(3))
    }
    open fun sleep(){
        println( "$name is sleeping")
    }
}