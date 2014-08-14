package com.applenick.iWardrobe.inventory.submenus;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.iWardrobe;
import com.applenick.iWardrobe.inventory.WardrobeMenu;
import com.applenick.iWardrobe.sounds.SoundUtil;
import com.applenick.iWardrobe.utils.ItemUtils;


@MenuInventory(slots = 9 ,
				name = "§b§nPants",
				onClose = WardrobeMenu.class
			  )
public class PantsMenu extends Menu {

	public PantsMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
	}

	@MenuItem(slot = 0 , 
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_LEGGINGS ,
					name = "§bDiamond §aPants" ,
					lore = "§6Top of the line")
			)
	public void diamondLegs(WardrobePlayer player){
		player.getBukkit().getInventory().setLeggings(ItemUtils.getLoreItem(Material.DIAMOND_LEGGINGS, ChatColor.AQUA + "Diamond Leggings", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(slot = 1 , 
			item = @ItemStackAnnotation(
					material = Material.GOLD_LEGGINGS ,
					name = "§eDiamond §aPants" ,
					lore = "§6For the stylish one")
			)
	public void goldenLegs(WardrobePlayer player){
		player.getBukkit().getInventory().setLeggings(ItemUtils.getLoreItem(Material.GOLD_LEGGINGS, ChatColor.YELLOW + "Gold Leggings", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(slot = 2 , 
			item = @ItemStackAnnotation(
					material = Material.IRON_LEGGINGS ,
					name = "§7Iron §aPants" ,
					lore = "§6Strong yet simple")
			)
	public void ironLegs(WardrobePlayer player){
		player.getBukkit().getInventory().setLeggings(ItemUtils.getLoreItem(Material.IRON_LEGGINGS, ChatColor.GRAY + "Iron Leggings", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(slot = 3 , 
			item = @ItemStackAnnotation(
					material = Material.CHAINMAIL_LEGGINGS ,
					name = "§cChainmail §aPants" ,
					lore = "§6Hidden beauty")
			)
	public void chainmailLegs(WardrobePlayer player){
		player.getBukkit().getInventory().setLeggings(ItemUtils.getLoreItem(Material.CHAINMAIL_LEGGINGS, ChatColor.RED + "Chainmail Leggings", iWardrobe.wardrobe_lore));
		player.getBukkit().closeInventory();
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(slot = 4 , 
			item = @ItemStackAnnotation(
					material = Material.LEATHER_LEGGINGS ,
					name = "§dLeather §aPants" ,
					lore = "§6For the average ones")
			)
	public void leatherLegs(WardrobePlayer player){
		player.getBukkit().getInventory().setLeggings(ItemUtils.getLoreItem(Material.LEATHER_LEGGINGS, ChatColor.LIGHT_PURPLE + "Leather Leggings", iWardrobe.wardrobe_lore));
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
