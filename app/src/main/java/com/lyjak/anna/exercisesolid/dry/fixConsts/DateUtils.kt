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

class DateUtils {
    companion object {
        private const val MILLISECONDS_PER_SECOND = 1000
        private const val SECONDS_PER_MINUTE = 60
        private const val MINUTES_PER_HOUR = 60
        private const val HOURS_PER_DAY = 24
    }

    fun convertMillisecondsToDays(milliseconds: Long): Long {
        return milliseconds / (MILLISECONDS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY)
    }

    fun convertDaysToMilliseconds(days: Long): Long {
        return days * (MILLISECONDS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY)
    }
}
