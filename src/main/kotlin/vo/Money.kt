package zooucat.vo

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.math.BigInteger

/**
 * Value object representing a monetary amount.
 *
 * This class wraps a [BigDecimal] value to ensure consistency and
 * provide factory methods for easier and safer instantiation.
 *
 * It is annotated with [@Serializable] for use with kotlinx.serialization.
 *
 * @property value The monetary value represented as [BigDecimal].
 */
@Serializable
data class Money(@Contextual val value: BigDecimal) {

    companion object {

        /**
         * Creates a [Money] instance from a [String] representation.
         *
         * @param value A numeric string (e.g., "123.45").
         * @return A [Money] instance.
         * @throws NumberFormatException if the input is not a valid number.
         */
        fun of(value: String): Money = Money(BigDecimal(value))

        /**
         * Creates a [Money] instance from an [Int] value.
         */
        fun of(value: Int): Money = Money(BigDecimal(value))

        /**
         * Creates a [Money] instance from a [Long] value.
         */
        fun of(value: Long): Money = Money(BigDecimal(value))

        /**
         * Creates a [Money] instance from a [Double] value.
         *
         * ⚠ Note: Using [Double] may introduce precision issues.
         */
        fun of(value: Double): Money = Money(BigDecimal(value))

        /**
         * Creates a [Money] instance from a [BigInteger] value.
         */
        fun of(value: BigInteger): Money = Money(BigDecimal(value))

        /**
         * A constant representing zero monetary value.
         */
        val ZERO = Money(BigDecimal(0))
    }

}