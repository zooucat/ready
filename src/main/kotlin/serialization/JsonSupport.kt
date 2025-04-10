package zooucat.serialization

import kotlinx.serialization.json.Json

object JsonSupport {

    val json = Json {
        encodeDefaults = true
        prettyPrint = true
        serializersModule = CommonSerializersModule
    }

}