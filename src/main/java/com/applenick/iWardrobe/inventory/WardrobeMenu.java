package com.applenick.iWardrobe.inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.*;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;


@MenuInventory(
		slots = 27,
		name = "§b§nWardrobe",
		filler = @ItemStackAnnotation(name = "", material = Material.WOOD))
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
					name = "§aHats",
					lore = "§6§lSelect your Hat"
					)
			)
	public void openHatMenu(WardrobePlayer player){
		player.setActiveMenu(new HatMenu(manager , null));
	}

	
	

}
