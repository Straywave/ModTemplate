package straywave.minecraft.examplemod.fabric;

import net.fabricmc.api.ModInitializer;
import straywave.minecraft.examplemod.ExampleMod;

public class Entrypoint implements ModInitializer {
    @Override
    public void onInitialize() {
        // Code here will run on both physical client and server.
        // Client classes may or may not be available - be careful!
        ExampleMod.LOGGER.info("Hello, Fabric!");
        ExampleMod.init();
    }
}
