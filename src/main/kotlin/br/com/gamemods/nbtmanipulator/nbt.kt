@file:JvmName("_NbtInternal")
@file:Suppress("unused")

package br.com.gamemods.nbtmanipulator

data class NbtFile(var name: String, var tag: NbtTag) {
    var compound: NbtCompound
        get() = tag as NbtCompound
        set(value) {
            tag = value
        }
}

sealed class NbtTag
object NbtEnd : NbtTag()
data class NbtByte(var value: Byte) : NbtTag() {
    constructor(value: Boolean): this(if (value) BYTE_TRUE else 0)
    constructor(unsigned: Int): this((unsigned and 0xFF).toByte())
}
data class NbtShort(var value: Short) : NbtTag()
data class NbtInt(var value: Int) : NbtTag()
data class NbtLong(var value: Long) : NbtTag()
data class NbtFloat(var value: Float) : NbtTag()
data class NbtDouble(var value: Double) : NbtTag()
data class NbtByteArray(var value: ByteArray): NbtTag() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NbtByteArray

        if (!value.contentEquals(other.value)) return false

        return true
    }

    override fun hashCode(): Int {
        return value.contentHashCode()
    }
}

data class NbtString(var value: String): NbtTag()
data class NbtList<T: NbtTag>(var value: MutableList<T>): NbtTag() {
    constructor(): this(mutableListOf())
    constructor(vararg tags: T): this(tags.toMutableList())
}

fun <T: NbtTag> NbtList(list: List<T>) = NbtList(list.toMutableList())

private inline fun <reified Nbt: NbtTag> NbtList<*>.cast(): NbtList<Nbt> {
    /*check(Nbt::class == NbtTag::class) {
        "NbtTag is not a valid type for NbtList"
    }*/

    if (value.isNotEmpty()) {
        check(value.first()::class == Nbt::class) {
            "Cannot use this list as NbtList<${Nbt::class.simpleName}>"
        }
    }

    @Suppress("UNCHECKED_CAST")
    return this as NbtList<Nbt>
}

private const val BYTE_TRUE: Byte = 1

data class NbtCompound(var value: MutableMap<String, NbtTag>) : NbtTag() {
    constructor(): this(mutableMapOf())
    constructor(vararg tags: Pair<String, NbtTag>): this(mutableMapOf(*tags))

    operator fun get(name: String) = value[name]
    operator fun set(name: String, value: NbtTag) {
        this.value[name] = value
    }

    operator fun set(name: String, value: Boolean) = set(name, if (value) BYTE_TRUE else 0)
    operator fun set(name: String, value: Byte) = set(name, NbtByte(value))
    operator fun set(name: String, value: Short) = set(name, NbtShort(value))
    operator fun set(name: String, value: Int) = set(name, NbtInt(value))
    operator fun set(name: String, value: Long) = set(name, NbtLong(value))
    operator fun set(name: String, value: Float) = set(name, NbtFloat(value))
    operator fun set(name: String, value: Double) = set(name, NbtDouble(value))
    operator fun set(name: String, value: ByteArray) = set(name, NbtByteArray(value))
    operator fun set(name: String, value: String) = set(name, NbtString(value))
    operator fun set(name: String, value: IntArray) = set(name, NbtIntArray(value))
    operator fun set(name: String, value: LongArray) = set(name, NbtLongArray(value))


    fun getBooleanByte(name: String) = getByte(name) == BYTE_TRUE
    fun getNullableBooleanByte(name: String) = getNullableByte(name) == BYTE_TRUE

    fun getByte(name: String) = (value[name] as NbtByte).value
    fun getShort(name: String) = (value[name] as NbtShort).value
    fun getInt(name: String) = (value[name] as NbtInt).value
    fun getLong(name: String) = (value[name] as NbtLong).value
    fun getFloat(name: String) = (value[name] as NbtFloat).value
    fun getDouble(name: String) = (value[name] as NbtDouble).value
    fun getByteArray(name: String) = (value[name] as NbtByteArray).value
    fun getString(name: String) = (value[name] as NbtString).value
    fun getIntArray(name: String) = (value[name] as NbtIntArray).value
    fun getLongArray(name: String) = (value[name] as NbtLongArray).value
    fun getCompound(name: String) = value[name] as NbtCompound
    fun getList(name: String) = value[name] as NbtList<*>

