Straywave's Mod Template
========================

A template that lets you build Minecraft mods for multiple versions and multiple loaders at the same time. Note that
Architectury API is *not* included, the only default dependency is Fabric API (on Fabric, obviously).

## Usage

You should know how to use Architectury before using this. In short, Architectury splits up your codebase between 3
sub-projects, `common`, `fabric`, `forge`. Common is where the loader-agnostic code is, Fabric and Forge contain code
for the respective mod loader.

Obviously, not all logic is the same across versions, so that's where Manifold comes in.

[Manifold][1] is a neat little Gradle plugin that, among other things, adds a preprocessor to Java. It brings the C-like
syntax of `#define`, `#if`, `#elif`, and `#endif` to Java.

By default, there are 2 versions, 1.16.5 and 1.18.2. You can write version-specific code like so:

```c
#if MC_1_16_5
System.out.println("Hello, Minecraft 1.16!");
#elif MC_1_18_2
System.out.println("Hello, Minecraft 1.18!");
#endif
```

So, in short, after cloning this repo:

1. Install Manifold plugin in IntelliJ IDEA (other IDEs aren't supported well) and restart IDEA.
2. Run `./gradlew genSources` to decompile Minecraft and have the sources ready.
3. Fill in the blanks in `gradle.properties`, under the "Key mod properties".
4. Start coding!

Some general usage guidance:
- Don't touch `build.properties`. It is auto generated and should be synced with current mappings.
- Use `-Pminecraft=1.16.5` or `-Pminecraft=1.18.2` to specify the target version on the command line.

## Adding a new version

1. Copy-paste one of the existing files in `props/`, name it according to the version.
2. Fill it in with all the latest versions of fabric, forge, etc.
3. Specify it as your Minecraft version in `gradle.properties` and/or `-Pminecraft`
4. Run `./gradlew genSources` to generate sources for the new version.
5. Voila!

## Building everything

Run `build.sh` to build the final JARs. Outputs will be in `forge/build/libs` and `fabric/build/libs`.

[1]: http://manifold.systems
