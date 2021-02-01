fun main(){
    var previousAmount=1005

    var amont :Double =10001.00
    var check : Boolean=true
    if(previousAmount>1000 && previousAmount<10001)
    amont-=100
     if(previousAmount>10000)
        amont-=amont*0.05/100;

    if(check)
        amont-=amont*0.01/100
    print("Amount: "+ amont)
}