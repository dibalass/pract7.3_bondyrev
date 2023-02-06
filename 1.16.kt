import kotlin.math.abs

fun main() {//16 вариант
    try {
        println("Введите V1 ")
        var V1 = readLine()!!.toDouble()
        println("Введите V2 ")
        var V2 = readLine()!!.toDouble()
        println("Введите S ")
        var S = readLine()!!.toDouble()
        println("Введите t ")
        var t = readLine()!!.toDouble()
        var s: Double = abs(S-(V1*t+V2*t))
        when{
            V1<0||V2<0||S<0||t<0->println("ошибка")
            else-> println("расстяние между автомобилями после "+t+" = "+s)
        }
    }
    catch (e: Exception) {
        println("ошибка")
    }
}