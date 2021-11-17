package com.glowing.harvestblock.init;

import com.glowing.harvestblock.Main;
import com.glowing.harvestblock.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HBItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> DIRT_STICK = ITEMS.register("dirt_stick", ItemBase::new);
    public static final RegistryObject<Item> HBC = ITEMS.register("hbc", ItemBase::new);
    public static final RegistryObject<Item> FERTILISER = ITEMS.register("fertiliser", ItemBase::new);
}
