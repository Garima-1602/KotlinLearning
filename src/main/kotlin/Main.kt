fun main(){
   //mutable lists are changeable
    //syntax for defining:-var/val listname =mutableListOf<data type>(list of items)
    val listOfString= mutableListOf("garima","is","learning","kotlin")
    listOfString[0]="GK"
    listOfString.add("daily")
    listOfString.removeAt(3)
    val arr=arrayOf("a,","b","c")
    listOfString.addAll(arr)
    print(listOfString)
}