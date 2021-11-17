package com.glowing.harvestblock.init;

import com.glowing.harvestblock.Main;
import com.glowing.harvestblock.blocks.BlockItemBase;
import com.glowing.harvestblock.blocks.SoilBlock;
import com.glowing.harvestblock.blocks.CruxBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HBBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> TIER_1_SOIL = BLOCKS.register("tier_1_soil", SoilBlock::new);
    public static final RegistryObject<Block> TIER_2_SOIL = BLOCKS.register("tier_2_soil", SoilBlock::new);
    public static final RegistryObject<Block> TIER_3_SOIL = BLOCKS.register("tier_3_soil", SoilBlock::new);
    public static final RegistryObject<Block> TIER_4_SOIL = BLOCKS.register("tier_4_soil", SoilBlock::new);
    public static final RegistryObject<Block> TIER_5_SOIL = BLOCKS.register("tier_5_soil", SoilBlock::new);
    public static final RegistryObject<Block> TIER_6_SOIL = BLOCKS.register("tier_6_soil", SoilBlock::new);
    public static final RegistryObject<Block> BASIC_TIER_1_SOIL = BLOCKS.register("basic_tier_1_soil", SoilBlock::new);
    public static final RegistryObject<Block> BASIC_TIER_2_SOIL = BLOCKS.register("basic_tier_2_soil", SoilBlock::new);
    public static final RegistryObject<Block> BASIC_TIER_3_SOIL = BLOCKS.register("basic_tier_3_soil", SoilBlock::new);
    public static final RegistryObject<Block> BASIC_TIER_4_SOIL = BLOCKS.register("basic_tier_4_soil", SoilBlock::new);
    public static final RegistryObject<Block> BASIC_TIER_5_SOIL = BLOCKS.register("basic_tier_5_soil", SoilBlock::new);
    public static final RegistryObject<Block> BASIC_TIER_6_SOIL = BLOCKS.register("basic_tier_6_soil", SoilBlock::new);
    public static final RegistryObject<Block> BETTER_TIER_1_SOIL = BLOCKS.register("better_tier_1_soil", SoilBlock::new);
    public static final RegistryObject<Block> BETTER_TIER_2_SOIL = BLOCKS.register("better_tier_2_soil", SoilBlock::new);
    public static final RegistryObject<Block> BETTER_TIER_3_SOIL = BLOCKS.register("better_tier_3_soil", SoilBlock::new);
    public static final RegistryObject<Block> BETTER_TIER_4_SOIL = BLOCKS.register("better_tier_4_soil", SoilBlock::new);
    public static final RegistryObject<Block> BETTER_TIER_5_SOIL = BLOCKS.register("better_tier_5_soil", SoilBlock::new);
    public static final RegistryObject<Block> BETTER_TIER_6_SOIL = BLOCKS.register("better_tier_6_soil", SoilBlock::new);
    public static final RegistryObject<Block> IMPROVED_TIER_1_SOIL = BLOCKS.register("improved_tier_1_soil", SoilBlock::new);
    public static final RegistryObject<Block> IMPROVED_TIER_2_SOIL = BLOCKS.register("improved_tier_2_soil", SoilBlock::new);
    public static final RegistryObject<Block> IMPROVED_TIER_3_SOIL = BLOCKS.register("improved_tier_3_soil", SoilBlock::new);
    public static final RegistryObject<Block> IMPROVED_TIER_4_SOIL = BLOCKS.register("improved_tier_4_soil", SoilBlock::new);
    public static final RegistryObject<Block> IMPROVED_TIER_5_SOIL = BLOCKS.register("improved_tier_5_soil", SoilBlock::new);
    public static final RegistryObject<Block> IMPROVED_TIER_6_SOIL = BLOCKS.register("improved_tier_6_soil", SoilBlock::new);
    public static final RegistryObject<Block> RICH_TIER_1_SOIL = BLOCKS.register("rich_tier_1_soil", SoilBlock::new);
    public static final RegistryObject<Block> RICH_TIER_2_SOIL = BLOCKS.register("rich_tier_2_soil", SoilBlock::new);
    public static final RegistryObject<Block> RICH_TIER_3_SOIL = BLOCKS.register("rich_tier_3_soil", SoilBlock::new);
    public static final RegistryObject<Block> RICH_TIER_4_SOIL = BLOCKS.register("rich_tier_4_soil", SoilBlock::new);
    public static final RegistryObject<Block> RICH_TIER_5_SOIL = BLOCKS.register("rich_tier_5_soil", SoilBlock::new);
    public static final RegistryObject<Block> RICH_TIER_6_SOIL = BLOCKS.register("rich_tier_6_soil", SoilBlock::new);
    public static final RegistryObject<Block> CREATIVE_CRUX = BLOCKS.register("creative_crux", CruxBlock::new);
    public static final RegistryObject<Block> CRYSTALTINE_CRUX = BLOCKS.register("crystaltine_crux", CruxBlock::new);
    public static final RegistryObject<Block> DARK_MATTER_CRUX = BLOCKS.register("dark_matter_crux", CruxBlock::new);
    public static final RegistryObject<Block> RED_MATTER_CRUX = BLOCKS.register("red_matter_crux", CruxBlock::new);
    public static final RegistryObject<Block> GAIA_CRUX = BLOCKS.register("gaia_crux", CruxBlock::new);
    public static final RegistryObject<Block> ULTIMATE_CRUX = BLOCKS.register("ultimate_crux", CruxBlock::new);

    //Block Items
    public static final RegistryObject<Item> TIER_1_SOIL_ITEM = HBItems.ITEMS.register("tier_1_soil", ()-> new BlockItemBase(TIER_1_SOIL.get()));
    public static final RegistryObject<Item> TIER_2_SOIL_ITEM = HBItems.ITEMS.register("tier_2_soil", ()-> new BlockItemBase(TIER_2_SOIL.get()));
    public static final RegistryObject<Item> TIER_3_SOIL_ITEM = HBItems.ITEMS.register("tier_3_soil", ()-> new BlockItemBase(TIER_3_SOIL.get()));
    public static final RegistryObject<Item> TIER_4_SOIL_ITEM = HBItems.ITEMS.register("tier_4_soil", ()-> new BlockItemBase(TIER_4_SOIL.get()));
    public static final RegistryObject<Item> TIER_5_SOIL_ITEM = HBItems.ITEMS.register("tier_5_soil", ()-> new BlockItemBase(TIER_5_SOIL.get()));
    public static final RegistryObject<Item> TIER_6_SOIL_ITEM = HBItems.ITEMS.register("tier_6_soil", ()-> new BlockItemBase(TIER_6_SOIL.get()));
    public static final RegistryObject<Item> BASIC_TIER_1_SOIL_ITEM = HBItems.ITEMS.register("basic_tier_1_soil", ()-> new BlockItemBase(BASIC_TIER_1_SOIL.get()));
    public static final RegistryObject<Item> BASIC_TIER_2_SOIL_ITEM = HBItems.ITEMS.register("basic_tier_2_soil", ()-> new BlockItemBase(BASIC_TIER_2_SOIL.get()));
    public static final RegistryObject<Item> BASIC_TIER_3_SOIL_ITEM = HBItems.ITEMS.register("basic_tier_3_soil", ()-> new BlockItemBase(BASIC_TIER_3_SOIL.get()));
    public static final RegistryObject<Item> BASIC_TIER_4_SOIL_ITEM = HBItems.ITEMS.register("basic_tier_4_soil", ()-> new BlockItemBase(BASIC_TIER_4_SOIL.get()));
    public static final RegistryObject<Item> BASIC_TIER_5_SOIL_ITEM = HBItems.ITEMS.register("basic_tier_5_soil", ()-> new BlockItemBase(BASIC_TIER_5_SOIL.get()));
    public static final RegistryObject<Item> BASIC_TIER_6_SOIL_ITEM = HBItems.ITEMS.register("basic_tier_6_soil", ()-> new BlockItemBase(BASIC_TIER_6_SOIL.get()));
    public static final RegistryObject<Item> BETTER_TIER_1_SOIL_ITEM = HBItems.ITEMS.register("better_tier_1_soil", ()-> new BlockItemBase(BETTER_TIER_1_SOIL.get()));
    public static final RegistryObject<Item> BETTER_TIER_2_SOIL_ITEM = HBItems.ITEMS.register("better_tier_2_soil", ()-> new BlockItemBase(BETTER_TIER_2_SOIL.get()));
    public static final RegistryObject<Item> BETTER_TIER_3_SOIL_ITEM = HBItems.ITEMS.register("better_tier_3_soil", ()-> new BlockItemBase(BETTER_TIER_3_SOIL.get()));
    public static final RegistryObject<Item> BETTER_TIER_4_SOIL_ITEM = HBItems.ITEMS.register("better_tier_4_soil", ()-> new BlockItemBase(BETTER_TIER_4_SOIL.get()));
    public static final RegistryObject<Item> BETTER_TIER_5_SOIL_ITEM = HBItems.ITEMS.register("better_tier_5_soil", ()-> new BlockItemBase(BETTER_TIER_5_SOIL.get()));
    public static final RegistryObject<Item> BETTER_TIER_6_SOIL_ITEM = HBItems.ITEMS.register("better_tier_6_soil", ()-> new BlockItemBase(BETTER_TIER_6_SOIL.get()));
    public static final RegistryObject<Item> IMPROVED_TIER_1_SOIL_ITEM = HBItems.ITEMS.register("improved_tier_1_soil", ()-> new BlockItemBase(IMPROVED_TIER_1_SOIL.get()));
    public static final RegistryObject<Item> IMPROVED_TIER_2_SOIL_ITEM = HBItems.ITEMS.register("improved_tier_2_soil", ()-> new BlockItemBase(IMPROVED_TIER_2_SOIL.get()));
    public static final RegistryObject<Item> IMPROVED_TIER_3_SOIL_ITEM = HBItems.ITEMS.register("improved_tier_3_soil", ()-> new BlockItemBase(IMPROVED_TIER_3_SOIL.get()));
    public static final RegistryObject<Item> IMPROVED_TIER_4_SOIL_ITEM = HBItems.ITEMS.register("improved_tier_4_soil", ()-> new BlockItemBase(IMPROVED_TIER_4_SOIL.get()));
    public static final RegistryObject<Item> IMPROVED_TIER_5_SOIL_ITEM = HBItems.ITEMS.register("improved_tier_5_soil", ()-> new BlockItemBase(IMPROVED_TIER_5_SOIL.get()));
    public static final RegistryObject<Item> IMPROVED_TIER_6_SOIL_ITEM = HBItems.ITEMS.register("improved_tier_6_soil", ()-> new BlockItemBase(IMPROVED_TIER_6_SOIL.get()));
    public static final RegistryObject<Item> RICH_TIER_1_SOIL_ITEM = HBItems.ITEMS.register("rich_tier_1_soil", ()-> new BlockItemBase(RICH_TIER_1_SOIL.get()));
    public static final RegistryObject<Item> RICH_TIER_2_SOIL_ITEM = HBItems.ITEMS.register("rich_tier_2_soil", ()-> new BlockItemBase(RICH_TIER_2_SOIL.get()));
    public static final RegistryObject<Item> RICH_TIER_3_SOIL_ITEM = HBItems.ITEMS.register("rich_tier_3_soil", ()-> new BlockItemBase(RICH_TIER_3_SOIL.get()));
    public static final RegistryObject<Item> RICH_TIER_4_SOIL_ITEM = HBItems.ITEMS.register("rich_tier_4_soil", ()-> new BlockItemBase(RICH_TIER_4_SOIL.get()));
    public static final RegistryObject<Item> RICH_TIER_5_SOIL_ITEM = HBItems.ITEMS.register("rich_tier_5_soil", ()-> new BlockItemBase(RICH_TIER_5_SOIL.get()));
    public static final RegistryObject<Item> RICH_TIER_6_SOIL_ITEM = HBItems.ITEMS.register("rich_tier_6_soil", ()-> new BlockItemBase(RICH_TIER_6_SOIL.get()));
    public static final RegistryObject<Item> CREATIVE_CRUX_ITEM = HBItems.ITEMS.register("creative_crux",()-> new BlockItemBase(CREATIVE_CRUX.get()));
    public static final RegistryObject<Item> CRYSTALTINE_CRUX_ITEM = HBItems.ITEMS.register("crystaltine_crux",()->new BlockItemBase(CRYSTALTINE_CRUX.get()));
    public static final RegistryObject<Item> DARK_MATTER_CRUX_ITEM = HBItems.ITEMS.register("dark_matter_crux",()->new BlockItemBase(DARK_MATTER_CRUX.get()));
    public static final RegistryObject<Item> RED_MATTER_CRUX_ITEM = HBItems.ITEMS.register("red_matter_crux",()->new BlockItemBase(RED_MATTER_CRUX.get()));
    public static final RegistryObject<Item> GAIA_CRUX_ITEM = HBItems.ITEMS.register("gaia_crux",()->new BlockItemBase(GAIA_CRUX.get()));
    public static final RegistryObject<Item> ULTIMATE_CRUX_ITEM = HBItems.ITEMS.register("ultimate_crux",()->new BlockItemBase(ULTIMATE_CRUX.get()));
}
