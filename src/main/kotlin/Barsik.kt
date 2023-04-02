fun main(){
    //println("What is your cat's name?")
    var barsik = Cat("Barsik")
    var command: Int = -1
    barsik.catInfo()
    while (command != 0){
        commandList()
        while (command == -1){
            command = checkInput(readln())
        }
        doCommand(command, barsik)
        }
        barsik.catInfo()
        command = -1
//        command = checkInput(readln())
    }

}

fun starRow(num: Int): String {
    return ("⭐".repeat(num)+ "★".repeat(10 - num))
}

fun checkInput(input: String): Int {
    val trimmedInput = input.trim()
    return if (trimmedInput.matches(Regex("\\d+")) && (trimmedInput.toInt() in 0..5) ) {
        return trimmedInput.toInt()
    } else {
        return -1
    }

}

fun commandList(){
    println(
        "Choose a command:\n" +
        "1. Feed a cat\n" +
        "2. Go to the toilet\n" +
        "3. Sleep\n" +
        "4. Play with cat\n" +
        "5. Do nothing\n" +
        "0. Exit"
    )
}

fun doCommand (command:Int, barsik:Cat){
    when (command) {
        1 -> barsik.eat()
        2 -> barsik.goToilet()
        3 -> barsik.sleep()
        4 -> barsik.play()
        5 -> barsik.doNothing()
        0 -> {println("Good Bye")
            continue}
}