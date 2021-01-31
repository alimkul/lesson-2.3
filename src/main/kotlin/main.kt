fun main(){
    var amont :Double =10001.00
    var check : Boolean=true
    if(amont>1000 && amont<10001)
    amont-=100
    else(amont>10000)
        amont-=amont*0.05/100;

    if(check)
        amont-=amont*0.01/100
    print("Amount: "+ amont)
}