package com.applenick.iWardrobe.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
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
		if(!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "Only players may use this command!");
			return;
		}
		WardrobePlayer player = (WardrobePlayer) sender;
		player.setActiveMenu(new WardrobeMenu(player.getMenuManager() , null));
	}
}
