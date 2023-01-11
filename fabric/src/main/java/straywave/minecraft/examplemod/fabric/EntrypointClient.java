package straywave.minecraft.examplemod.fabric;

import net.fabricmc.api.ClientModInitializer;
import straywave.minecraft.examplemod.InitClient;

public class EntrypointClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        InitClient.init();
    }
}
