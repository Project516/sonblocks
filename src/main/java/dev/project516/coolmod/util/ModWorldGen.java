package dev.project516.coolmod.util;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class ModWorldGen {

    // A reference to hold your configured block spawning rules
    public static ConfiguredFeature<?, ?> RUBY_ORE_GEN;

    public static void init() {
        RUBY_ORE_GEN = Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.NATURAL_STONE, // Spawns inside regular stone
                RegistryHandler.RUBY_BLOCK.get().getDefaultState(), // Fetches your custom ruby block
                8 // Max number of blocks in a single vein cluster
        )).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(
                15, // Number of vein generation attempts per chunk
                10, // Minimum height (Y-level)
                0,  // Bottom offset
                50  // Maximum height (Y-level)
        )));
    }
}