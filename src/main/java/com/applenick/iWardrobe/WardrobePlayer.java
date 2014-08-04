package com.applenick.iWardrobe;

import net.njay.player.MenuPlayer;

import org.bukkit.entity.Player;

public class WardrobePlayer extends MenuPlayer {
	
	public WardrobePlayer(Player player){
		super(player);
		resetManager();
	}

}
