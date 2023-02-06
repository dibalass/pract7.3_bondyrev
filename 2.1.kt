import kotlin.math.pow

fun main() {//1 вариант
    try {
        println("Введите y ")
        var y = readLine()!!.toDouble()
        when{
            y>2-> y=y+2
            y<1-> y=y.pow(2)+2*y+0.3
            else -> y=y.pow(3)+2*y.pow(2)+0.3*y+1
        }
        println(y)
    }
    catch (e: Exception) {
        println("ошибка")
    }
}