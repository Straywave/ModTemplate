package straywave.minecraft.examplemod.neoforge;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import straywave.minecraft.examplemod.ExampleMod;

#if MC_1_20_4
import net.neoforged.fml.DistExecutor;
#endif

@Mod(ExampleMod.MOD_ID)
public class Entrypoint {
    public Entrypoint() {
        // Code here will run on both physical client and server.
        // Client classes may or may not be available - be careful!
        ExampleMod.LOGGER.info("Hello, NeoForge!");
        ExampleMod.init();

        #if MC_1_20_4
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> EntrypointClient::new);
        DistExecutor.safeRunWhenOn(Dist.DEDICATED_SERVER, () -> EntrypointDedicatedServer::new);
        #else
        // Client and server entrypoints are initialized in EntrypointClient and EntrypointDedicatedServer respectively.
        #endif
    }
}
