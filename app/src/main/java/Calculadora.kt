class Calculadora {

    fun sum (a: Double, b: Double): Double = a + b

    fun substract (a: Double, b: Double): Double = a - b

    fun multiply (a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double {
        if(b == 0.0) throw IllegalArgumentException("Divisão por zero não pode...")
        return a / b
    }

}