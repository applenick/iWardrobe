package com.applenick.iWardrobe.inventory.submenus.hats;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;
import net.njay.annotation.PreProcessor;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.iWardrobe;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.utils.ItemUtils;

@MenuInventory(slots = 36 ,
name = "§5Colorful Helmets" ,
onClose = WardrobeMenu.class)
public class ColorfulHelmets extends Menu {

	public ColorfulHelmets(MenuManager manager, Inventory inv) {
		super(manager, inv);
		preHelmet(inv);
	}
	
	@PreProcessor
	public void preHelmet(Inventory inv){
	  ItemStack redWool = ItemUtils.createWoolItem(Material.WOOL, ChatColor.RED + "Red Wool", "", DyeColor.RED.getData());
	  inv.setItem(2, redWool);
	}
	
	
	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.WOOL ,
					name = "§cColor Wool Test"
					)
			 )
	public void diamondHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.TNT, ChatColor.RED + "TNT Hat", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
	}
	

	
	
}

