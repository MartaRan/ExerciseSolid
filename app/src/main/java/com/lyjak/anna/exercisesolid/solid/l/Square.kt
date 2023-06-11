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

class Square(side: Double) : Rectangle(side, side) {// dodano odnośnil do klasy Rectangle p której dziedziczy Square
    override var width: Double //W konstruktorze klasy Square przekazano tę samą wartość jako szerokość i wysokość prostokąta, aby utworzyć kwadrat.
        get() = super.width //Przesłonięto właściwości width i height, aby zapobiec ich modyfikacji dla obiektów typu Square.
        set(width) {
            throw IllegalAccessException("Cannot modify width of a square")
        }

    override var height: Double //W metodzie setter dla właściwości width i height rzucono wyjątek IllegalAccessException, aby wskazać, że szerokość i wysokość kwadratu nie mogą być modyfikowane.
        get() = super.height
        set(height) {
            throw IllegalAccessException("Cannot modify height of a square")
        }
}
