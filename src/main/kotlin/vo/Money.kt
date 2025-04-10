package zooucat.vo

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.math.BigInteger

@Serializable
data class Money(@Contextual val value: BigDecimal) {

    companion object {

        fun of(value: String): Money = Money(BigDecimal(value))

        fun of(value: Int): Money = Money(BigDecimal(value))

        fun of(value: Long): Money = Money(BigDecimal(value))

        fun of(value: Double): Money = Money(BigDecimal(value))

        fun of(value: BigInteger): Money = Money(BigDecimal(value))

        val ZERO = Money(BigDecimal(0))
    }

}