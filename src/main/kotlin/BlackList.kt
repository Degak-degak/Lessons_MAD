fun main(){
    var blaclist = arrayOf("African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher")
    var rawlist = arrayOf("Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish")
    var newlist = ArrayList<String>()
    for (user in rawlist){
        if (user !in blaclist){
           newlist.add(user)
        }
    }
    for (newuser in newlist){
        println(newuser)
    }
}