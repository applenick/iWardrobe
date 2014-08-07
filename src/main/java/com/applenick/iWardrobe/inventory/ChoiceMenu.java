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
import com.sk89q.minecraft.util.commands.ChatColor;


@MenuInventory(
		slots = 9,
		name = "§4 Are You Sure?"
		)
public class ChoiceMenu extends Menu {

	public ChoiceMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}


	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_BLOCK ,
					name = "§bAccept")
			)
	public void deleteWardrobe(WardrobePlayer player){
		deleteInventory(player);
	}

	@MenuItem(slot = 5 , 
			item = @ItemStackAnnotation(
					material = Material.REDSTONE_BLOCK ,
					name = "§4Deny")
			)
	public void denyDelete(WardrobePlayer player){
		player.getBukkit().closeInventory();
	}

	private void deleteInventory(WardrobePlayer player){
		Player p = player.getBukkit();
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);

		if(p.getInventory().getHelmet() != null){
			ItemStack hat = p.getInventory().getHelmet();
			if(hat.getItemMeta().hasLore() && hat.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(hat);
			}
		}
		if(p.getInventory().getChestplate() != null){
			ItemStack chestplate = p.getInventory().getChestplate();
			if(chestplate.hasItemMeta() && chestplate.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(chestplate);
			}
		} 
		if(p.getInventory().getLeggings() != null){
			ItemStack leggings = p.getInventory().getLeggings();
			if(leggings.hasItemMeta() && leggings.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(leggings);
			}
		} 
		if(p.getInventory().getBoots() != null){
			ItemStack boots = p.getInventory().getBoots();
			if(boots.hasItemMeta() && boots.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(boots);
			}
		}
		p.closeInventory();
		p.sendMessage(ChatColor.GREEN + "✓" + ChatColor.AQUA + " Your Wardrobe has been cleared.");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 3, 3);
	}
}
