//high order function
//    fun calculate(x:Int, y:Int, operation:(Int,Int) -> Int): Int{
//        return operation(x,y)
//    }
//    fun sum(x:Int,y:Int) = x + y
//    //fun main() {
//        val sumResult = calculate(4,5,::sum )
//        val mulResult = calculate(4,5){a,b -> a*b}
//        println("sumResult $sumResult, mulResult, $mulResult")
//}
    //high order function returning
//    fun operation(): (Int) -> Int{
//    return ::square
//    }
//    fun square(x:Int) = x * x

//    fun main(){
//        val func = operation()
//        println(func(2))
//    }


    //functions lambda
//    fun main(){
//        val upperCase1: (String) -> String = {str: String -> str.uppercase()}
//        val upperCase2:(String) -> String = {str -> str.uppercase()}
//        val upperCase3 = {str:String -> str.uppercase()}
//
//        val upperCase4: (String) -> String = {it.uppercase()}
//        val upperCase5: (String) -> String = String::uppercase
//
//        println(upperCase1("hello"))
//        println(upperCase2("hello"))
//        println(upperCase3("hello"))
//        println(upperCase4("hello"))
//        println(upperCase5("hello"))
//
//    }


    //suspend functions
//
//import kotlin.coroutines.*
//
//fun main() = runBlocking{
//    doWorld()
//}
//suspend fun doWorld() = coroutineScope{
//    launch{
//    delay(1000L)
//    println("World")
//    }
//    println("hello")
//}


//exceptions
// method try catch
//    fun main(){
//        val a = 10;
//        val b = 0;
//
//        val divisao = try{
//                        a/b
//                        }catch (e: ArithmeticException){
//                            println("exception encontrada")
//                            e.printStackTrace()
//                            print("divisao é igual a: ")
//                            null
//                        }
//                        println(divisao)


//}

        class IllegalException(message:String) : Throwable("Idade Não Compatível")
        @Throws(IllegalException::class)
        fun vote(name:String, idade:Int){
          if(idade < 16){
              throw IllegalException("$name nao pode votar")
          }
            println("voto realizado com sucesso, por: $name:$idade anos")
        }
        fun main(){
            var quantidadeVotos = 0

            quantidadeVotos += try{vote("victor",15);1}catch(e:IllegalException){ 0 }

            quantidadeVotos += try{ vote("Lucas", 15);1}catch(e:IllegalException){ 0 }

            quantidadeVotos += try{vote("Marcos", 15);1}catch(e:IllegalException){ 0 }

            println("total de votos:" + quantidadeVotos)
        }
