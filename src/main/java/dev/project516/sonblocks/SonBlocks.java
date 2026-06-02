package dev.project516.sonblocks;

import dev.project516.sonblocks.util.ModWorldGen;
import dev.project516.sonblocks.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("sonblocks")
public class SonBlocks {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "sonblocks";

    public SonBlocks() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        ModWorldGen.init();

        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome.getCategory() == Biome.Category.NETHER || biome.getCategory() == Biome.Category.THEEND) {
                continue;
            }
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.RUBY_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONGEBOB_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONG_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.HANDSONITIZER_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.HERECOMESTHESON_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.JIMMYDONALDSON_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.MATHEQUASON_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.MICHAELJACKSON_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONAR_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONGOLIA_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONGRESS_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONNET_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONOPOLY_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONORAVIRUS_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONSET_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONSONSONSAHUR_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.SONY_ORE_GEN
            );
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    ModWorldGen.WOODROWWILSON_ORE_GEN
            );
        }

    }

    /*private void doClientStuff(final FMLClientSetupEvent event) {

    }*/

    public static final ItemGroup TAB = new ItemGroup("sonblocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.RUBY.get());
        }
    };

}
