[br.com.gamemods.nbtmanipulator](../index.md) / [NbtIO](index.md) / [readNbtFile](./read-nbt-file.md)

# readNbtFile

`@JvmStatic fun readNbtFile(inputStream: `[`InputStream`](https://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html)`, compressed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`NbtFile`](../-nbt-file/index.md)

Read a [NbtFile](../-nbt-file/index.md) from the [InputStream](https://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html).

### Parameters

`inputStream` - The input stream that will be read

`compressed` - If the file needs to be decompressed by [GZIPInputStream](https://docs.oracle.com/javase/6/docs/api/java/util/zip/GZIPInputStream.html)`@JvmStatic fun readNbtFile(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, compressed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`NbtFile`](../-nbt-file/index.md)

Read a [NbtFile](../-nbt-file/index.md) from a [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html).

### Parameters

`file` - The input file that will be read

`compressed` - If the file needs to be decompressed by [GZIPInputStream](https://docs.oracle.com/javase/6/docs/api/java/util/zip/GZIPInputStream.html)