class order (val num: Int){
    private val itemList = mutableListOf<item>()
    fun addItem(newItem:item):order{
        itemList.add(newItem)
        return this
    }
    fun addAll(newitems: List<item>):order{
        itemList.addAll(newitems)
        return this
    }
    fun print(){
        println("Numero do pedido #${num}")
        var total = 0
        for (item in itemList){
            println("${item}: $${item.valor}")
            total += item.valor
        }
        println("total: $${total}")
    }
}
open class item (var name:String, var valor: Int)

class macarrao : item("Macarrao",5){
    override fun toString():String{
        return name
    }
}
class brocolis(vararg val ts : String) : item("brocolis", 3){
    override fun toString():String{
        if(ts.isEmpty()) {
            return "$name foi escolhido pelo chefe"
        }else{
            return name + "," + ts.joinToString(",")
        }
    }
}


fun main(){
    val orderList = mutableListOf<order>()

    val Order = order(1)
    Order.addItem(macarrao())
    Order.print()
    orderList.add(Order)
    println()

    val Order2 = order(2)
    val items = listOf(macarrao(),brocolis("tomate","aipo","cenoura","vagem"))
    Order2.addAll(items)
    Order2.print()
    orderList.add(Order2)
    println()

    val Order3 = order(3).addItem(macarrao()).addItem(brocolis("alface"))
    Order3.print()
    orderList.add(Order3)
    println()

    for(order in orderList){
        order.print()
        println()
    }

    val Macarrao = macarrao()
    val Brocolis = brocolis("tomate","aipo","cenoura","vagem")
    val Brocolis1 = brocolis()

}






