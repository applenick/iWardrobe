package com.applenick.iWardrobe.inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;
import net.njay.annotation.NestedMenu;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.submenus.BootsMenu;
import com.applenick.iWardrobe.inventory.submenus.ChestPlateMenu;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;
import com.applenick.iWardrobe.inventory.submenus.PantsMenu;
import com.applenick.iWardrobe.inventory.submenus.hats.ArmorHelmets;
import com.applenick.iWardrobe.inventory.submenus.hats.FunHelmets;


@MenuInventory(
		slots = 18,
		name = "§5§lWardrobe",
		filler = @ItemStackAnnotation(name = "", material = Material.STAINED_GLASS_PANE))
@NestedMenu(
	    {
	        HatMenu.class,
	        ChestPlateMenu.class,
	        PantsMenu.class,
	        BootsMenu.class,
	        ArmorHelmets.class,
	        FunHelmets.class
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
					lore = "§6Select your §aHat"
					)
			)
	public void openHatMenu(WardrobePlayer player){
		player.setActiveMenu(new HatMenu(manager , null));
	}
	
	@MenuItem(
			slot = 1,
			item = @ItemStackAnnotation(
					material = Material.IRON_CHESTPLATE,
					name = "§3Chestplates",
					lore = "§6Select your §3Chestplate"
					)
			)
	public void openChestplate(WardrobePlayer player){
		player.setActiveMenu(new ChestPlateMenu(manager , null));
	}
	
	@MenuItem(
			slot = 2,
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_LEGGINGS,
					name = "§cPants",
					lore = "§6Select your §cPants"
					)
			)
	public void openLegs(WardrobePlayer player){
		player.setActiveMenu(new PantsMenu(manager , null));
	}
	
	@MenuItem(
			slot = 3,
			item = @ItemStackAnnotation(
					material = Material.GOLD_BOOTS,
					name = "§eBoots",
					lore = "§6Select your §eBoots"
					)
			)
	public void openBoots(WardrobePlayer player){
		player.setActiveMenu(new BootsMenu(manager , null));
	}

	
	

}
