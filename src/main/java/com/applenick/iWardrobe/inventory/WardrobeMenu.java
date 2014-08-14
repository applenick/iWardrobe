package com.applenick.iWardrobe.inventory;

import net.njay.Menu;
import net.njay.MenuManager;
import net.njay.annotation.ItemStackAnnotation;
import net.njay.annotation.MenuInventory;
import net.njay.annotation.MenuItem;
import net.njay.annotation.NestedMenu;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import com.applenick.iWardrobe.WardrobePlayer;
import com.applenick.iWardrobe.inventory.submenus.BootsMenu;
import com.applenick.iWardrobe.inventory.submenus.ChestPlateMenu;
import com.applenick.iWardrobe.inventory.submenus.HatMenu;
import com.applenick.iWardrobe.inventory.submenus.PantsMenu;
import com.applenick.iWardrobe.inventory.submenus.hats.ArmorHelmets;
import com.applenick.iWardrobe.inventory.submenus.hats.FunHelmets;
import com.applenick.iWardrobe.sounds.SoundUtil;


@MenuInventory(
		slots = 45,
		name = "§5§lWardrobe"
		)
@NestedMenu(
		{
			HatMenu.class,
			ChestPlateMenu.class,
			PantsMenu.class,
			BootsMenu.class,
			ArmorHelmets.class,
			FunHelmets.class,
			ChoiceMenu.class
		}
		)
public class WardrobeMenu extends Menu {
	
	public WardrobeMenu(MenuManager manager, Inventory inv) {
		super(manager, inv);
		
	}

	@MenuItem(
			slot = 4,
			item = @ItemStackAnnotation(
					material = Material.LEATHER_HELMET,
					name = "§aHats",
					lore = "§6Select your §aHat"
					)
			)

	public void openHatMenu(WardrobePlayer player){
		player.setActiveMenu(new HatMenu(manager , null));
	}

	@MenuItem(
			slot = 13,
			item = @ItemStackAnnotation(
					material = Material.GOLD_CHESTPLATE,
					name = "§3Chestplates",
					lore = "§6Select your §3Chestplate"
					)
			)
	public void openChestplate(WardrobePlayer player){
		player.setActiveMenu(new ChestPlateMenu(manager , null));
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(
			slot = 22,
			item = @ItemStackAnnotation(
					material = Material.IRON_LEGGINGS,
					name = "§cPants",
					lore = "§6Select your §cPants"
					)
			)
	public void openLegs(WardrobePlayer player){
		player.setActiveMenu(new PantsMenu(manager , null));
		SoundUtil.click(player.getBukkit());
	}

	@MenuItem(
			slot = 31,
			item = @ItemStackAnnotation(
					material = Material.DIAMOND_BOOTS,
					name = "§eBoots",
					lore = "§6Select your §eBoots"
					)
			)
	public void openBoots(WardrobePlayer player){
		player.setActiveMenu(new BootsMenu(manager , null));
		SoundUtil.click(player.getBukkit());
	}


	@MenuItem(
			slot = 6,
			item = @ItemStackAnnotation(
					material = Material.LAVA_BUCKET,
					name = "§cReset Your Outfit",
					lore = "§6Removes all Wardrobe Items"
					)
			)
	public void resetWardrobe(WardrobePlayer player){
		player.setActiveMenu(new ChoiceMenu(manager , null));
		SoundUtil.click(player.getBukkit());		
	}


}
