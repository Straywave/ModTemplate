package straywave.minecraft.examplemod.fabric;

import net.fabricmc.api.ModInitializer;
import straywave.minecraft.examplemod.ExampleMod;

public class FabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.LOGGER.info("Hello, Fabric!");
        ExampleMod.init();
    }
}
