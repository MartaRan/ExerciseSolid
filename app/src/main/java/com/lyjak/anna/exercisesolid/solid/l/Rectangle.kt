package com.lyjak.anna.exercisesolid.solid.l

open class Rectangle(open var width: Double = 0.0, open var height: Double = 0.00) {

    val area: Double
        get() {
            return width * height
        }

}

//poprawiony kod


open class Rectangle(var width: Double = 0.0, var height: Double = 0.0) { //usunięto open ze zmiennej oraz zmienieno, dla heigght na 0.0

    val area: Double
        get() = calculateArea() //dodano metodę calculateArea, która oblicza powierchnię prostokąta

    private fun calculateArea(): Double {
        return width * height
    }
}

