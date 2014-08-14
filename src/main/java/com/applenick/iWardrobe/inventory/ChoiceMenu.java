package com.applenick.iWardrobe.inventory;

import java.util.ArrayList;
import java.util.List;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.iWardrobe;
import com.applenick.iWardrobe.sounds.SoundUtil;
import com.sk89q.minecraft.util.commands.ChatColor;


@MenuInventory(
		slots = 9,
		name = "§4Are You Sure?"
		)
public class ChoiceMenu extends Menu {

	public ChoiceMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}


	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_BLOCK ,
					name = "§bAccept",
					lore = "§aRemove My Current Wardrobe Selection")
			)
	public void deleteWardrobe(WardrobePlayer player){
		deleteInventory(player);
	}

	@MenuItem(slot = 5 , 
			item = @ItemStackAnnotation(
					material = Material.REDSTONE_BLOCK ,
					name = "§4Deny",
					lore = "§cDo not remove, and return to menu.")
			)
	public void denyDelete(WardrobePlayer player){
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	private void deleteInventory(WardrobePlayer player){
		Player p = player.getBukkit();
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);

		ItemStack[] armor = p.getInventory().getContents();

		for(ItemStack item : armor){
			if(!(item.getType().equals(Material.AIR))){
				if(item.getItemMeta().getLore().equals(lore)){
					item.setType(Material.AIR);
				}				
			}
		}


		p.closeInventory();
		p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "✓" + ChatColor.AQUA + " Your Wardrobe has been cleared.");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 3, 3);
	}
}