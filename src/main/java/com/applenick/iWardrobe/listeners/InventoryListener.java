package com.applenick.iWardrobe.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.iWardrobe;

public class InventoryListener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
	public void onArmorClick(InventoryClickEvent event){
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);
		
		
		if (event.getHotbarButton() != -1){
			ItemStack item = event.getWhoClicked().getInventory().getItem(event.getHotbarButton());
			
			if(item.getItemMeta().getLore().equals(lore)){
				Player p = (Player) event.getWhoClicked();
				p.closeInventory();
				p.sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to interact with Wardrobe Items");
				p.playSound(p.getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
				event.setCancelled(true);
			}	
		} else
		
		
		if(event.getCurrentItem().getItemMeta().getLore().equals(lore)){
						
			Player p = (Player) event.getWhoClicked();
			p.closeInventory();
			p.sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to interact with Wardrobe Items");
			p.playSound(p.getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
			event.setCancelled(true);
		}	
	}
	
	
	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
	public void onDrop(PlayerDropItemEvent event){
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);

		if(event.getItemDrop().getItemStack().getItemMeta().getLore().equals(lore)){
			event.setCancelled(true);
			event.getPlayer().closeInventory();
			event.getPlayer().sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to interact with Wardrobe Items");
			event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
		}
	}
	


}
