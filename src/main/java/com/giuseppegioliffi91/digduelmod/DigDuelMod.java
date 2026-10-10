package com.giuseppegioliffi91.digduelmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class DigDuelMod implements ModInitializer {
    public static final String MOD_ID = "digduelmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing DigDuel Mod");
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
