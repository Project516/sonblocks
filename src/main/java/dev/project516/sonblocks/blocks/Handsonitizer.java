package dev.project516.sonblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Handsonitizer extends Block {
    public Handsonitizer() {
        super(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE)
        );
    }

}
