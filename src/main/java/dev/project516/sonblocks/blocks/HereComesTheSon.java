package dev.project516.sonblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HereComesTheSon extends Block {
    public HereComesTheSon() {
        super(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE));
    }
}
