package com.lyjak.anna.exercisesolid.solid.o

class ShoppingCartService {

    fun calculateTotalOrder(products: List<Product>): Double {
        var orderTotal = 0.0

        for (product in products) {
            if ("FOOD" == product.type) {
                orderTotal += product.price + product.price * 0.08
            } else if ("CAR" == product.type) {
                orderTotal += product.price * 1.60 * 1.18
            } else if ("Electronics" == product.type) {
                orderTotal += product.price * 1.18
            }
        }

        return orderTotal
    }

}

//poprawiony kod
class ShoppingCartService {

    fun calculateTotalOrder(products: List<Product>): Double { //Wydzielono obliczenia dla poszczególnych produktów do prywatnej metody calculateProductTotal,
                                                               //która przyjmuje pojedynczy produkt i zwraca obliczoną wartość.
        var orderTotal = 0.0

        for (product in products) {
            orderTotal += calculateProductTotal(product)
        }

        return orderTotal
    }

    private fun calculateProductTotal(product: Product): Double { //wydzielono prywatną funkcję, gdzie można wyliczyć dla każdego produktu inna wartość 
        return when (product.type) { //Zastosowano instrukcję when do sprawdzania typu produktu. Dzięki temu kod jest bardziej czytelny i eliminuje potrzebę wielokrotnego sprawdzania warunków if-else.
            "FOOD" -> product.price + product.price * 0.08
            "CAR" -> product.price * 1.60 * 1.18
            "Electronics" -> product.price * 1.18
            else -> product.price
        }
    }
}
