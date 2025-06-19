package com.sjocol.actividadextructuras

fun main(){
    //Condicion de Voto
    val edad: Int = 19
    if (edad >= 18){
        println("si puede votar")
    }
    else {
        println("No puede votar")
    }
    println("----------")

    //Condicion comparar dos numeros usando if/else
    val numeroUno : Int = 7
    val numeroDos : Int = 5
    if (numeroUno > numeroDos){
        println("Numero uno es mayor")
    }
    else if (numeroUno<numeroDos){
        println("Numero dos es mayor")
    }
    else {
        println("Los numeros son iguales")
    }
    println("----------")

    //Condición si un numero es positivo con if/else
    val valorNumero : Int = 0
    if (valorNumero < 0){
        println("Estas en numeros rojos")
    }
    else if (valorNumero == 0){
        println("Saldo cero")
    }
    else {
        println("Saldo positivo")
    }
    println("----------")

    //Clasificacion nota de alumno usando when
    val  nota : Int = 0
    when {
        nota in 0.. 5 -> {
            println("Nota: $nota - Reprobado")
        }
        nota == 6 || nota == 7 -> {
            println("Nota: $nota - Regular")
        }
        nota == 8 || nota == 9 ->{
            println("Nota: $nota - Bueno")
        }
        nota == 10 -> {
            println("Nota: $nota - Aprovado")
        }
        else -> {
            println("Nota: $nota La nota debe estar entre 0 y 10")
        }
    }
    println("----------")

    //ciclo for imprimir numero del 0 al 100
    for (numero in 0..100){
        println(numero)
    }
    println("Terminamos de contar hasta 100 ----------")

    //contado usando while
    var numeroContador: Int = 1
        while (numeroContador <=50){
            println(numeroContador)
        numeroContador = numeroContador + 1
    }
    println("El contador a llegado a 50----------")

    //ciclo do-while maximo 5 intentos
    var intentoActual : Int = 1
    val maxIntentos : Int = 5

    do {
        println("Realizando intento No. $intentoActual")
        intentoActual = intentoActual + 1
    }while (intentoActual <= maxIntentos)
    println("Ciclo do-while terminado. Se realizaron $maxIntentos intentos.----")

    //Arreglo y muestra de datos
    val frutas = arrayOf("Manzana", "Fresa", "Mango", "Melon")
        println("Mi arreglo de frutas contiene ${frutas.size} elementos")
        println("La primera fruta es ${frutas[0]}")
        println("La segunda fruta es ${frutas[1]}")
        println("La tercer fruta es ${frutas[2]}")
        println("La cuarta fruta es ${frutas[3]}")
        println("Mostrando todo el listado de frutas-----")

    //Listas y muestra de listas
    val numerosInmutables = listOf(10,20, 30, 40, 50)
        println("Lista de numeros Inmutables $numerosInmutables")
        //numerosInmutables.add (60) //daria error porque son datos inmutables

        val ciudades = mutableListOf("Quetzaltenango", "Flores", "Guatemala")
            println("Listado de ciudades iniciales $ciudades")
            ciudades.add("Mazatenango")
            ciudades.add("Guastatoya")
            println("Listado nuevas ciudades $ciudades")
            println("LISTA DE CIUDADES")
            for (ciudad in ciudades)
                println("Ciudades en la lista------")


}
