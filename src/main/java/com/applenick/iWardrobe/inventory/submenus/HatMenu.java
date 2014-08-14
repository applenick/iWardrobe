package com.applenick.iWardrobe.inventory.submenus;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;
import net.njay.annotation.NestedMenu;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.inventory.submenus.hats.ArmorHelmets;
import com.applenick.iWardrobe.inventory.submenus.hats.FunHelmets;
import com.applenick.iWardrobe.sounds.SoundUtil;


@MenuInventory(slots = 9 ,
	name = "§bHats" ,
	onClose = WardrobeMenu.class)
@NestedMenu(
		{
			ArmorHelmets.class,
			FunHelmets.class
		}
		
			)
public class HatMenu extends Menu {

	public HatMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}


	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_HELMET ,
					name = "§3Normal Hats" ,
					lore = "§6Like the good old days")
			)
	public void openNormalHats(WardrobePlayer player){
		player.setActiveMenu(new ArmorHelmets(manager, null));
		SoundUtil.click(player.getBukkit());
	}
	
	@MenuItem(slot = 6 , 
			item = @ItemStackAnnotation(
					material = Material.TNT ,
					name = "§aFun Hats" ,
					lore = "§6Blocks N Stuff")
			)
	public void openBlockHats(WardrobePlayer player){
		player.setActiveMenu(new FunHelmets(manager, null));
		SoundUtil.click(player.getBukkit());
	}
	
	
	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.WOOL ,
					name = "§aC§bo§cl§do§er§9f§5u§fl §6Hats" ,
					lore = "§dWorld §bOf §4Color")
	
			)
	public void openColorfulHats(WardrobePlayer player){
		player.setActiveMenu(new FunHelmets(manager, null));
		SoundUtil.click(player.getBukkit());
	}


	@MenuItem(slot = 8 , 
			item = @ItemStackAnnotation(
					material = Material.TRAP_DOOR ,
					name = "§4Return" ,
					lore = "§cReturn to wardrobe menu")
			)
	public void closeInv(WardrobePlayer player){
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}
}
