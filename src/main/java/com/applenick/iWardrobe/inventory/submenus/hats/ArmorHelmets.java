package com.applenick.iWardrobe.inventory.submenus.hats;

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
				name = "§bArmor Helmets" ,
				onClose = WardrobeMenu.class
				)
public class ArmorHelmets extends Menu {

	public ArmorHelmets(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}
	
	private String helmetLore = iWardrobe.wardrobe_lore;


	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_HELMET ,
					name = "§bDiamond Helmet" ,
					lore = "§6Top of the Line")
			)
	public void diamondHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.DIAMOND_HELMET, ChatColor.AQUA + "Diamond Helmet", helmetLore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}


	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GOLD_HELMET ,
					name = "§eGolden Helmet" ,
					lore = "§6For the stylish ones")
			)
	public void goldenHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.GOLD_HELMET, ChatColor.YELLOW + "Golden Helmet", helmetLore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.IRON_HELMET ,
					name = "§7Iron Helmet" ,
					lore = "§6Stong yet simple")
			)
	public void ironHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.IRON_HELMET, ChatColor.GRAY + "Iron Helmet", helmetLore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}


	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_HELMET ,
					name = "§8Chainmail Helmet" ,
					lore = "§6 A hidden beauty")
			)
	public void chainHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.CHAINMAIL_HELMET, ChatColor.DARK_GRAY + "Chainmail Helmet", helmetLore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.LEATHER_HELMET ,
					name = "§6Leather Helmet" ,
					lore = "§6For the average ones")
			)
	public void leatherHelmet(WardrobePlayer player){
		player.getBukkit().getInventory().setHelmet(ItemUtils.getLoreItem(Material.LEATHER_HELMET, ChatColor.GOLD + "Leather Helmet", helmetLore));
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