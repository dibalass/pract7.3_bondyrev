import kotlin.math.*

fun main() {//1 вариант
    try {
        println("Введите R1 ")
        var R1 = readLine()!!.toDouble()
        println("Введите R2 ")
        var R2 = readLine()!!.toDouble()
        println("Введите R3 ")
        var R3 = readLine()!!.toDouble()
        var R: Double = 1/R1+1/R2+1/R3
        when{
            R1<=0||R2<=0||R3<=0->println("ошибка")
                else->println("общее сопративление "+R)
        }
    } catch (e: Exception) {
        println("ошибка")
    }
}