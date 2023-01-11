package straywave.minecraft.examplemod.forge;

public class EntrypointDedicatedServer {
    public static void init() {
        // Code here will only run on the physical server.
        // So here net.minecraft.client does not exist - be careful!
        // Note: Code here will not run in singleplayer.
    }
}
