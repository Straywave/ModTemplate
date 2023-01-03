package straywave.minecraft.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod {
    public static Logger LOGGER = LogManager.getLogger("examplemod");

    public static void init() {
        #if MC_1_16_5
        LOGGER.info("This is Minecraft version 1.16.5!");
        #elif MC_1_18_2
        LOGGER.info("This is Minecraft version 1.18.2!");
        #endif
    }
}
