package com.applenick.iWardrobe.inventory.submenus;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.*;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;


@MenuInventory(slots = 9 , name = "§aHats" , onClose = WardrobeMenu.class)
public class HatMenu extends Menu {

	public HatMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}


	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_HELMET ,
					name = "§bDiamond Helmet" ,
					lore = "§aLook your best!")
			)
	public void diamondHelmet(WardrobePlayer player){
		player.getBukkit().closeInventory();
		player.getBukkit().sendMessage(ChatColor.RED + "Wardrobe Is Working");
	}

}
