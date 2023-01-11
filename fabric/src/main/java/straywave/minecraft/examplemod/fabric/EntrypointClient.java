package straywave.minecraft.examplemod.fabric;

import net.fabricmc.api.ClientModInitializer;

public class EntrypointClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Code here will only run on the physical client.
        // So here you can use net.minecraft.client.
    }
}
