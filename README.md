Straywave's Mod Template
========================

A template that lets you build Minecraft mods for multiple versions and multiple loaders at the same time. Note that
Architectury API is *not* included, the only default dependency is Fabric API (on Fabric only). A GitHub Workflow
is also included to help automate building and testing for pull requests.

## Usage

You should know how to use [Architectury] before using this. In short, Architectury splits up your codebase between a few
subprojects, `common`, `fabric`, `forge`, and `neoforge`. Common is where the loader-agnostic code is, and the other
subprojects contain code that is specific to their respective mod loader.

This takes care of differences between loaders, however there are still major differences in logic between different
game versions, and that's where Manifold comes in. [Manifold] is a neat little Gradle plugin that, among other things,
adds a preprocessor, which brings the C-like conditional compilation syntax of `#if`, `#elif`, `#else`, and `#endif` to
Java.

By default, there are 3 versions, 1.20.4, 1.21.1, and 1.21.4. You can write version-specific code like so:

```c
#if MC_1_20_4
System.out.println("Hello, Minecraft 1.20.4!");
#elif MC_1_21_1
System.out.println("Hello, Minecraft 1.21.1!");
#elif MC_1_21_4
System.out.println("Hello, Minecraft 1.21.4!");
#endif
```

So, in short, after cloning this repo:

1. Install the "Minecraft Development" and "Manifold" plugins in IntelliJ IDEA (other IDEs aren't supported well).
2. Run `./gradlew genSources` to decompile Minecraft and have the sources ready.
3. Fill in the blanks in `gradle.properties`, under the "Key mod properties".
4. Start coding!

Some general usage guidance:

- Don't touch `build.properties`. It is auto generated and should be synced with current mappings.
- Use `-Pminecraft=1.20.4`, (or `1.21.1`/`1.21.4`) to specify the target version on the command line.
  - You can specify the default version to build for (when `-Pminecraft` is omitted) in `gradle.properties`.
- The minimum supported version of Minecraft is currently 1.20.4. For older versions, please use an older version of the
  template (however, it will be very difficult, if not impossible, to support 1.20.4+ when doing so).

## Adding a new version

1. Copy-paste one of the existing files in `props/`, name it according to the version.
2. Fill it in with all the latest versions of fabric, forge, etc.
3. Specify it as your Minecraft version in `gradle.properties` and/or `-Pminecraft`
4. Run `./gradlew genSources` to generate sources for the new version.
5. Voila!

## Building everything

Run `build.sh` to build the final JARs. Outputs for Fabric, Forge, and NeoForge will be in `fabric/build/libs`,
`forge/build/libs`, and `neoforge/build/libs` respectively.

Pushing changes or making a pull request to a GitHub repository using this template will also cause the mod to be built
for all platforms, and the resulting artifacts will be uploaded and attached to the workflow run (retained for 90 days).

[Architectury]: https://docs.architectury.dev/
[Manifold]: http://manifold.systems/
