package com.applenick.iWardrobe.sounds;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundUtil {
	
	
	public static void click(Player player){
		player.playSound(player.getLocation(), Sound.NOTE_BASS_GUITAR, 4, 4);
	}

}
