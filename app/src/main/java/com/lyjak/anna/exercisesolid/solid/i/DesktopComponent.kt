package com.lyjak.anna.exercisesolid.solid.i

class DesktopComponent : Component {

    override fun mouseover(event: String) {
        println("Mouse click Event Fired")
    }

    override fun touch(event: String) {
        throw UnsupportedOperationException("touch not supported")
    }

    override fun swipe(event: String) {
        throw UnsupportedOperationException("swipe not supported")
    }

    override fun validate() {
        println("All UI i valid")
    }

}