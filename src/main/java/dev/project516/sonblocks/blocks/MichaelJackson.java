package dev.project516.sonblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MichaelJackson extends Block {
    public MichaelJackson() {
        super(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE));
    }
}
