package com.glowing.harvestblock.utils;

import com.glowing.harvestblock.init.HBBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class SetupClient {

    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event){
        RenderTypeLookup.setRenderLayer(HBBlocks.TIER_1_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.TIER_2_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.TIER_3_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.TIER_4_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.TIER_5_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.TIER_6_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BASIC_TIER_1_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BASIC_TIER_2_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BASIC_TIER_3_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BASIC_TIER_4_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BASIC_TIER_5_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BASIC_TIER_6_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BETTER_TIER_1_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BETTER_TIER_2_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BETTER_TIER_3_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BETTER_TIER_4_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BETTER_TIER_5_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.BETTER_TIER_6_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.IMPROVED_TIER_1_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.IMPROVED_TIER_2_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.IMPROVED_TIER_3_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.IMPROVED_TIER_4_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.IMPROVED_TIER_5_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.IMPROVED_TIER_6_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.RICH_TIER_1_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.RICH_TIER_2_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.RICH_TIER_3_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.RICH_TIER_4_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.RICH_TIER_5_SOIL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(HBBlocks.RICH_TIER_6_SOIL.get(), RenderType.cutout());
    }

}
