package com.lyjak.anna.exercisesolid.kiss

import java.util.Date

//what this class can do? it suggests to store time data
object Time {

    const val MILISECONDS: Long = 36000 //what it is?

    //smaller than what? and what is time?
    fun isTimeSmaller(value: Long): Boolean {
        return value < System.currentTimeMillis()
    }

    //smaller than what?
    fun isDateSmaller(value: Date): Boolean {
        return value.time < System.currentTimeMillis()
    }

    //what does it mean?
    fun daysTime(value: Long): Long {
        return value / MILISECONDS
    }

    //what does it mean?
    fun daysDate(value: Date): Long {
        return value.time / MILISECONDS
    }
}


//poprawiona wersja

//Zmieniono nazwy metod daysTime() i daysDate() na bardziej opisowe convertDaysToMilliseconds() i convertMillisecondsToDays(). 
//Te metody konwertują między dniami a milisekundami, korzystając z zdefiniowanej stałej MILLISECONDS_PER_DAY.

object Time {
    private const val MILLISECONDS_PER_DAY: Long = 24 * 60 * 60 * 1000 //Zdefiniowano tylko jedną stałą reprezentującą liczbę milisekund w jednym dniu.
    fun isTimeSmaller(value: Long): Boolean {
        return value < getCurrentTimeInMillis()
    }

    fun isDateSmaller(value: Date): Boolean { //Metoda ta sprawdza, czy podana data jest wcześniejsza od aktualnego czasu. Podobnie jak w przypadku metody isTimeSmaller(), użyto prywatnej metody getCurrentTimeInMillis() do pobrania aktualnego czasu.
        return value.time < getCurrentTimeInMillis()
    }

    fun convertDaysToMilliseconds(days: Long): Long {
        return days * MILLISECONDS_PER_DAY
    }

    fun convertMillisecondsToDays(milliseconds: Long): Long {
        return milliseconds / MILLISECONDS_PER_DAY
    }

    private fun getCurrentTimeInMillis(): Long { // Metoda ta sprawdza, czy podana wartość czasu (w milisekundach) jest mniejsza od aktualnego czasu i oddzielamy logikę pobierania aktualnego czasu
        return System.currentTimeMillis()
    }
}
