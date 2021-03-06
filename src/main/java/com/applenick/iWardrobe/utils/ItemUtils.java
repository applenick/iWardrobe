package com.applenick.iWardrobe.utils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemUtils {

	public static ItemStack getLoreItem(Material material, @Nullable String displayName , String loreMSG){
		ItemStack item = new ItemStack(material);
		ItemMeta meta = item.getItemMeta();
		
		List<String> lore = new ArrayList<String>();
		lore.add(loreMSG);
		meta.setLore(lore);
		if(displayName != null){
			meta.setDisplayName(displayName);
		}
		item.setItemMeta(meta);
		return item;
	}
	
	public static ItemStack createWoolItem(Material material, String name, String lore , byte color) {
        ItemStack item = new ItemStack(material, 1, (byte) color);
        ItemMeta meta = item.getItemMeta();
 
        meta.setDisplayName(name);
 
        item.setItemMeta(meta);   
        return item;
    }
}
