package com.applenick.iWardrobe.inventory;

import java.util.ArrayList;
import java.util.List;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.iWardrobe;


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
		
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);
		
		if(p.getInventory().getHelmet().getItemMeta().getLore() == lore){
			p.getInventory().getHelmet().setAmount(0);
		}
		
		if(p.getInventory().getChestplate().getItemMeta().getLore() == lore){
			p.getInventory().getChestplate().setAmount(0);
		}
		
		if(p.getInventory().getLeggings().getItemMeta().getLore() == lore){
			p.getInventory().getLeggings().setAmount(0);
		}
		
		if(p.getInventory().getBoots().getItemMeta().getLore() == lore){
			p.getInventory().getBoots().setAmount(0);
		}
		
		p.closeInventory();
				
	}
	
	

}
