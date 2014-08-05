package com.applenick.iWardrobe.inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.*;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.submenus.ChestPlateMenu;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;


@MenuInventory(
		slots = 18,
		name = "§4§l§nWardrobe",
		filler = @ItemStackAnnotation(name = "", material = Material.STAINED_GLASS_PANE))
@NestedMenu(
	    {
	        HatMenu.class,
	        ChestPlateMenu.class
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
	
	
	
	@MenuItem(
			slot = 1,
			item = @ItemStackAnnotation(
					material = Material.IRON_CHESTPLATE,
					name = "§9Chestplates",
					lore = "§6§lSelect your Chestplate"
					)
			)
	public void openChestPlateMenu(WardrobePlayer player){
		player.setActiveMenu(new ChestPlateMenu(manager , null));
	}

	
	

}
