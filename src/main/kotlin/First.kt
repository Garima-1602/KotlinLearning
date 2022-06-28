class First {
    var breed:String="Stephard"
    var color:String="Brown"
    var age:Int=5
    fun eat()
    {
        println("${breed}s eat food")
    }
    fun bark()
    {
        println("${breed}s bark")
    }
}
//call the func by creating object
fun main()
{
    val f1=First()
    //here f1 is object
    f1.breed="German Stephard" //accesing the varaibvles using object
    f1.color="Black"
    f1.age=1
    println("The breed of the dog is ${f1.breed},whose color is ${f1.color} ,and age is ${f1.age}")
    f1.eat()
    f1.bark()
}