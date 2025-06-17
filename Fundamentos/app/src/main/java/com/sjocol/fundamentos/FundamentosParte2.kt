package com.sjocol.fundamentos

fun main(){
    //Interpolacion
    val primerNombre:String ="Pepito"
    var primerApellido:String ="Juarez"
    val edad:Int = 8
    val estatura:Double = 1.20
    //val presentacion:String ="Hola mi nombre es " + primerNombre + " " +edad + " " + estatura
    val presentacion:String ="Hola mi nombre es $primerNombre $primerApellido y " +
            "tengo la edad de $edad anios, con una estatura de $estatura mts"

    println(presentacion)


}