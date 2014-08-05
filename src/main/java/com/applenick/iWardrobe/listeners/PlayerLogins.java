package com.applenick.iWardrobe.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerLogins implements Listener {
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		Player p = event.getPlayer();
		
		//TODO: Check each Armor slot to see if Items worn contain the "Wardrobe" Item Lore
	
	}

}
