package com.glowing.harvestblock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CruxBlock extends Block {
	
	public CruxBlock() {
		super(Block.Properties.of(Material.STONE)
				.strength(5F,10F)
				.harvestLevel(0)
				.harvestTool(ToolType.PICKAXE)
				.sound(SoundType.STONE));
	}
	
}