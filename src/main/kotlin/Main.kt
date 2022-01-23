package ru.netology


const val MC = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VKPAY = "VK Pay"




fun main() {
    val amount = 8000015
    val weeklyAmount = 6000000
    val card = "Maestro"
    goCal(amount, card, weeklyAmount)
}

fun goCal(amount: Int, card: String = VKPAY, weeklyAmount: Int = 0){
    when (card) {
        VKPAY-> { if (weeklyAmount > 4000000 || amount > 1500000) {print("Нельзя перевести более 40000 рублей в месяц и более 15000 рублей за раз.")}
        else   printAll(calculateAll(amount,card))}
        MIR, VISA->{if (weeklyAmount > 60000000 || amount > 15000000){print("Нельзя перевести более 600000 рублей в месяц и более 150000 рублей за раз.")}
        else  printAll(calculateAll(amount,card))}
        MAESTRO, MC->{if (weeklyAmount > 60000000 || amount > 15000000){print("Нельзя перевести более 600000 рублей в месяц и более 150000 рублей за раз.")}
        else  printAll(calculateAll(amount,card))}
    }
}

fun calculateAll(amount: Int, card: String = VKPAY): Int {0
    val comm =  amount * 0.0075
     when (card) {
        MAESTRO, MC -> if (amount in 30001..7499999) return (amount * 0).toInt() else return (((amount * 0.006) + 2000).toInt())
        MIR, VISA ->  if (comm < 3500 ) return 3500 else  return comm.toInt()
        else -> return (amount * 0).toInt()
    }
}

fun printAll(commission: Int) {
    val cent = (commission % 100).toInt()
    val rub: Int = (commission / 100) .toInt()
    println("Комиссия составит $rub рублей $cent копеек.")
}