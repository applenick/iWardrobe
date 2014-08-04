package com.applenick.iWardrobe.inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.*;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;


@MenuInventory(
		slots = 9,
		name = "§bWardrobe")
@NestedMenu(
	    {
	        HatMenu.class,
	    }
)
public class WardrobeMenu extends Menu {

	public WardrobeMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}
	
	
	@MenuItem(
			slot = 0,
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_HELMET,
					name = "§aHats"
					)
			)
	public void openHatMenu(WardrobePlayer player){
		player.setActiveMenu(new HatMenu(manager , null));
	}

	
	

}
