package com.lyjak.anna.exercisesolid.solid.l

class Square : Rectangle() {

    override var height: Double
        get() = throw IllegalAccessException()
        set(height) {
            throw IllegalAccessException()
        }

    override var width: Double
        get() = throw IllegalAccessException()
        set(width) {
            throw IllegalAccessException()
        }

}
//poprawiony kod

class Square(side: Double) : Rectangle {}// dodano odnośnil do klasy Rectangle p której dziedziczy Square
