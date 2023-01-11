package straywave.minecraft.examplemod.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import straywave.minecraft.examplemod.ExampleMod;

@Mod("examplemod")
public class Entrypoint {
    public Entrypoint() {
        // Code here will run on both physical client and server.
        // Client classes may or may not be available - be careful!
        ExampleMod.LOGGER.info("Hello, Forge!");
        ExampleMod.init();

        // Initialize client and dedicated server entrypoints.
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> EntrypointClient::init);
        DistExecutor.safeRunWhenOn(Dist.DEDICATED_SERVER, () -> EntrypointDedicatedServer::init);
    }
}
