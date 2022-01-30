data class Fraction(val numerator: Int, val denominator: Int = numerator) {

    fun add(other: Fraction): Fraction {
        return when {
            denominator == 0 -> Fraction(numerator + other.numerator, other.denominator)
            hasTheSameDenominator(other) -> Fraction(numerator + other.numerator, denominator)
            else -> {
                Fraction(numerator + other.toTheSameDenominator(denominator).numerator, denominator)
            }
        }
    }

    private fun hasTheSameDenominator(other: Fraction) = denominator == other.denominator

    private fun toTheSameDenominator(denominator: Int) =
        Fraction(numerator * denominator, denominator * denominator)
}