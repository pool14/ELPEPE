package com.pool14.elpepe

class Introduccion {
}

fun main() {
  var  name:String="Jean"
  val  text:String="""
    Hola pepe
  """.trimIndent()
  var  p1:Long=7545455541545145
  var  p2:Int=45424774
  var  p10:Int=45424774
  var  p3:Short=-32768
  var  p4:Byte=-128
  var  p5:Double=10.21
  var  p6:Float=45.45f
  var  p7:Char='8'
  var  p8:Boolean= true


  println("la suma entre $p2 y $p10 es ${p2+p10}")
  println("$name.length es ${name.length}")


  println("ingrese un numero")
  var num1:Int= readLine()!!.toInt()
  println("ingrese un numero")
  var num2:Int= readLine()!!.toInt()
  println("la suma entre $num1 y $num2 es ${num1+num2}")



}
