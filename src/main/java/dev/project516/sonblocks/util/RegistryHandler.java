package dev.project516.sonblocks.util;

import dev.project516.sonblocks.SonBlocks;
import dev.project516.sonblocks.blocks.*;
import dev.project516.sonblocks.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SonBlocks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SonBlocks.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Block> HANDSONITIZER = BLOCKS.register("handsonitizer", Handsonitizer::new);
    public static final RegistryObject<Item> HANDSONITIZER_ITEM = ITEMS.register("handsonitizer", () -> new BlockItemBase(HANDSONITIZER.get()));
    public static final RegistryObject<Block> HERECOMESTHESON = BLOCKS.register("herecomestheson", HereComesTheSon::new);
    public static final RegistryObject<Item> HERECOMESTHESON_ITEM = ITEMS.register("herecomestheson", () -> new BlockItemBase(HERECOMESTHESON.get()));
    public static final RegistryObject<Block> JIMMYDONALDSON = BLOCKS.register("jimmydonaldson", JimmyDonaldson::new);
    public static final RegistryObject<Item> JIMMYDONALDSON_ITEM = ITEMS.register("jimmydonaldson", () -> new BlockItemBase(JIMMYDONALDSON.get()));
    public static final RegistryObject<Block> MATHEQUASON = BLOCKS.register("mathequason", MathEquason::new);
    public static final RegistryObject<Item> MATHEQUASON_ITEM = ITEMS.register("mathequason", () -> new BlockItemBase(MATHEQUASON.get()));
    public static final RegistryObject<Block> MICHAELJACKSON = BLOCKS.register("michaeljackson", MichaelJackson::new);
    public static final RegistryObject<Item> MICHAELJACKSON_ITEM = ITEMS.register("michaeljackson", () -> new BlockItemBase(MICHAELJACKSON.get()));
    public static final RegistryObject<Block> SONAR = BLOCKS.register("sonar", Sonar::new);
    public static final RegistryObject<Item> SONAR_ITEM = ITEMS.register("sonar", () -> new BlockItemBase(SONAR.get()));
    
    public static final RegistryObject<Block> SONGEBOB = BLOCKS.register("songebob", Songebob::new);
    public static final RegistryObject<Item> SONGEBOB_ITEM = ITEMS.register("songebob", () -> new BlockItemBase(SONGEBOB.get()));
    public static final RegistryObject<Block> SONG = BLOCKS.register("song", Song::new);
    public static final RegistryObject<Item> SONG_ITEM = ITEMS.register("song", () -> new BlockItemBase(SONG.get()));
    public static final RegistryObject<Block> SONGOLIA = BLOCKS.register("songolia", Songolia::new);
    public static final RegistryObject<Item> SONGOLIA_ITEM = ITEMS.register("songolia", () -> new BlockItemBase(SONGOLIA.get()));
    public static final RegistryObject<Block> SONGRESS = BLOCKS.register("songress", Songress::new);
    public static final RegistryObject<Item> SONGRESS_ITEM = ITEMS.register("songress", () -> new BlockItemBase(SONGRESS.get()));
    public static final RegistryObject<Block> SONNET = BLOCKS.register("sonnet", Sonnet::new);
    public static final RegistryObject<Item> SONNET_ITEM = ITEMS.register("sonnet", () -> new BlockItemBase(SONNET.get()));
    public static final RegistryObject<Block> SONOPOLY = BLOCKS.register("sonopoly", Sonopoly::new);
    public static final RegistryObject<Item> SONOPOLY_ITEM = ITEMS.register("sonopoly", () -> new BlockItemBase(SONOPOLY.get()));
    public static final RegistryObject<Block> SONORAVIRUS = BLOCKS.register("sonoravirus", Sonoravirus::new);
    public static final RegistryObject<Item> SONORAVIRUS_ITEM = ITEMS.register("sonoravirus", () -> new BlockItemBase(SONORAVIRUS.get()));
    public static final RegistryObject<Block> SONSET = BLOCKS.register("sonset", Sonset::new);
    public static final RegistryObject<Item> SONSET_ITEM = ITEMS.register("sonset", () -> new BlockItemBase(SONSET.get()));
    public static final RegistryObject<Block> SONSONSONSAHUR = BLOCKS.register("sonsonsonsahur", SonSonSonSahur::new);
    public static final RegistryObject<Item> SONSONSONSAHUR_ITEM = ITEMS.register("sonsonsonsahur", () -> new BlockItemBase(SONSONSONSAHUR.get()));
    public static final RegistryObject<Block> SONY = BLOCKS.register("sony", Sony::new);
    public static final RegistryObject<Item> SONY_ITEM = ITEMS.register("sony", () -> new BlockItemBase(SONY.get()));
    public static final RegistryObject<Block> WOODROWWILSON = BLOCKS.register("woodrowwilson", WoodrowWilson::new);
    public static final RegistryObject<Item> WOODROWWILSON_ITEM = ITEMS.register("woodrowwilson", () -> new BlockItemBase(WOODROWWILSON.get()));







}
