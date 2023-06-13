package com.lyjak.anna.exercisesolid.solid.s

class Book {
    var author: String? = null
    var text: String? = null
    var name: String? = null

    fun print() = println(text)
}

//poprwiony kod

class Book {
    var author: String? = null
    var text: String? = null
    var name: String? = null

    fun printBookInfo() { //utworzono print book info jako osobna funckję 
        println("Book Name: $name")
        println("Author: $author")
        println("Text: $text")
    }
}
