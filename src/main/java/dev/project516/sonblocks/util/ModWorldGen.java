package dev.project516.sonblocks.util;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;

public class ModWorldGen {

    public static ConfiguredFeature<?, ?> RUBY_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONGEBOB_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONG_ORE_GEN;
    public static ConfiguredFeature<?, ?> HANDSONITIZER_ORE_GEN;
    public static ConfiguredFeature<?, ?> HERECOMESTHESON_ORE_GEN;
    public static ConfiguredFeature<?, ?> JIMMYDONALDSON_ORE_GEN;
    public static ConfiguredFeature<?, ?> MATHEQUASON_ORE_GEN;
    public static ConfiguredFeature<?, ?> MICHAELJACKSON_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONAR_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONGOLIA_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONGRESS_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONNET_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONOPOLY_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONORAVIRUS_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONSET_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONSONSONSAHUR_ORE_GEN;
    public static ConfiguredFeature<?, ?> SONY_ORE_GEN;
    public static ConfiguredFeature<?, ?> WOODROWWILSON_ORE_GEN;

    public static void init() {
        RUBY_ORE_GEN = createOre(RegistryHandler.RUBY_BLOCK, 8, 15, 10, 100);
        SONGEBOB_ORE_GEN = createOre(RegistryHandler.SONGEBOB, 8, 15, 10, 100);
        SONG_ORE_GEN = createOre(RegistryHandler.SONG, 8, 15, 10, 100);
        HANDSONITIZER_ORE_GEN = createOre(RegistryHandler.HANDSONITIZER, 8, 15, 10, 100);
        HERECOMESTHESON_ORE_GEN = createOre(RegistryHandler.HERECOMESTHESON, 8, 15, 10, 100);
        JIMMYDONALDSON_ORE_GEN = createOre(RegistryHandler.JIMMYDONALDSON, 8, 15, 10, 100);
        MATHEQUASON_ORE_GEN = createOre(RegistryHandler.MATHEQUASON, 8, 15, 10, 100);
        MICHAELJACKSON_ORE_GEN = createOre(RegistryHandler.MICHAELJACKSON, 8, 15, 10, 100);
        SONAR_ORE_GEN = createOre(RegistryHandler.SONAR, 8, 15, 10, 100);
        SONGOLIA_ORE_GEN = createOre(RegistryHandler.SONGOLIA, 8, 15, 10, 100);
        SONGRESS_ORE_GEN = createOre(RegistryHandler.SONGRESS, 8, 15, 10, 100);
        SONNET_ORE_GEN = createOre(RegistryHandler.SONNET, 8, 15, 10, 100);
        SONOPOLY_ORE_GEN = createOre(RegistryHandler.SONOPOLY, 8, 15, 10, 100);
        SONORAVIRUS_ORE_GEN = createOre(RegistryHandler.SONORAVIRUS, 8, 15, 10, 100);
        SONSET_ORE_GEN = createOre(RegistryHandler.SONSET, 8, 15, 10, 100);
        SONSONSONSAHUR_ORE_GEN = createOre(RegistryHandler.SONSONSONSAHUR, 8, 15, 10, 100);
        SONY_ORE_GEN = createOre(RegistryHandler.SONY, 8, 15, 10, 100);
        WOODROWWILSON_ORE_GEN = createOre(RegistryHandler.WOODROWWILSON, 8, 15, 10, 100);
    }

    private static ConfiguredFeature<?, ?> createOre(RegistryObject<Block> block, int size, int count, int minHeight, int maxHeight) {
        return Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                block.get().getDefaultState(),
                size
        )).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(
                count, minHeight, 0, maxHeight
        )));
    }
}