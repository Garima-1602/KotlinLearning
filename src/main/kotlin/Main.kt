fun main() {
    //comparison operators in kotlin

    val str="Garima Kamboj"
    val stringlength=str.length //stringlength to find length
    val stringindex=str.get(12) //string get to get value at particular index
    println(str)
    println(stringlength)
    println(stringindex)
    println("The value from ${str.subSequence(2,7)}") //exlude 7th character
    var i=1
    println("The value is $i")//$ it is string template which concatenate the string

}