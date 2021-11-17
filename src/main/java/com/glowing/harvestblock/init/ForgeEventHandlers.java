package com.glowing.harvestblock.init;

import com.glowing.harvestblock.command.ModCommands;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeEventHandlers {
    @SubscribeEvent
    public void onCommandRegister(final RegisterCommandsEvent event){
        ModCommands.register(event.getDispatcher());
    }
}
