package com.kanarian.androidclass

fun main(){
    getMonth(2)
}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11-> println("noviembre")
        12-> println("diciembre")
        else -> println("no existe ese mes")
    }
}