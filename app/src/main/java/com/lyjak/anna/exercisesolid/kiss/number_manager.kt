package com.lyjak.anna.exercisesolid.kiss

//is this name of the class correct?
class number_manager(private var mNumber: Int) {

    companion object {
        const val oneHundred = 100
    }

    fun multiply_number(value : Int) {
        mNumber = mNumber * value
    }
}



//poprawiony kod 

class NumberManager(private var number: Int) {//zmiana nazwy klasy, na pisaną duzymi literami, zmienna zosta…a napisana małymi zgodnie z zasadami 

    companion object {
        const val oneHundred = 100
    }

    fun multiplyNumber(value: Int) {. //Zmieniono nazwę metody na multiplyNumber i zastosowano skróconą wersję mnożenia z przypisaniem (number *= value), co jest bardziej zwięzłe i czytelne
        number *= value 
    }
}
