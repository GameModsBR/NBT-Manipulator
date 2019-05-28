[br.com.gamemods.nbtmanipulator](../index.md) / [NbtCompound](index.md) / [getNullableBooleanByte](./get-nullable-boolean-byte.md)

# getNullableBooleanByte

`fun getNullableBooleanByte(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns `true` if [getByte](get-byte.md) returns `1`, `false` otherwise.
Will also return `false` if the value is not mapped.

### Exceptions

`ClassCastException` - If the [NbtTag](../-nbt-tag/index.md) is not a [NbtByte](../-nbt-byte/index.md)