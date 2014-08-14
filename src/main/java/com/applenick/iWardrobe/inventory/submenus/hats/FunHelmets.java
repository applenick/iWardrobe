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
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.CAKE_BLOCK, ChatColor.LIGHT_PURPLE + "Birthday Cake", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.BOOKSHELF ,
					name = "§6Book Worm" ,
					lore = "§6Super Fun")
			 )
	public void bookHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.BOOKSHELF, ChatColor.AQUA +"Book Worm", iWardrobe.wardrobe_lore));
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
					name = "§cDJ Helmet" ,
					lore = "§6Super Fun")
			 )
	public void djHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.JUKEBOX, ChatColor.GOLD + "DJ Helmet", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}




}