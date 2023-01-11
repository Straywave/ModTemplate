package straywave.minecraft.examplemod.fabric;

import net.fabricmc.api.DedicatedServerModInitializer;
import straywave.minecraft.examplemod.InitDedicatedServer;

public class EntrypointDedicatedServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        InitDedicatedServer.init();
    }
}
