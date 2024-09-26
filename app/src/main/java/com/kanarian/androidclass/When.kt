package com.kanarian.androidclass

fun main(){
    getMonth(2)
}

fun result(value:Any){
    when(value){
        is Int-> value + value
        is String-> println(value)
        is Boolean-> if(value) println("owo")
    }
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

fun getTrimester(month:Int){
    when(month){
        1,2,3 -> println("Primer trimestre")

        4,5,6 -> println("Segundo trimestre")

        7,8,9 -> println("Tercer trimestre")

        10,11,12 -> println("Cuarto trimestre")

        else -> println("no existe ese mes")
    }
}

fun getSemester(month:Int){
    when(month){
        in 1..6 -> println("Primer Semestre")

        in 7..12 -> println("Segundo Semestre")

        !in 1..12 -> println("no existe ese mes")
    }
}