package com.applenick.iWardrobe.utils;

import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandUtil {
	
    public static Player isPlayer(CommandSender sender) throws CommandException {
        if (!(sender instanceof Player)) throw new CommandException("Only players may use this command!");
        return (Player) sender;
    }

}
