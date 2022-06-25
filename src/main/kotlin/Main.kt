fun main(){
   //to check variable lies in the given range -using if else/or using in operator
   val num=15
   when(num){
      in 1 ..10->println("Lies between 1-10")
      in 11..20->println("Lies between 11-20")
      else->println("None of these")
   }


}