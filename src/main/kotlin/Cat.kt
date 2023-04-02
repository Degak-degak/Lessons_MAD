

class Cat(val name: String) {
    var energy: Int = 5
    var hungry: Int = 5
    var toilet: Int = 5
    var mood: Int = 5
    var age: Int = 1
    var health: Double = 5.0
    var weight: Double = 0.3

    fun eat() {
        hungry += 5
        toilet -= 3
        age ++
    }

    fun goToilet() {
        toilet += 10
        hungry -= 1
        mood += 1
        age ++
    }

    fun sleep() {
        energy += 5
        hungry -= 1
        toilet -= 1
        mood += 1
        age ++
    }

    fun play() {
        mood += 5
        energy -= 3
        toilet -= 1
        age ++
    }

    fun doNothing() {
        energy -= 1
        hungry -= 1
        toilet -= 1
        mood -= 1
        age ++
    }

    fun catInfo() {
        println("Name: $name\n" +
                "Age: $age\n" +
                "Health: $health\n" +
                "Weight: $weight\n" +
                "==============================\n" +
//                "Energy: ${energy}\n" +
//                "Hungry: ${hungry}\n" +
//                "Toilet: ${toilet}\n" +
//                "Mood:   ${mood}\n"
                "Energy: ${starRow(energy)}\n" +
                "Hungry: ${starRow(hungry)}\n" +
                "Toilet: ${starRow(toilet)}\n" +
                "Mood:   ${starRow(mood)}\n"
                )
    }
}

