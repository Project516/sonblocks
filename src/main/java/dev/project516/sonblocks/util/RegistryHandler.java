package dev.project516.sonblocks.util;

import dev.project516.sonblocks.SonBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegistryHandler {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SonBlocks.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SonBlocks.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SonBlocks.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.registerItem("ruby",
            Item::new, () -> new Item.Properties());

    private static final String[] ORE_NAMES = {
        "ruby_block", "handsonitizer", "herecomestheson", "jimmydonaldson",
        "mathequason", "michaeljackson", "sonar", "song", "songebob",
        "songolia", "songress", "sonnet", "sonopoly", "sonoravirus",
        "sonset", "sonsonsonsahur", "sony", "woodrowwilson"
    };

    public static final Map<String, DeferredBlock<Block>> ORES = new LinkedHashMap<>();

    static {
        for (String name : ORE_NAMES) {
            ORES.put(name, registerBlock(name));
        }
    }

    private static DeferredBlock<Block> registerBlock(String name) {
        var block = BLOCKS.registerBlock(name, Block::new,
                () -> BlockBehaviour.Properties.of()
                        .mapColor(MapColor.METAL)
                        .strength(5.0f, 6.0f)
                        .sound(SoundType.METAL)
                        .requiresCorrectToolForDrops());
        ITEMS.registerSimpleBlockItem(name, block, () -> new Item.Properties());
        return block;
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SONBLOCKS_TAB = TABS.register("sonblocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.sonblocks"))
                    .icon(() -> new ItemStack(RUBY.get()))
                    .displayItems((params, output) -> {
                        output.accept(RUBY.get());
                        ORES.values().forEach(block -> output.accept(block.get()));
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        TABS.register(modEventBus);
    }
}
