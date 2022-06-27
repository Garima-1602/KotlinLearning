fun main(){

    //exception handling -using try,catch,finally
    val d= arrayOf(3,4,5,6)
    try{
        d[4]=7
        println("i ran and catch the value which cause error exception")
        //since there is an exception the print statement will not executed
    }catch(e: ArrayIndexOutOfBoundsException){
          println("catch the exception")
    }finally{//finally keyword is optional
        println(d[2])
    }

}