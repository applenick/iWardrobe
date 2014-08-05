package com.applenick.iWardrobe;

import net.njay.MenuFramework;
import net.njay.MenuRegistry;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.applenick.iWardrobe.commands.WardrobeCommands;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.listeners.PlayerLogins;
import com.sk89q.bukkit.util.CommandsManagerRegistration;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissionsException;
import com.sk89q.minecraft.util.commands.CommandUsageException;
import com.sk89q.minecraft.util.commands.CommandsManager;
import com.sk89q.minecraft.util.commands.MissingNestedCommandException;
import com.sk89q.minecraft.util.commands.WrappedCommandException;
public class iWardrobe extends JavaPlugin {

	private static iWardrobe wardrobe;

	public static iWardrobe get(){
		return wardrobe;
	}

	public void onEnable(){
		wardrobe = this;

		setupMenuGUI();
		setupCommands();
		
		this.registerListener(new PlayerLogins());
	}

	public void onDisable(){

	}
	
	private void registerListener(Listener listener){
		PluginManager PM = this.getServer().getPluginManager();
		PM.registerEvents(listener, this);
	}
	
	private void setupMenuGUI(){
		MenuFramework.enable(new MenuRegistry(wardrobe, WardrobeMenu.class), new WardrobePlayerManager());
	}

	private CommandsManager<CommandSender> commands;

	private void setupCommands() {
		this.commands = new CommandsManager<CommandSender>() {
			@Override public boolean hasPermission(CommandSender sender, String perm) {
				return sender instanceof ConsoleCommandSender || sender.hasPermission(perm);
			}
		};

		CommandsManagerRegistration register = new CommandsManagerRegistration(this, this.commands);
		register.register(WardrobeCommands.class);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		try {
			this.commands.execute(cmd.getName(), args, sender, sender);
		} catch (CommandPermissionsException e) {
			sender.sendMessage(ChatColor.RED + "You don't have permission.");
		} catch (MissingNestedCommandException e) {
			sender.sendMessage(ChatColor.RED + e.getUsage());
		} catch (CommandUsageException e) {
			sender.sendMessage(ChatColor.RED + e.getMessage());
			sender.sendMessage(ChatColor.RED + e.getUsage());
		} catch (WrappedCommandException e) {
			if (e.getCause() instanceof NumberFormatException) {
				sender.sendMessage(ChatColor.RED + "Number expected, string received instead.");
			} else {
				sender.sendMessage(ChatColor.RED + "An error has occurred. See console.");
				e.printStackTrace();
			}
		} catch (CommandException e) {
			sender.sendMessage(ChatColor.RED + e.getMessage());
		}

		return true;
	}



}
