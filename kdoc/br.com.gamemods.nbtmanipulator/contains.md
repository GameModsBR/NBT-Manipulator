[br.com.gamemods.nbtmanipulator](index.md) / [contains](./contains.md)

# contains

`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtByte`](-nbt-byte/index.md)`>.contains(value: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtShort`](-nbt-short/index.md)`>.contains(value: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtInt`](-nbt-int/index.md)`>.contains(value: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtLong`](-nbt-long/index.md)`>.contains(value: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtFloat`](-nbt-float/index.md)`>.contains(value: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtDouble`](-nbt-double/index.md)`>.contains(value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtString`](-nbt-string/index.md)`>.contains(value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtByteArray`](-nbt-byte-array/index.md)`>.contains(value: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtByteArray`](-nbt-byte-array/index.md)`>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtIntArray`](-nbt-int-array/index.md)`>.contains(value: `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtIntArray`](-nbt-int-array/index.md)`>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtLongArray`](-nbt-long-array/index.md)`>.contains(value: `[`LongArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtLongArray`](-nbt-long-array/index.md)`>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtCompound`](-nbt-compound/index.md)`>.contains(value: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NbtTag`](-nbt-tag/index.md)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun <T : `[`NbtTag`](-nbt-tag/index.md)`> `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`T`](contains.md#T)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](contains.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`operator fun <T : `[`NbtTag`](-nbt-tag/index.md)`> `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`T`](contains.md#T)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](contains.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtByte`](-nbt-byte/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtByte`](-nbt-byte/index.md)`>>.contains(value: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterByte") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtByte`](-nbt-byte/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtShort`](-nbt-short/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtShort`](-nbt-short/index.md)`>>.contains(value: `[`ShortArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterShort") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtShort`](-nbt-short/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtInt`](-nbt-int/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtInt`](-nbt-int/index.md)`>>.contains(value: `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterInt") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtInt`](-nbt-int/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtLong`](-nbt-long/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtLong`](-nbt-long/index.md)`>>.contains(value: `[`LongArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterLong") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtLong`](-nbt-long/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtFloat`](-nbt-float/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtFloat`](-nbt-float/index.md)`>>.contains(value: `[`FloatArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterFloat") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtFloat`](-nbt-float/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtString`](-nbt-string/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterString") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtString`](-nbt-string/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtByteArray`](-nbt-byte-array/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterByteArray") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtByteArray`](-nbt-byte-array/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtIntArray`](-nbt-int-array/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterIntArray") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtIntArray`](-nbt-int-array/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtLongArray`](-nbt-long-array/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`LongArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterLongArray") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtLongArray`](-nbt-long-array/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`LongArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfList") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtCompound`](-nbt-compound/index.md)`>>.contains(value: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NbtTag`](-nbt-tag/index.md)`>>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
`@JvmName("containsListOfListIterCompound") operator fun `[`NbtList`](-nbt-list/index.md)`<`[`NbtList`](-nbt-list/index.md)`<`[`NbtCompound`](-nbt-compound/index.md)`>>.contains(value: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`NbtTag`](-nbt-tag/index.md)`>>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Checks if the list contains a [NbtTag](-nbt-tag/index.md) with the given value.
