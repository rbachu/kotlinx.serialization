/*
 * Copyright 2017-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */
package kotlinx.serialization


@SerialInfo
@Target(AnnotationTarget.PROPERTY)
@Deprecated(message = "SerialId is renamed to ProtoId to better reflect its semantics",
    level = DeprecationLevel.WARNING, replaceWith = ReplaceWith("ProtoId", imports = ["kotlinx.serialization.protobuf.*"])
)
annotation class SerialId @Deprecated(message = "SerialId is renamed to ProtoId to better reflect its semantics",
    level = DeprecationLevel.WARNING, replaceWith = ReplaceWith("ProtoId(id)", imports = ["kotlinx.serialization.protobuf.*"])
) constructor(val id: Int)
