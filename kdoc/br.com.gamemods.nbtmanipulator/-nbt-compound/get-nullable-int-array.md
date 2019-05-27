[br.com.gamemods.nbtmanipulator](../index.md) / [NbtCompound](index.md) / [getNullableIntArray](./get-nullable-int-array.md)

# getNullableIntArray

`fun getNullableIntArray(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`?`

Returns the unwrapped int array value. The array will be linked and any modification will
also change wrapper and the mapped value.

Will return null if no value is mapped or it is mapped to an other type tag.
