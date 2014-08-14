package com.applenick.iWardrobe.commands;

import net.njay.MenuFramework;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.ChoiceMenu;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.inventory.submenus.BootsMenu;
import com.applenick.iWardrobe.inventory.submenus.ChestPlateMenu;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;
import com.applenick.iWardrobe.inventory.submenus.PantsMenu;
import com.applenick.iWardrobe.utils.CommandUtil;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;

public class WardrobeCommands {


	@Command(
			aliases = { "wardrobe", "wd" },
			desc = "Opens your Wardrobe",
			usage = "<hats | chestplate | leggings | boots| reset>",
			min = 0,
			max = 1
			)
	public static void punish(final CommandContext args, final CommandSender sender) throws CommandException {
		if(!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "Only players may use this command!");
			return;
		}
		
		WardrobePlayer player = ((WardrobePlayer) MenuFramework.getPlayerManager().getPlayer(CommandUtil.isPlayer(sender)));

		
		if(args.argsLength() == 1){
			if(args.getString(0).equalsIgnoreCase("hats")){
				player.setActiveMenu(new HatMenu(player.getMenuManager() , null));
			}
			
			if(args.getString(0).equalsIgnoreCase("chestplate")){
				player.setActiveMenu(new ChestPlateMenu(player.getMenuManager() , null));
			}
			
			if(args.getString(0).equalsIgnoreCase("leggings")){
				player.setActiveMenu(new PantsMenu(player.getMenuManager() , null));
				
			}
			
			if(args.getString(0).equalsIgnoreCase("boots")){
				player.setActiveMenu(new BootsMenu(player.getMenuManager() , null));
				
			}
			
			if(args.getString(0).equalsIgnoreCase("reset")){
				player.setActiveMenu(new ChoiceMenu(player.getMenuManager() , null));
			}
		}
		else {
			player.setActiveMenu(new WardrobeMenu(player.getMenuManager() , null));
		}
		
	}
}
