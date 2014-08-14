package com.applenick.iWardrobe.inventory.submenus.hats;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.iWardrobe;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.utils.ItemUtils;

@MenuInventory(slots = 36 ,
name = "§dFun Helmets" ,
onClose = WardrobeMenu.class)
public class FunHelmets extends Menu {

	public FunHelmets(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}



	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.TNT ,
					name = "§cTNT" ,
					lore = "§6Tons Of Boom Boom Fun")
			 )
	public void diamondHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.TNT, ChatColor.RED + "TNT Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GLASS ,
					name = "§cSpace Man Helmet" ,
					lore = "§6Super Fun")
			 )
	public void glassHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.GLASS, ChatColor.GRAY + "Space Man Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.CAKE ,
					name = "§dBirthday Cake Hat" ,
					lore = "§6Super Fun")
			 )
	public void cakeHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.CAKE, ChatColor.LIGHT_PURPLE + "Birthday Cake Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.BOOKSHELF ,
					name = "§6Book Worm" ,
					lore = "§6Super Fun")
			 )
	public void bookHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.BOOKSHELF, ChatColor.AQUA +"Book Worm Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.COMMAND ,
					name = "§fConsole" ,
					lore = "§6Super Fun")
			 )
	public void consoleHat(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.COMMAND, ChatColor.RED + "Console Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	@MenuItem(slot = 5 , 
			item = @ItemStackAnnotation(
					material = Material.JUKEBOX ,
					name = "§6DJ Helmet" ,
					lore = "§6Super Fun")
			 )
	public void djHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.JUKEBOX, ChatColor.GOLD + "DJ Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 6 , 
			item = @ItemStackAnnotation(
					material = Material.REDSTONE_BLOCK ,
					name = "§cRedstone Hat" ,
					lore = "§6Super Fun")
			 )
	public void redstoneHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.REDSTONE_BLOCK, ChatColor.RED + "Redstone Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 7 , 
			item = @ItemStackAnnotation(
					material = Material.LEAVES ,
					name = "§2Leafy Hat" ,
					lore = "§6Super Fun")
			 )
	public void leafHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.LEAVES, ChatColor.DARK_GREEN + "Leafy Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 8 , 
			item = @ItemStackAnnotation(
					material = Material.WORKBENCH ,
					name = "§eCrafty Hat" ,
					lore = "§6Super Fun")
			 )
	public void craftHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.WORKBENCH, ChatColor.YELLOW + "Crafty Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 9 , 
			item = @ItemStackAnnotation(
					material = Material.FURNACE ,
					name = "§3Furnace Hat" ,
					lore = "§6Super Fun")
			 )
	public void furnHat(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.FURNACE, ChatColor.RED + "Furnace Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 10 , 
			item = @ItemStackAnnotation(
					material = Material.CHEST ,
					name = "§9Chest Hat" ,
					lore = "§6Super Fun")
			 )
	public void chestHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.CHEST, ChatColor.GOLD + "Chest Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 11 , 
			item = @ItemStackAnnotation(
					material = Material.PISTON_BASE ,
					name = "§8Piston Hat" ,
					lore = "§6Super Fun")
			 )
	public void pistonHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.PISTON_BASE, ChatColor.DARK_GRAY + "Piston Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 12 , 
			item = @ItemStackAnnotation(
					material = Material.PISTON_STICKY_BASE ,
					name = "§aSticky Piston Hat" ,
					lore = "§6Super Fun")
			 )
	public void stickyPistonHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.PISTON_STICKY_BASE, ChatColor.GREEN + "Sticky Piston Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 13 , 
			item = @ItemStackAnnotation(
					material = Material.REDSTONE_LAMP_ON ,
					name = "§aRedstone Lamp Hat" ,
					lore = "§6Super Fun")
			 )
	public void redstoneLamp(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.REDSTONE_LAMP_ON, ChatColor.DARK_RED + "Redstone Lamp Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}






}