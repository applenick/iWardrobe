package com.applenick.iWardrobe.inventory.submenus;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;

@MenuInventory(slots = 9 ,
			   name = "§b§nChestplate" ,
			   onClose = WardrobeMenu.class
			   )
public class ChestPlateMenu extends Menu {

	public ChestPlateMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}
	
	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_CHESTPLATE ,
					name = "§bDiamond §aChestplate" ,
					lore = "§6Top of the Line")
			)
	public void diamondChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GOLD_CHESTPLATE ,
					name = "§eDiamond §aChestplate" ,
					lore = "§6Top of the Line")
			)
	public void goldenChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.IRON_CHESTPLATE ,
					name = "§7Iron §aChestplate" ,
					lore = "§6Top of the Line")
			)
	public void ironChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_CHESTPLATE ,
					name = "§cChainmail §aChestplate" ,
					lore = "§6Top of the Line")
			)
	public void chainmailChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		player.getBukkit().closeInventory();
	}
	
	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.LEATHER_CHESTPLATE ,
					name = "§dLeather §aChestplate" ,
					lore = "§6Top of the Line")
			)
	public void leatherChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
		player.getBukkit().closeInventory();
	}
	
	
	@MenuItem(slot = 8 , 
			item = @ItemStackAnnotation(
					material = Material.TRAP_DOOR ,
					name = "§4Return" ,
					lore = "§cReturn to wardrobe menu")
			)
	public void closeInv(WardrobePlayer player){
		player.getBukkit().closeInventory();
	}

}
