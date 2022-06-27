fun main(){

    //exception handling -using try,catch,finally
    val d= arrayOf(3,4,5,6)
    try{
        d[4]=7
    }catch(e: ArrayIndexOutOfBoundsException){

    }finally{
        println(d[2])
    }

}