package straywave.minecraft.examplemod.forge;

import net.minecraftforge.fml.common.Mod;
import straywave.minecraft.examplemod.ExampleMod;

@Mod("examplemod")
public class ForgeMod {
    public ForgeMod() {
        ExampleMod.LOGGER.info("Hello, Forge!");
        ExampleMod.init();
    }
}
