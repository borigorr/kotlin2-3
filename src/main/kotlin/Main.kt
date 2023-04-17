fun main(args: Array<String>) {
    val isRegularCustomer = true
    val amount = 100.0
    println("покупка — $amount рублей")
    val withDiscount = if (amount <= 1_000) {
        amount
    } else if(amount <= 1_001 && amount > 10_000) {
        print("после применения скидки 100р.")
        amount - 100
    } else {
        print("после применения 5% скидки")
        amount * 0.95
    }
    if (withDiscount != amount) {
        println(" - $withDiscount")
    }
    if (isRegularCustomer) {
        println("после применения 1% скидки — ${withDiscount * 0.99} рубля.")
    }

}