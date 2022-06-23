import java.util.*

fun main() {
 var characterArray=arrayOf<Char>('g','a','r','i','m','a')
    val charArray=arrayOf<Char>('a','e','i','o','u')

    //array of string
    var stringArray:Array<String> =arrayOf("Hello","guys","welcome")
    println(stringArray[0])
    stringArray[0]="Hey"
    println(stringArray[0])
    println(stringArray.size)//we cannot chnage size of array
    //to print all elements of an array
    //arrays is library which is used to perform operatiosn like tostring to conver array to string
    //arraysto string func is string representation of array
    println(Arrays.toString(stringArray))
    //Define an array with the contents (1, 2, 3, 4) and print it using the Arrays.toString() function.
    var arrayInt =arrayOf<Int>(1,2,3,4)
    println(Arrays.toString(arrayInt))

}
