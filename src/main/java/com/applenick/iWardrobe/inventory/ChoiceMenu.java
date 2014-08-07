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
	}

	private void deleteInventory(WardrobePlayer player){
		Player p = player.getBukkit();
		List<String> lore = new ArrayList<String>();
		lore.add(iWardrobe.wardrobe_lore);

		/*if(p.getInventory().getHelmet() != null){
			ItemStack hat = p.getInventory().getHelmet();
			if(hat.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(hat);
			}
		}
		if(p.getInventory().getChestplate() != null){
			ItemStack chestplate = p.getInventory().getChestplate();
			if(chestplate.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(chestplate);
			}
		} 
		if(p.getInventory().getLeggings() != null){
			ItemStack leggings = p.getInventory().getLeggings();
			if(leggings.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(leggings);
			}
		} 
		if(p.getInventory().getBoots() != null){
			ItemStack boots = p.getInventory().getBoots();
			if(boots.getItemMeta().getLore().equals(lore)){
				p.getInventory().remove(boots);
			}
		}*/
		ItemStack[] player_armor = p.getInventory().getArmorContents();
		
		if(player_armor[0].hasItemMeta()){
			if(player_armor[0].getItemMeta().getLore().contains(lore)){
				p.getInventory().remove(player_armor[0].getType());
			}
		}
				
		
		p.closeInventory();
		p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "✓" + ChatColor.AQUA + " Your Wardrobe has been cleared.");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 3, 3);
	}
}
