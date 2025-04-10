package zooucat.serialization

import kotlinx.serialization.modules.SerializersModule
import java.math.BigDecimal

val CommonSerializersModule = SerializersModule {
    contextual(BigDecimal::class, BigDecimalSerializer)
}