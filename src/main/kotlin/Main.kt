package ru.netology


const val MC = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VKPAY = "VK Pay"




fun main() {
    val amount: Double = 8000015.0
    val weeklyAmount = 15768870
    val card = "Maestro"
    checkInfo(amount, card, weeklyAmount)
}

fun checkInfo(amount: Double, card: String = VKPAY, weeklyAmount: Int = 0){
    when (card) {
        VKPAY->{calculateVK(amount,weeklyAmount)}
        MIR->{calculateVM(amount,weeklyAmount)}
        VISA->{calculateVM(amount, weeklyAmount)}
        MAESTRO->{calculateMCM(amount,weeklyAmount)}
        MC->{calculateMCM(amount,weeklyAmount)}
    }
}

fun calculateVM(amount: Double, weeklyAmount: Int): Double {

    return if (weeklyAmount > 60000000 && amount > 15000000) {
        amount
    } else {
        amount * 0.0075
    }
}

fun calculateMCM(amount:Double, weeklyAmount: Int){
    val commission = (amount * 0.006) + 2000
    val cent = (commission % 100).toInt()
    val rub: Int = (commission / 100) .toInt()
    if (weeklyAmount>60000000)
        print("Нельзя перевести более 600000 рублей в месяц.")
    else if (amount>15000000)
        print("Нельзя перевести более 150000 рублей за один раз.")
    else if (amount in 30001..7499999)
        print("Комиссия составит 0 рублей")
    else
        println("Комиссия составит $rub рублей $cent копеек.")
}

fun calculateVK(amount: Double, weeklyAmount: Int){

    if (weeklyAmount>4000000)
        print("Нельзя перевести более 40000 рублей в месяц.")
    else if (amount>1500000)
        print("Нельзя перевести более 15000 рублей за один раз.")
    else  (amount<30000)
    print("Комиссия составит 0 рублей")
}

fun printComVM (amount: Int) {
    prinln(amount)
}

fun printComMCM (amount: Int) {
    prinln(amount)
}

fun printComVK (amount: Int) {
    prinln(amount)
}

//val cent = (commission % 100).toInt()
//        val rub: Int = (commission / 100) .toInt()