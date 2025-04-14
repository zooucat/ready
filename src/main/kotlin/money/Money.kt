package zooucat.vo

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.math.BigInteger
import java.util.Currency

/**
 * Value object representing a monetary amount with currency.
 *
 * This class wraps a [BigDecimal] value and a [Currency] to ensure consistent
 * monetary operations. It provides factory methods for safe instantiation.
 *
 * It is annotated with [@Serializable] for use with kotlinx.serialization.
 *
 * @property value The monetary value.
 * @property currency The currency of the monetary value.
 */
@Serializable
data class Money(
    @Contextual val value: BigDecimal,
    @Contextual val currency: Currency) {

    companion object {

        /**
         * Creates a [Money] instance from a [String] representation.
         */
        fun of(value: String, currency: Currency): Money =
            Money(BigDecimal(value), currency)

        /**
         * Creates a [Money] instance from an [Int] value.
         */
        fun of(value: Int, currency: Currency): Money =
            Money(BigDecimal(value), currency)

        /**
         * Creates a [Money] instance from a [Long] value.
         */
        fun of(value: Long, currency: Currency): Money =
            Money(BigDecimal(value), currency)

        /**
         * Creates a [Money] instance from a [Double] value.
         *
         * ⚠ Note: Using [Double] may introduce precision issues.
         */
        fun of(value: Double, currency: Currency): Money =
            Money(BigDecimal(value.toString()), currency)

        /**
         * Creates a [Money] instance from a [BigInteger] value.
         */
        fun of(value: BigInteger, currency: Currency): Money =
            Money(BigDecimal(value), currency)

        /**
         * Returns a zero amount for the given currency.
         */
        fun zero(currency: Currency): Money =
            Money(BigDecimal.ZERO, currency)
    }
}