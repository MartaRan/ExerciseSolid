package com.lyjak.anna.exercisesolid.dry.fixConsts

class DateUtils {

    fun getDaysInMiliseconds(miliseconds: Long): Long {
        return miliseconds / 1000 * 60 * 60 * 24
    }

    fun getMilisecondsInDays(days: Long): Long {
        return days * 1000 * 60 * 60 * 24
    }
}



//poprawiona wersja
//Wyodrębniono wartość MILLISECONDS_PER_DAY jako pole klasy, aby uniknąć powtarzania obliczeń w obu funkcjach.
//Zmieniono nazwy funkcji na bardziej adekwatne: getDaysInMiliseconds zmieniono na getDaysInMilliseconds, getMilisecondsInDays zmieniono na getMillisecondsInDays.
//Poprawiono obliczenia w funkcjach getDaysInMilliseconds i getMillisecondsInDays, aby używały jednej wspólnej wartości MILLISECONDS_PER_DAY, zamiast powtarzać obliczenia.


class DateUtils {

    private val MILLISECONDS_PER_DAY: Long = 24 * 60 * 60 * 1000

    fun getDaysInMilliseconds(milliseconds: Long): Long {
        return milliseconds / MILLISECONDS_PER_DAY
    }

    fun getMillisecondsInDays(days: Long): Long {
        return days * MILLISECONDS_PER_DAY
    }
}
