package straywave.minecraft.examplemod.fabric;

import net.fabricmc.api.DedicatedServerModInitializer;

public class EntrypointDedicatedServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        // Code here will only run on the physical server.
        // So here net.minecraft.client does not exist - be careful!
        // Note: Code here will not run in singleplayer.
    }
}
