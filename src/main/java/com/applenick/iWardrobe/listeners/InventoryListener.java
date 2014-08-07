package com.applenick.iWardrobe.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;

import com.applenick.iWardrobe.iWardrobe;

public class InventoryListener implements Listener {
	
	@EventHandler
	public void onArmorClick(InventoryClickEvent event){
		if(event.getSlotType().equals(SlotType.ARMOR) && event.getCurrentItem().getItemMeta().getLore().toString().equalsIgnoreCase(iWardrobe.wardrobe_lore)){
			Player p = (Player) event.getWhoClicked();
			p.closeInventory();
			p.sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to interact with Wardrobe Items");
			p.playSound(p.getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
			event.setCancelled(true);
		}
		
		
	}

}
