[br.com.gamemods.nbtmanipulator](../index.md) / [NbtCompound](index.md) / [getNullableCompound](./get-nullable-compound.md)

# getNullableCompound

`fun getNullableCompound(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`NbtCompound`](index.md)`?`

Returns the [NbtCompound](index.md) mapped to that name. The tag will be linked and any modification will
also change the mapped value.

Will return null if no value is mapped or it is mapped to an other type tag.
