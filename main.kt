fun multiplyByTwo(number: Int): Int {
    return number * 2
}

fun addTen(number: Int): Int {
    return number + 10
}

fun changeNumber(changeFunction: (Int) -> Int, number: Int) {
    val newNumber = changeFunction(number)
    print("$newNumber ")
}

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toList()
    var numberFun: (Int) -> Int = if (this % 2 != 0) ::multiplyByTwo else ::addTen // вот в этой строке крч надо например Int из скобок использовать вместо this
    for (number in numbers) {
        
        changeNumber(numberFun, number)
    }
}
