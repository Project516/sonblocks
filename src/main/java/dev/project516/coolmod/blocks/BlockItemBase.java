package dev.project516.coolmod.blocks;

import dev.project516.coolmod.CoolMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(CoolMod.TAB));
    }
}
