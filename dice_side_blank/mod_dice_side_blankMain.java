/* GENERATED BY JTRENT238 MOD MAKER */

package com.jtrent238.modmaker.mod.dicemaker.dice_side_blank;

import com.jtrent238.modmaker.mod.dicemaker.dice_side_blank.dice_side_blank;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


	@Mod(modid=mod_dice_side_blankMain.MODID, name=mod_dice_side_blankMain.MODNAME, version=mod_dice_side_blankMain.MODVERSION)
	public class mod_dice_side_blankMain{

		public static final String MODID = "dice_side_blank";
		public static final String MODNAME = "dice_side_blank";
		public static final String MODAUTHOR = "jtrent238, dicemaker";
		public static final String MODVERSION = "1";

		public static Block dice_side_blank;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		dice_side_blank = new dice_side_blank(Material.rock).setBlockName("dice_side_blank").setBlockTextureName("dice_side_blank").setCreativeTab(CreativeTabs.tabMisc);

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		GameRegistry.registerBlock(dice_side_blank, "dice_side_blank");

	}
}