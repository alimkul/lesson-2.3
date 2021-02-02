fun main(){
    var previousAmount=1005

    var amount :Double =100000.00
    var check : Boolean=true

   result("Mastercard",previousAmount, amount )
}
fun result(typeCard: String="Vk Pay", previousAmount: Int, amount: Double){
    when(typeCard){
        "Mastercard", "Maestro" -> if(! (amount >= 300 && amount <= 75000) ) {
           print ("Amount: "+(amount -(amount*0.6 /100 +20)) + "налог "+(amount*0.6 /100 +20))

        }
        "Visa" , "Мир" -> if( amount * 0.75/100 <=35 ) println("Amount: " + (amount - 35) +" налог 35 руб")
                    else print("Amount: "+(amount -amount * 0.75/100 )+" налог " +amount * 0.75/100)
        "Vk Pay" -> print("Amount: "+amount+" налог 0.0" )
    }
}