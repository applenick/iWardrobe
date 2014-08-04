package com.applenick.iWardrobe.inventory.submenus;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.*;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;


@MenuInventory(slots = 9 , name = "§a§nHats" , onClose = WardrobeMenu.class , filler = @ItemStackAnnotation(name = "", material = Material.AIR))
public class HatMenu extends Menu {

	public HatMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}


	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_HELMET ,
					name = "§bDiamond Helmet" ,
					lore = "§6Top of the Line")
			)
	public void diamondHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
		player.getBukkit().closeInventory();
	}

	
	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GOLD_HELMET ,
					name = "§eGolden Helmet" ,
					lore = "")
			)
	public void goldenHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.IRON_HELMET ,
					name = "§7Iron Helmet" ,
					lore = "§aLook your best!")
			)
	public void ironHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
		player.getBukkit().closeInventory();
	}
	
	
	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_HELMET ,
					name = "§8Chainmail Helmet" ,
					lore = "§aLook your best!")
			)
	public void chainHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.LEATHER_HELMET ,
					name = "§6Leather Helmet" ,
					lore = "§aLook your best!")
			)
	public void leatherHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 5 , 
			item = @ItemStackAnnotation(
					material = Material.GLASS ,
					name = "§5Space Travel Helmet" ,
					lore = "§aTime for space fun!")
			)
	public void spaceHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.GLASS));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 6 , 
			item = @ItemStackAnnotation(
					material = Material.TNT ,
					name = "§cKaboom Hat" ,
					lore = "§6Time for TNT fun!")
			)
	public void tntHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.GLASS));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 7 , 
			item = @ItemStackAnnotation(
					material = Material.CAKE_BLOCK ,
					name = "§dCake Hat" ,
					lore = "§5Time for some Yummy fun!")
			)
	public void cakeHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(new ItemStack(Material.CAKE_BLOCK));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 9 , 
			item = @ItemStackAnnotation(
					material = Material.TRAP_DOOR ,
					name = "§4Return" ,
					lore = "§cReturn to wardrobe menu")
			)
	public void closeInv(WardrobePlayer player){
		player.getBukkit().closeInventory();
	}
}
