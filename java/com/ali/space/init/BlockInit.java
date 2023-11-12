package com.ali.space.init;
import java.util.ArrayList;
import java.util.List;

import com.ali.space.objects.blocks.BlockBasic;
import com.ali.space.objects.blocks.FeldpathOreMod;
import com.ali.space.objects.blocks.InoxOreMod;
import com.ali.space.objects.blocks.PyroweneOreMod;
import com.ali.space.objects.blocks.machines.press.BlockHydraulicPress;
import com.ali.space.objects.items.armor.ArmorMod;
import com.ali.space.objects.items.tools.ItemAxeMod;
import com.ali.space.objects.items.tools.ItemPickaxeMod;
import com.ali.space.objects.items.tools.ItemShovelMod;
import com.ali.space.objects.items.tools.ItemSwordMod;
import com.ali.space.utils.Reference;
import com.ali.space.utils.interfaces.IProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class BlockInit {
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block moon_rock;
	public static Block feldpath_ore;
	public static Block pyrowene_ore;
	public static Block inox_ore;
	public static Block hydraulic_press;
	
	
	public static void init() 
	{
		moon_rock = new BlockBasic("moon_rock", Material.ROCK);
		feldpath_ore = new FeldpathOreMod("feldpath_ore", Material.ROCK);
		pyrowene_ore = new PyroweneOreMod("pyrowene_ore", Material.ROCK);
		inox_ore = new InoxOreMod("inox_ore", Material.ROCK);
		hydraulic_press= new BlockHydraulicPress("hydraulic_press", Material.ROCK);

	}
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(moon_rock);
		event.getRegistry().registerAll(feldpath_ore);
		event.getRegistry().registerAll(pyrowene_ore);
		event.getRegistry().registerAll(inox_ore);
		event.getRegistry().registerAll(hydraulic_press);
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				new ItemBlock(moon_rock).setRegistryName(moon_rock.getRegistryName()),
				new ItemBlock(feldpath_ore).setRegistryName(feldpath_ore.getRegistryName()),
				new ItemBlock(pyrowene_ore).setRegistryName(pyrowene_ore.getRegistryName()),
				new ItemBlock(inox_ore).setRegistryName(inox_ore.getRegistryName()),
				new ItemBlock(hydraulic_press).setRegistryName(hydraulic_press.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{		
		registerRender(Item.getItemFromBlock(moon_rock));
		registerRender(Item.getItemFromBlock(feldpath_ore));
		registerRender(Item.getItemFromBlock(pyrowene_ore));
		registerRender(Item.getItemFromBlock(inox_ore));
		registerRender(Item.getItemFromBlock(hydraulic_press));

		
	}

	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "Inventory"));
	}
}
