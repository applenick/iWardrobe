package com.applenick.iWardrobe.inventory.submenus.hats;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;

@MenuInventory(slots = 36 ,
name = "§dFun Helmets" ,
filler = @ItemStackAnnotation(name = "", material = Material.STAINED_GLASS_PANE),
onClose = HatMenu.class)
public class FunHelmets extends Menu {

	public FunHelmets(MenuManager manager, Inventory inv) {
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

	
	
	
}