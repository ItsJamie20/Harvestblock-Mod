package com.glowing.harvestblock.blocks;

import com.glowing.harvestblock.Main;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(Main.TAB));
    }
}
