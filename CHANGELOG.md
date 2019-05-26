# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
- Static methods for java users calling `NbtIO`
- Changed the targetCompatibility to Java 8
- Documentation to all public types, functions and properties

### Changed
- JavaDoc will not generate when building on Java 9+ due to a dokka issue

## [0.0.1] - 2019-05-23
### Added
- API to read and write to/from NBT files/streams using `NbtIO`
- API to freely manipulate NBT data loaded in memory

[Unreleased]: https://github.com/GameModsBR/NBT-Manipulator/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/GameModsBR/NBT-Manipulator/compare/a8f41900b32740648752ff214581eb8da0f928f6..v1.0.0