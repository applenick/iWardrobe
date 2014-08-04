package com.applenick.iWardrobe.commands;

import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;

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



	}
}
