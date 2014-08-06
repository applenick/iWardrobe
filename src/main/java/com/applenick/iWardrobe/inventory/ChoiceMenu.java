package com.applenick.iWardrobe.inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.WardrobePlayer;


@MenuInventory(
		slots = 9,
		name = "§4 Are You Sure?",
		onClose = WardrobeMenu.class
		)
public class ChoiceMenu extends Menu {
	
	public ChoiceMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}


	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_BLOCK ,
					name = "§bAccept")
			)
	public void deleteWardrobe(WardrobePlayer player){
		deleteInventory(player);
	}
	
	@MenuItem(slot = 5 , 
			item = @ItemStackAnnotation(
					material = Material.REDSTONE_BLOCK ,
					name = "§4Deny")
			)
	public void denyDelete(WardrobePlayer player){
		player.getBukkit().closeInventory();
	}

	
	private void deleteInventory(WardrobePlayer player){
		Player p = player.getBukkit();
		
		
		for(ItemStack i :p.getInventory().getArmorContents()){
			if(i.getItemMeta().getLore().isEmpty()){
				return;
			} else {
				p.getInventory().remove(i);
			}
		}
	}
	
	

}
