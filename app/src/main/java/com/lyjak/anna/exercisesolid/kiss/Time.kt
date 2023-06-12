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

//Zmieniono nazwę stałej MILISECONDS na MILLISECONDS_PER_HOUR, aby bardziej precyzyjnie odzwierciedlała jej przeznaczenie. Reprezentuje liczbę milisekund w ciągu jednej godziny.
//Zmieniono nazwę funkcji isTimeSmaller na isBeforeCurrentTime, aby precyzyjnie odzwierciedlać intencję funkcji. Funkcja sprawdza, czy podana wartość czasu jest wcześniejsza niż bieżący czas.
//Zmieniono nazwę funkcji isDateSmaller na isBeforeCurrentDate, aby poprawić czytelność. Funkcja sprawdza, czy podana wartość daty jest wcześniejsza niż bieżąca data.
//Zmieniono nazwę funkcji daysTime na getHoursFromTime, aby lepiej opisywała działanie funkcji. Oblicza liczbę godzin na podstawie podanej wartości czasu.
//Zmieniono nazwę funkcji daysDate na getHoursFromDate, aby poprawić czytelność. Oblicza liczbę godzin na podstawie podanej wartości daty.

object Time {

    private const val MILLISECONDS_PER_HOUR: Long = 3600000

    fun isBeforeCurrentTime(value: Long): Boolean {
        return value < System.currentTimeMillis()
    }

    fun isBeforeCurrentDate(value: Date): Boolean {
        return value.time < System.currentTimeMillis()
    }

    fun getHoursFromTime(value: Long): Long {
        return value / MILLISECONDS_PER_HOUR
    }

    fun getHoursFromDate(value: Date): Long {
        return value.time / MILLISECONDS_PER_HOUR
    }
}
