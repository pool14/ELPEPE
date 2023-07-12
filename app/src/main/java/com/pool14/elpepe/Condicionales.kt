package com.pool14.elpepe

class Condicionales {
}

fun main() {

    /*println("ingrese numero 1")
    var num1:Int= readLine()!!.toInt()

    println("ingrese numero 2")
    var num2:Int= readLine()!!.toInt()

    if (num1>num2){
        println("El numero $num1 es mayor y el $num2 es menor")
    } else if(num1==num2){
        println("El numero $num1 y $num1 son iguales")
    }else{

        println("El numero $num2 es mayor y el $num1 es menor")
    }
*/

    println("ingrese un numero de 1 a 20")
    var number:Int= readLine()!!.toInt()
    if (number in 1..20){
        println("El numero esta en el rango")
    }else{
        println("Te dije un numero que este en el rango")

    }
    var results: Int=(1..50).random()
    println("El numero es $results")

    when(results){
        0 -> println("No hay resultados")
        1,2,3,4,5-> println("hay menos de 5 result")
    }
}