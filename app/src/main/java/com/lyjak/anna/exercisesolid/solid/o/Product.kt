package com.lyjak.anna.exercisesolid.solid.o

class Product {

    var name: String? = null
    var price: Double = 0.toDouble()
    var type: String? = null

}

//poprawiony kod
data class Product(
    var name: String? = null
    var price: Double = 0.0 //zmienione na liczbę, bo nie wiem co tam było wczesniej
    var type: String? = null
)
