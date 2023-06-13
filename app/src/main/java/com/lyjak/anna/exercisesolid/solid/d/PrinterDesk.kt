package com.lyjak.anna.exercisesolid.solid.d

class PrinterDesk(private val printer: DotMatrixPrinterPrinter) {

    fun printFile() {
        printer.print("File Content")
    }

}


//poprawiony kod 

//powinna powtać klasa interface, gdzie będzie zdefiniowana funkcja drukowania "Printer"

inteface Printer {
fun printer(String)
}

class PrinterDesk(private val printer: DotMatrixPrinter) { //usunieto duplikat słowa printer

  fun printFile() {
        printer.print("File Content")
    }

}
