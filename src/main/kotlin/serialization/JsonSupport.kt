package zooucat.serialization

import kotlinx.serialization.json.Json

/**
 * Centralized configuration for [Json] serialization and deserialization.
 *
 * This object provides a pre-configured [Json] instance with the following features:
 *
 * - `encodeDefaults = true`: Serializes properties with default values.
 * - `prettyPrint = true`: Outputs human-readable, indented JSON.
 * - `serializersModule = CommonSerializersModule`: Registers common contextual serializers,
 *   such as [java.math.BigDecimal] via [BigDecimalSerializer].
 *
 * ### Example usage:
 * ```kotlin
 * val jsonString = JsonSupport.json.encodeToString(data)
 * val data = JsonSupport.json.decodeFromString<MyType>(jsonString)
 * ```
 */
object JsonSupport {

    /**
     * A pre-configured [Json] instance for consistent serialization throughout the project.
     */
    val json = Json {
        encodeDefaults = true
        prettyPrint = true
        serializersModule = CommonSerializersModule
    }

}
