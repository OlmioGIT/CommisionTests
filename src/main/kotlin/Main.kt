package ru.netology


const val MC = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VKPAY = "VK Pay"




fun main() {
    val amount: Double = 8000015.0
    val weeklyAmount = 6000000
    val card = "Maestro"
    goCal(amount, card, weeklyAmount)
}

fun goCal(amount: Double, card: String = VKPAY, weeklyAmount: Int = 0){
    when (card) {
        VKPAY-> { if (weeklyAmount > 4000000 || amount > 1500000) {print("Нельзя перевести более 40000 рублей в месяц и более 15000 рублей за раз.")}
        else   printAll(calculateAll(amount,card))}
        MIR->{if (weeklyAmount > 60000000 || amount > 15000000){print("Нельзя перевести более 600000 рублей в месяц и более 150000 рублей за раз.")}
        else printAll(calculateAll(amount,card))}
        VISA->{if (weeklyAmount > 60000000 || amount > 15000000){print("Нельзя перевести более 600000 рублей в месяц и более 150000 рублей за раз.")}
        else  printAll(calculateAll(amount,card))}
        MAESTRO->{if (weeklyAmount > 60000000 || amount > 15000000){print("Нельзя перевести более 600000 рублей в месяц и более 150000 рублей за раз.")}
        else  printAll(calculateAll(amount,card))}
        MC->{if (weeklyAmount > 60000000 || amount > 15000000){print("Нельзя перевести более 600000 рублей в месяц и более 150000 рублей за раз.")}
        else  printAll(calculateAll(amount,card))}
    }
}

fun calculateAll(amount: Double, card: String = VKPAY): Double {0
    val comm =  amount * 0.0075
    return when (card) {
        MAESTRO, MC -> if (amount in 30001.0..7499999.0) {
            return amount * 0
        } else {
            return ((amount * 0.006) + 2000)
        }
        MIR, VISA ->  if (comm < 3500 ) {return 3500.0} else { return comm}

        else -> return amount * 0
    }
}

fun printAll(commission: Double) {
    val cent = (commission % 100).toInt()
    val rub: Int = (commission / 100) .toInt()
    println("Комиссия составит $rub рублей $cent копеек.")
}