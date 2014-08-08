package com.applenick.iWardrobe.sounds;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundUtil {
	
	
	public static void click(Player player){
		player.playSound(player.getLocation(), Sound.ITEM_PICKUP, 4, 4);
	}

}
