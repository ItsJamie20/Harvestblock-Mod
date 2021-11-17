package com.glowing.harvestblock;

import com.glowing.harvestblock.init.ForgeEventHandlers;
import com.glowing.harvestblock.init.HBBlocks;
import com.glowing.harvestblock.utils.RegistryHandler;
import com.glowing.harvestblock.utils.SetupClient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.minecraftforge.fml.common.Mod("harvestblock")
public class Main
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID="harvestblock";

    public Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);

        DistExecutor.runWhenOn(Dist.CLIENT, () -> Main::registerClientOnlyEvents);
    }

    public static void registerClientOnlyEvents() {
        FMLJavaModLoadingContext.get().getModEventBus().register(SetupClient.class);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandlers());
    }

    private void doClientStuff(final FMLCommonSetupEvent event)
    {

    }

    public static final ItemGroup TAB = new ItemGroup("harvestblock") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HBBlocks.TIER_6_SOIL.get());
        }
    };

}
