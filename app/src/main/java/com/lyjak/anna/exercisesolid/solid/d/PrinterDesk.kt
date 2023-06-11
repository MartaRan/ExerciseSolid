package com.lyjak.anna.exercisesolid.solid.d

class PrinterDesk(private val printer: DotMatrixPrinterPrinter) {

    fun printFile() {
        printer.print("File Content")
    }

}


//poprawiony kod 

class PrinterDesk(private val printer: DotMatrixPrinter) { //usunieto duplikat słowa printer

    fun printFile(fileContent: String) {//zmieniono metodę aby przekazywała zawartość jako string 
        printer.printText(fileContent)  // a następnie drukowała zawartość przekaznego pliku, a nie jak wcześnej nazwę "File Content
    }

}
