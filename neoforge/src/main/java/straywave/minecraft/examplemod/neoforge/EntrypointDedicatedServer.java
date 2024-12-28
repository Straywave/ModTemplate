package straywave.minecraft.examplemod.neoforge;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import straywave.minecraft.examplemod.ExampleMod;
import straywave.minecraft.examplemod.InitDedicatedServer;

#if !MC_1_20_4
@Mod(value = ExampleMod.MOD_ID, dist = Dist.DEDICATED_SERVER)
#endif
public class EntrypointDedicatedServer {
    public EntrypointDedicatedServer() {
        InitDedicatedServer.init();
    }
}
