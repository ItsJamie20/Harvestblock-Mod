package com.glowing.harvestblock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SoilBlock extends Block {

    public SoilBlock() {
        super(Block.Properties.of(Material.DIRT)
                .strength(0.5F,0.5F)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
                .sound(SoundType.GRASS)
        );
    }



}
