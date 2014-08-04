package com.applenick.iWardrobe.commands;

import net.njay.MenuFramework;

import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.utils.CommandUtil;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandPermissions;

public class WardrobeCommands {


	@Command(
			aliases = { "wardrobe", "wd" },
			desc = "Opens your Wardrobe"
			)
	@CommandPermissions("wardrobe.use")
	public static void punish(final CommandContext args, final CommandSender sender) throws CommandException {
		WardrobePlayer player = ((WardrobePlayer) MenuFramework.getPlayerManager().getPlayer(CommandUtil.isPlayer(sender)));
		player.setActiveMenu(new WardrobeMenu(player.getMenuManager() , null));
	}
}
