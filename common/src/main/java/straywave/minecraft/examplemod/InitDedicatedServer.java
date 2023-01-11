package straywave.minecraft.examplemod;

public class InitDedicatedServer {
    public static void init() {
        // Code here will only run on the physical server.
        // So here net.minecraft.client does not exist - be careful!
        // Note: Code here will not run in singleplayer.
    }
}
