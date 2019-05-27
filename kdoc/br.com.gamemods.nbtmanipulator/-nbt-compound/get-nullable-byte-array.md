[br.com.gamemods.nbtmanipulator](../index.md) / [NbtCompound](index.md) / [getNullableByteArray](./get-nullable-byte-array.md)

# getNullableByteArray

`fun getNullableByteArray(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?`

Returns the unwrapped byte array value. The array will be linked and any modification will
also change wrapper and the mapped value.

Will return null if no value is mapped or it is mapped to an other type tag.
