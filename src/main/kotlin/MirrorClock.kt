fun main(){
    var hours: Int
    var minutes: Int
    var mir_hours = 12
    var mir_minutes = 0

    if (mir_minutes != 0){
        hours = 12 - mir_hours - 1
        minutes = 60 - mir_minutes
    } else {
        hours = 12 - mir_hours
        minutes = mir_minutes
    }
    if (hours == 0){
        hours = 12
    }
    print(hours)
    print(":")
    print(minutes)
}

/*
1:15 - 10:45
2:20 - 9:40
3:00 - 9:00
4:30 - 7:30
5:45 - 6:15
6:00 - 6:00
7:50 - 4:10
8:40 - 3:20
 */