package zooucat.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.util.*

/**
 * Custom serializer for [Currency] to handle ISO 4217 codes (e.g., "USD", "KRW").
 */
object CurrencySerializer : KSerializer<Currency> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Currency", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Currency) {
        encoder.encodeString(value.currencyCode)
    }

    override fun deserialize(decoder: Decoder): Currency {
        return Currency.getInstance(decoder.decodeString())
    }
}