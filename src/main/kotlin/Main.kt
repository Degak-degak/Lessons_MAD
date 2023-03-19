fun main(args: Array<String>) {
    val year = 2000
    if (year % 400 == 0) {
        print("Leap year")
    } else {
        if ((year % 100 == 0) && (year % 4 != 0)) {
            print("Not leap")
        } else {
            if (year % 4 == 0) {
                print("Leap year")
            } else {
                print("Not Leap year")
            }
        }
    }
}
