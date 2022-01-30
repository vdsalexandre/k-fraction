import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class AdditionFractionTest {
    @Test
    internal fun `should get correct new fraction adding the two same fractions`() {
        val first = Fraction(1, 3)
        val second = Fraction(1, 3)
        val expectedResult = Fraction(2, 3)

        val result = first.add(second)

        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    internal fun `should get correct new fraction adding two fractions with different numerators`() {
        val first = Fraction(1, 5)
        val second = Fraction(2, 5)
        val expectedResult = Fraction(3, 5)

        val result = first.add(second)

        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    internal fun `should get correct new fraction adding a fraction with zero`() {
        val first = Fraction(3, 5)
        val second = Fraction(0)
        val expectedResult = Fraction(3, 5)

        val result = first.add(second)

        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    internal fun `should get correct new fraction adding zero to a fraction`() {
        val first = Fraction(0)
        val second = Fraction(1, 2)
        val expectedResult = Fraction(1, 2)

        val result = first.add(second)

        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    internal fun `should get correct new fraction adding a fraction and one`() {
        val first = Fraction(2, 4)
        val second = Fraction(1)
        val expectedResult = Fraction(6, 4)

        val result = first.add(second)

        assertThat(result).isEqualTo(expectedResult)
    }
}