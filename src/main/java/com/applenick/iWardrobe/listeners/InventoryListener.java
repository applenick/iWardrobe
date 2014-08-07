package com.applenick.iWardrobe.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.applenick.iWardrobe.iWardrobe;

public class InventoryListener implements Listener {
	
	@EventHandler
	public void onArmorClick(InventoryClickEvent event){
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);
				
		if(event.getCurrentItem().getItemMeta().getLore().equals(lore)){
			Player p = (Player) event.getWhoClicked();
			p.closeInventory();
			p.sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to interact with Wardrobe Items");
			p.playSound(p.getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
			event.setCancelled(true);
		}
		
		
	}

}
