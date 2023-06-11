package com.lyjak.anna.exercisesolid.solid.i

class AndroidComponent : Component {

    override fun mouseover(event: String) {
        throw UnsupportedOperationException("mouse click not supported")
    }

    override fun touch(event: String) {
        println("Touch Event Fired")
    }

    override fun swipe(event: String) {
        println("Swipe Event Fired")
    }

    override fun validate() {
        println("All UI i valid")
    }

}

//poprawiony kod


class AndroidComponent : Component {

    override fun mouseover(event: String) {
        throw UnsupportedOperationException("Mouse click not supported")//dodano wielką literę w komunikacie
    }

    override fun touch(event: String) {
        println("Touch event fired: $event")//zastosowano odnośnik do event 
    }

    override fun swipe(event: String) {
        println("Swipe event fired: $event") //zastosowano odnośnik do event 
    }

    override fun validate() {
        println("UI is valid")//zmienio literówkę z "i" na "is" 
    }
}
