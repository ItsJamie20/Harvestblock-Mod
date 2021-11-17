package com.glowing.harvestblock.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;

public class TraderCoreCommand implements Command<CommandSource> {

    private static final TraderCoreCommand CMD = new TraderCoreCommand();

   public static ArgumentBuilder<CommandSource, ?> register(CommandDispatcher<CommandSource> dispatcher){
       return Commands.literal("trader_core")
               .then(Commands.argument("actor", StringArgumentType.string())
               .requires(source -> source.hasPermission(0))
               .executes(CMD));
   }

    @Override
    public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {
        String actor = StringArgumentType.getString(context, "actor");
        ServerPlayerEntity player = context.getSource().getPlayerOrException();
        player.drop(new ItemStack(Items.GOLDEN_APPLE),false,false).setPickUpDelay(0);
        context.getSource().sendSuccess(new StringTextComponent(actor),false);
        /*ServerPlayerEntity player = context.getSource().getPlayerOrException();
        PlayerVaultStats stats = PlayerVaultStatsData.get(player.getServer()).getVaultStats(player);
        ItemStack core = ItemTraderCore.generate(actor, stats.getVaultLevel());
        player.inventory.add(core);*/
        return 0;
    }
}
