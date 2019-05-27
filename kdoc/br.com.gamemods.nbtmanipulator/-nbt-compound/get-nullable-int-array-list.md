[br.com.gamemods.nbtmanipulator](../index.md) / [NbtCompound](index.md) / [getNullableIntArrayList](./get-nullable-int-array-list.md)

# getNullableIntArrayList

`fun getNullableIntArrayList(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`NbtList`](../-nbt-list/index.md)`<`[`NbtIntArray`](../-nbt-int-array/index.md)`>?`

Returns the [NbtList](../-nbt-list/index.md) of int arrays mapped to that name. The tag and it's value will be linked and any modification will
also change the mapped value.

Will return null if no value is mapped or it is mapped to an other type tag.

### Exceptions

`IllegalStateException` - If the list is not empty and contains any tag with class different then [NbtIntArray](../-nbt-int-array/index.md)