    fun getByteList(name: String) = getList(name).cast<NbtByte>()
    fun getShortList(name: String) = getList(name).cast<NbtShort>()
    fun getIntList(name: String) = getList(name).cast<NbtInt>()
    fun getLongList(name: String) = getList(name).cast<NbtLong>()
    fun getFloatList(name: String) = getList(name).cast<NbtFloat>()
    fun getDoubleList(name: String) = getList(name).cast<NbtDouble>()
    fun getByteArrayList(name: String) = getList(name).cast<NbtByteArray>()
    fun getStringList(name: String) = getList(name).cast<NbtString>()
    fun getIntArrayList(name: String) = getList(name).cast<NbtIntArray>()
    fun getLongArrayList(name: String) = getList(name).cast<NbtLongArray>()
    fun getCompoundList(name: String) = getList(name).cast<NbtCompound>()
    fun getListOfList(name: String) = getList(name).cast<NbtList<*>>()

    fun getNullableByte(name: String) = (value[name] as? NbtByte)?.value
    fun getNullableShort(name: String) = (value[name] as? NbtShort)?.value
    fun getNullableInt(name: String) = (value[name] as? NbtInt)?.value
    fun getNullableLong(name: String) = (value[name] as? NbtLong)?.value
    fun getNullableFloat(name: String) = (value[name] as? NbtFloat)?.value
    fun getNullableDouble(name: String) = (value[name] as? NbtDouble)?.value
    fun getNullableByteArray(name: String) = (value[name] as? NbtByteArray)?.value
    fun getNullableString(name: String) = (value[name] as? NbtString)?.value
    fun getNullableIntArray(name: String) = (value[name] as? NbtIntArray)?.value
    fun getNullableLongArray(name: String) = (value[name] as? NbtLongArray)?.value
    fun getNullableCompound(name: String) = value[name] as? NbtCompound
    fun getNullableList(name: String) = value[name] as? NbtList<*>

    fun getNullableByteList(name: String) = getNullableList(name)?.cast<NbtByte>()
    fun getNullableShortList(name: String) = getNullableList(name)?.cast<NbtShort>()
    fun getNullableIntList(name: String) = getNullableList(name)?.cast<NbtInt>()
    fun getNullableLongList(name: String) = getNullableList(name)?.cast<NbtLong>()
    fun getNullableFloatList(name: String) = getNullableList(name)?.cast<NbtFloat>()
    fun getNullableDoubleList(name: String) = getNullableList(name)?.cast<NbtDouble>()
    fun getNullableByteArrayList(name: String) = getNullableList(name)?.cast<NbtByteArray>()
    fun getNullableStringList(name: String) = getNullableList(name)?.cast<NbtString>()
    fun getNullableIntArrayList(name: String) = getNullableList(name)?.cast<NbtIntArray>()
    fun getNullableLongArrayList(name: String) = getNullableList(name)?.cast<NbtLongArray>()
    fun getNullableCompoundList(name: String) = getNullableList(name)?.cast<NbtCompound>()
    fun getNullableListOfList(name: String) = getNullableList(name)?.cast<NbtList<*>>()

    fun copyFrom(other: NbtCompound, tagName: String, default: NbtTag? = null) {
        val tag = other[tagName] ?: default
        if (tag != null) {
            this[tagName] = tag
        }
    }

    fun copyTo(other: NbtCompound, tagName: String, default: NbtTag? = null) {
        val tag = this[tagName] ?: default
        if (tag != null) {
            other[tagName] = tag
        }
    }
}

data class NbtIntArray(var value: IntArray): NbtTag() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NbtIntArray

        if (!value.contentEquals(other.value)) return false

        return true
    }

    override fun hashCode(): Int {
        return value.contentHashCode()
    }
}

data class NbtLongArray(var value: LongArray) : NbtTag() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NbtLongArray

        if (!value.contentEquals(other.value)) return false

        return true
    }

    override fun hashCode(): Int {
        return value.contentHashCode()
    }
}