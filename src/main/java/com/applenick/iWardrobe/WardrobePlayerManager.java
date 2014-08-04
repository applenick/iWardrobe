package com.applenick.iWardrobe;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.google.common.collect.Maps;

import net.njay.player.MenuPlayerManager;

public class WardrobePlayerManager extends MenuPlayerManager {
	 private static HashMap<Player, WardrobePlayer> players = Maps.newHashMap();
	 
	 public WardrobePlayer getPlayer(String pname){
		 return getPlayer(iWardrobe.get().getServer().getPlayerExact(pname));
	 }
	 
	 public WardrobePlayer getPlayer(Player player){
		 if(players.containsKey(player)){
			 return players.get(player);
		 }
		 
		 WardrobePlayer newPlayer = new WardrobePlayer(player);
		 players.put(player, newPlayer);
		 
		 return newPlayer;
	 }
	 
	 public void deletePlayer(Player player){
		 players.remove(player);
	 }

}
