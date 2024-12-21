fun main() {

    val customerStatus: Int = 1; /* Статус покупателя
                                  * 1 если постоянный (приобретает музыку каждый месяц)
                                  * скидка постоянного покупателя + 1%
                                  * 0 если не постоянный */

    var discount: Float = 100F; // скидка при покупке на сумму от 1001 до 10 000р

    val purchaseAmount: Float = 9_000F;

    var amountWithDiscont: Float = purchaseAmount;

    if(purchaseAmount > 1001.0 && purchaseAmount < 10_000.0){
        amountWithDiscont -= discount; // фиксированная скидка 100 рублей
    }
    else {
        discount = purchaseAmount * 0.05F; // скидка 5% для сумм свыше 10_000 р.
        amountWithDiscont -= discount;
    }

    if(customerStatus == 1){
        amountWithDiscont *= 0.99F; /* Доп. скидка для постоянных покупателй
                                                        * в размере 1% */
    }

    println("Итоговая стоимость покупки " + (Math.round(amountWithDiscont)) + " рублей");
}