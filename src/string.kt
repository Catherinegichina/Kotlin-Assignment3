fun main(){
    var word = "Akirachix"
    print(word[0])
    print(word[2])
    println(word[3])
    var myDetails=details("Cate" , 20)
    println(myDetails)
    var myLength=measurement("house")
    println(myLength)
    var look=go("wayo")
    println(look)
}
fun details(x:String, y:Int): String{
    return "My name is $x and i am  $y years old"
}
fun measurement (a:String): Int{
    var h= a.length
    return(h)
}
 fun go(name:String ) {
     if (name == "Joyce") {
         println("thats me")

     } else
         println("I dont know who that is?")

         }
