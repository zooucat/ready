package zooucat.serialization

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.contextual
import java.math.BigDecimal
import java.util.Currency

/**
 * A shared [SerializersModule] that registers commonly used serializers across the application.
 *
 * Currently, it includes:
 * - [BigDecimal] with [BigDecimalSerializer]: ensures that all `BigDecimal` values
 *   are serialized/deserialized using a consistent plain string format.
 *
 * This module can be injected into a [kotlinx.serialization.json.Json] configuration to
 * enable contextual serialization for registered types.
 *
 * ### Example usage:
 * ```kotlin
 * val json = Json {
 *     serializersModule = CommonSerializersModule
 * }
 * ```
 */
val CommonSerializersModule = SerializersModule {
    contextual(BigDecimal::class, BigDecimalSerializer)
    contextual(Currency::class, CurrencySerializer)
}
