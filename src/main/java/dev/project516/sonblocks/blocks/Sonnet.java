package dev.project516.sonblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Sonnet extends Block {
    public Sonnet() {
        super(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE));
    }
}
