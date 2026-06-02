package dev.project516.sonblocks.util;

import dev.project516.sonblocks.SonBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ModWorldGen {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registries.CONFIGURED_FEATURE, SonBlocks.MOD_ID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registries.PLACED_FEATURE, SonBlocks.MOD_ID);

    public static final Map<String, Holder<ConfiguredFeature<?, ?>>> CONFIGURED_ORES = new LinkedHashMap<>();
    public static final Map<String, DeferredHolder<PlacedFeature, PlacedFeature>> PLACED_ORES = new LinkedHashMap<>();

    static {
        RegistryHandler.ORES.forEach((name, block) -> {
            var configured = CONFIGURED_FEATURES.register(name + "_ore",
                    () -> new ConfiguredFeature<>(Feature.ORE,
                            new OreConfiguration(
                                    new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                                    block.get().defaultBlockState(),
                                    8)));
            CONFIGURED_ORES.put(name, configured);

            List<PlacementModifier> modifiers = List.of(
                    CountPlacement.of(15),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100)),
                    BiomeFilter.biome());

            var placed = PLACED_FEATURES.register(name + "_placed",
                    () -> new PlacedFeature(configured, modifiers));
            PLACED_ORES.put(name, placed);
        });
    }

    public static void register(IEventBus modEventBus) {
        CONFIGURED_FEATURES.register(modEventBus);
        PLACED_FEATURES.register(modEventBus);
    }
}
