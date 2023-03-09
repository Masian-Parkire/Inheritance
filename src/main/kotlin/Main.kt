fun main() {
val car = Car("Subaru","F200","blue",7)
    car.carry(12)
    car.identity()


    var result =car.calculateParkingFees(7)
    println(result)

    var bus = Bus("Scania","V8","yellow",30)

var new = bus.maxTripFare(170.00)
    println(new)

    var all = bus.calculateParkingFees(6)
    println(all)

}
 open class Car( var make:String, var model:String,var color:String,var capacity:Int){

    fun carry(people:Int){
        var x = (people - capacity)
        if (people<=capacity){
            println("carrying $people passengers")
        }
        else if (people>capacity){
            println("over capacity by $x people")
        }
    }
    fun identity(){
println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        var Calc = hours * 20
        return Calc
    }
}
class Bus( make:String, model:String, color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var calculate = capacity * fare
        return calculate
    }

    override fun calculateParkingFees(hours: Int): Int {
        var fees = hours * capacity
        return fees
    }
}

//override fun calculatepackingFees(hours: Int): Int {
//      var w= hours*capacity
//      return w

