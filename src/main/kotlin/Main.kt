fun main(){
    //two types of exceptions
    //java.lang.arithmeticException
    //ArrayIndexOutOfException
    //NPE-Null Pointer Exception
    //npe occur when compiler expect value of variable but get null
    //null safety operator-string?.length
    //elvis operator -to print default value instead of null
    //filterNotNull()used to remove null elemnets from array or list

    //var nullValue:String?=null
    //println(nullValue?.length?:"This is null") //?:elvis operator //?.nullsafety operator
    val nullList=listOf(1,2,3,null,5,null,6,null,0)
    var arrayList=arrayListOf("This","is",null,"a","statement",null)
    println("The list without null value is ${nullList.filterNotNull()}")
    println("The array without null value is ${arrayList.filterNotNull()}")
}