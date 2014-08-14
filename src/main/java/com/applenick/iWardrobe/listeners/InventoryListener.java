package com.applenick.iWardrobe.listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.iWardrobe;

public class InventoryListener implements Listener {
	
	private HashMap<String, ItemStack[]> death_invs = new HashMap<String, ItemStack[]>();

	
	@EventHandler(priority = EventPriority.HIGH)
	public void onArmorClick(InventoryClickEvent event){
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);
		
		
		if (event.getHotbarButton() != -1){
			ItemStack itemMoved = event.getCurrentItem();
				if(itemMoved.getItemMeta().getLore().equals(lore)){
					event.setCancelled(true);
					Player p = (Player) event.getWhoClicked();
					p.closeInventory();
					p.sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to move Wardrobe Items");
					p.playSound(p.getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
				}
			} else
		
		if(event.getCurrentItem().getItemMeta().getLore().equals(lore)){
			event.setCancelled(true);		
			Player p = (Player) event.getWhoClicked();
			p.closeInventory();
			p.sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to interact with Wardrobe Items");
			p.playSound(p.getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
		}	
	}
	
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onDrop(PlayerDropItemEvent event){
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);

		if(event.getItemDrop().getItemStack().getItemMeta().getLore().equals(lore)){
			//Makes sure to delete item if for some reason player gets the Item out of the Armor Slot
			event.getItemDrop().setItemStack(null);
			event.setCancelled(true);
			event.getPlayer().closeInventory();
			event.getPlayer().sendMessage(ChatColor.RED + "✕" +  ChatColor.GOLD +" You Are Not Allowed to drop Wardrobe Items");
			event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.MAGMACUBE_JUMP, 6, 6);
		}
	}
	
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onDeath(PlayerDeathEvent event){
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);
		
		Player p = (Player) event.getEntity();
		
		ItemStack[] armor = p.getInventory().getArmorContents();
		
		if(armor[0].getItemMeta().hasLore() || armor[1].getItemMeta().hasLore() || armor[2].getItemMeta().hasLore() || armor[3].getItemMeta().hasLore()){
			death_invs.put(p.getName(), armor);
			event.getDrops().clear();
		}
		
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onRespawn(PlayerRespawnEvent event){
		Player p = event.getPlayer();
		
		if(death_invs.containsKey(p.getName())){
			ItemStack[] armor = death_invs.get(p.getName()).clone();
			p.getInventory().setArmorContents(armor);
			death_invs.remove(p.getName());
		}
	}
	


}
