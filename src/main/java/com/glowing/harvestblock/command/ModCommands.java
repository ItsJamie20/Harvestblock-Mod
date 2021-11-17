package com.glowing.harvestblock.command;

import com.glowing.harvestblock.Main;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class ModCommands {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        LiteralCommandNode<CommandSource> cmdVT = dispatcher.register(
          Commands.literal(Main.MOD_ID)
                  .then(TraderCoreCommand.register(dispatcher))
        );

        dispatcher.register(Commands.literal("vt").redirect(cmdVT));
    }
}
