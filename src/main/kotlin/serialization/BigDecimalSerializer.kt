package zooucat.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.math.BigDecimal

/**
 * A custom [KSerializer] for [BigDecimal] that serializes the value as a plain string.
 *
 * This serializer ensures that [BigDecimal] values are serialized using
 * [BigDecimal.toPlainString], preserving the full numeric representation without scientific notation.
 *
 * ### Example:
 * - `BigDecimal("12345.6789")` → `"12345.6789"`
 * - `BigDecimal("1E+3")` → `"1000"`
 *
 * This serializer is useful when precise decimal representation is important,
 * such as for financial or scientific applications.
 */
object BigDecimalSerializer : KSerializer<BigDecimal> {

    /**
     * The descriptor defines the serialized form as a [PrimitiveKind.STRING].
     */
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("BigDecimal", PrimitiveKind.STRING)

    /**
     * Deserializes a [BigDecimal] from its string representation.
     *
     * @param decoder The decoder to read the string from.
     * @return A [BigDecimal] parsed from the string.
     */
    override fun deserialize(decoder: Decoder): BigDecimal {
        return BigDecimal(decoder.decodeString())
    }

    /**
     * Serializes a [BigDecimal] into its plain string representation.
     *
     * @param encoder The encoder to write the string to.
     * @param value The [BigDecimal] value to serialize.
     */
    override fun serialize(encoder: Encoder, value: BigDecimal) {
        encoder.encodeString(value.toPlainString())
    }

}