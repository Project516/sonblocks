package dev.project516.sonblocks;

import dev.project516.sonblocks.util.ModWorldGen;
import dev.project516.sonblocks.util.RegistryHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(SonBlocks.MOD_ID)
public class SonBlocks {
    public static final String MOD_ID = "sonblocks";

    public SonBlocks(IEventBus modEventBus) {
        RegistryHandler.register(modEventBus);
        ModWorldGen.register(modEventBus);
        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
