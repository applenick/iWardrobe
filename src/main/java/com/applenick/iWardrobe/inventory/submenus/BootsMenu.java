package com.applenick.iWardrobe.inventory.submenus;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;


@MenuInventory(slots = 9 ,
				name = "§b§nBoots",
				filler = @ItemStackAnnotation(name = "", material = Material.STAINED_GLASS_PANE),
				onClose = WardrobeMenu.class
			  )
public class BootsMenu extends Menu {

	public BootsMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}

	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_BOOTS ,
					name = "§bDiamond §aBoots" ,
					lore = "§6Top of the line")
			)
	public void diamondBoots(WardrobePlayer player){
		player.getBukkit().getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
		player.getBukkit().closeInventory();
	}

	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GOLD_BOOTS ,
					name = "§eGolden §aBoots" ,
					lore = "§6For the stylish one")
			)
	public void goldenBoots(WardrobePlayer player){
		player.getBukkit().getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));
		player.getBukkit().closeInventory();
	}

	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.IRON_BOOTS ,
					name = "§7Iron §aBoots" ,
					lore = "§6Strong yet simple")
			)
	public void ironBoots(WardrobePlayer player){
		player.getBukkit().getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
		player.getBukkit().closeInventory();
	}

	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_BOOTS ,
					name = "§cChainmail §aBoots" ,
					lore = "§6Hidden beauty")
			)
	public void chainmailBoots(WardrobePlayer player){
		player.getBukkit().getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getBukkit().closeInventory();
	}

	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.LEATHER_BOOTS ,
					name = "§dLeather §aBoots" ,
					lore = "§6For the average ones")
			)
	public void leatherBoots(WardrobePlayer player){
		player.getBukkit().getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
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
