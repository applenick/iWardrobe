package com.applenick.iWardrobe.inventory.submenus;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.iWardrobe;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.sounds.SoundUtil;
import com.applenick.iWardrobe.utils.ItemUtils;

@MenuInventory(slots = 9 ,
			   name = "§b§nChestplate" ,
			   onClose = WardrobeMenu.class
			   )
public class ChestPlateMenu extends Menu {

	public ChestPlateMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}
	
	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_CHESTPLATE ,
					name = "§bDiamond §aChestplate" ,
					lore = "§6Top of the Line")
			)
	public void diamondChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(ItemUtils.getLoreItem(Material.DIAMOND_CHESTPLATE, ChatColor.AQUA + "Diamond Chestplate", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}
	
	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GOLD_CHESTPLATE ,
					name = "§eGolden §aChestplate" ,
					lore = "§6For the stylish ones")
			)
	public void goldenChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(ItemUtils.getLoreItem(Material.GOLD_CHESTPLATE, ChatColor.YELLOW + "Gold Chestplate", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}
	
	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.IRON_CHESTPLATE ,
					name = "§7Iron §aChestplate" ,
					lore = "§6Strong yet simple")
			)
	public void ironChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(ItemUtils.getLoreItem(Material.IRON_CHESTPLATE, ChatColor.GRAY + "Iron Chestplate", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}
	
	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_CHESTPLATE ,
					name = "§cChainmail §aChestplate" ,
					lore = "§6A hidden beauty")
			)
	public void chainmailChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(ItemUtils.getLoreItem(Material.CHAINMAIL_CHESTPLATE, ChatColor.RED + "Chainmail Chestplate", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}
	
	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.LEATHER_CHESTPLATE ,
					name = "§dLeather §aChestplate" ,
					lore = "§6For the average ones")
			)
	public void leatherChestPlate(WardrobePlayer player){
		player.getBukkit().getInventory().setChestplate(ItemUtils.getLoreItem(Material.LEATHER_CHESTPLATE, ChatColor.LIGHT_PURPLE + "Leather Chestplate", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}
	
	
	@MenuItem(slot = 8 , 
			item = @ItemStackAnnotation(
					material = Material.TRAP_DOOR ,
					name = "§4Return" ,
					lore = "§cReturn to wardrobe menu")
			)
	public void closeInv(WardrobePlayer player){
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

}
