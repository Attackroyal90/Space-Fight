package com.ali.space.init;

import java.util.ArrayList;
import java.util.List;

import com.ali.space.SpaceFight_Main;
import com.ali.space.creativetabs.SpaceFightTab;
import com.ali.space.objects.items.ItemBase;
import com.ali.space.objects.items.armor.ArmorMod;
import com.ali.space.objects.items.tools.ItemAxeMod;
import com.ali.space.objects.items.tools.ItemPickaxeMod;
import com.ali.space.objects.items.tools.ItemShovelMod;
import com.ali.space.objects.items.tools.ItemSwordMod;
import com.ali.space.utils.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//ToolMaterials
	public static final ToolMaterial FELDPATH_TOOL = EnumHelper.addToolMaterial("Space Tool", 5, 500, 25.0f, 5.0f, 10);
	public static final ToolMaterial PYROWENE_TOOL = EnumHelper.addToolMaterial("Space Tool", 6, 750, 30.0f, 6.5f, 15);
	
	//ArmorMaterials
	public static final ArmorMaterial PYROWENE_ARMOR = EnumHelper.addArmorMaterial("Pyrowene_Armor", Reference.MODID + ":pyrowene", 100, new int[] {3, 6, 5, 2}, 18, null, 1.5f);
	
	
    public static Item feldpath_ingot;
    public static Item pyrowene_crystal;
    public static Item seat;
    public static Item INOX_INGOT;
    public static Item FELDPATH_PICKAXE;
    public static Item FELDPATH_SHOVEL;
    public static Item FELDPATH_AXE;
    public static Item FELDPATH_SWORD;
    public static Item PYROWENE_PICKAXE;
    public static Item PYROWENE_SHOVEL;
    public static Item PYROWENE_AXE;
    public static Item PYROWENE_SWORD;
    public static Item PYROWENE_HELMET; 
    public static Item PYROWENE_CHESTPLATE;
    public static Item PYROWENE_LEGGINGS;
    public static Item PYROWENE_BOOTS;
    public static Item plate_mold;
    public static Item inox_plate;
	
	public static void init()
	{
		feldpath_ingot = new ItemBase("feldpath_ingot", SpaceFight_Main.SpaceFightTab);
		pyrowene_crystal = new ItemBase("pyrowene_crystal", SpaceFight_Main.SpaceFightTab);
		seat = new ItemBase("seat", SpaceFight_Main.SpaceFightTab);
		INOX_INGOT = new ItemBase("inox_ingot", SpaceFight_Main.SpaceFightTab);
		plate_mold= new ItemBase("plate_mold", SpaceFight_Main.SpaceFightTab);
		inox_plate= new ItemBase("inox_plate", SpaceFight_Main.SpaceFightTab);
		FELDPATH_PICKAXE = new ItemPickaxeMod("feldpath_pickaxe", FELDPATH_TOOL);
		FELDPATH_SHOVEL = new ItemShovelMod("feldpath_shovel", FELDPATH_TOOL);
		FELDPATH_AXE = new ItemAxeMod("feldpath_axe", FELDPATH_TOOL);
		FELDPATH_SWORD = new ItemSwordMod("feldpath_sword", FELDPATH_TOOL);
	    PYROWENE_PICKAXE = new ItemPickaxeMod("pyrowene_pickaxe", PYROWENE_TOOL);
	    PYROWENE_SHOVEL = new ItemShovelMod("pyrowene_shovel", PYROWENE_TOOL);
	    PYROWENE_AXE = new ItemAxeMod("pyrowene_axe", PYROWENE_TOOL);
	    PYROWENE_SWORD = new ItemSwordMod("pyrowene_sword", PYROWENE_TOOL);
	    PYROWENE_HELMET = new ArmorMod("pyrowene_helmet", PYROWENE_ARMOR, 1, EntityEquipmentSlot.HEAD);
	    PYROWENE_CHESTPLATE = new ArmorMod("pyrowene_chestplate", PYROWENE_ARMOR, 1, EntityEquipmentSlot.CHEST);  
	    PYROWENE_LEGGINGS = new ArmorMod("pyrowene_leggings", PYROWENE_ARMOR, 2, EntityEquipmentSlot.LEGS);
	    PYROWENE_BOOTS = new ArmorMod("pyrowene_boots", PYROWENE_ARMOR, 1, EntityEquipmentSlot.FEET);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(feldpath_ingot);
		event.getRegistry().registerAll(pyrowene_crystal);
		event.getRegistry().registerAll(seat);
		event.getRegistry().registerAll(INOX_INGOT);
		event.getRegistry().registerAll(inox_plate);
		event.getRegistry().registerAll(plate_mold);
		event.getRegistry().registerAll(FELDPATH_PICKAXE);
		event.getRegistry().registerAll(FELDPATH_SHOVEL);
		event.getRegistry().registerAll(FELDPATH_AXE);
		event.getRegistry().registerAll(FELDPATH_SWORD);
		event.getRegistry().registerAll(PYROWENE_PICKAXE);
		event.getRegistry().registerAll(PYROWENE_SHOVEL);
		event.getRegistry().registerAll(PYROWENE_AXE);
		event.getRegistry().registerAll(PYROWENE_SWORD);
		event.getRegistry().registerAll(PYROWENE_HELMET);
		event.getRegistry().registerAll(PYROWENE_CHESTPLATE);
		event.getRegistry().registerAll(PYROWENE_LEGGINGS);
		event.getRegistry().registerAll(PYROWENE_BOOTS);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		registerRender(feldpath_ingot);
		registerRender(pyrowene_crystal);
		registerRender(seat);
		registerRender(INOX_INGOT);
		registerRender(inox_plate);
		registerRender(plate_mold);
		registerRender(FELDPATH_PICKAXE);
		registerRender(FELDPATH_SHOVEL);
		registerRender(FELDPATH_AXE);
		registerRender(FELDPATH_SWORD);
		registerRender(PYROWENE_PICKAXE);
		registerRender(PYROWENE_SHOVEL);
		registerRender(PYROWENE_AXE);
		registerRender(PYROWENE_SWORD);
		registerRender(PYROWENE_HELMET);
		registerRender(PYROWENE_CHESTPLATE);
		registerRender(PYROWENE_LEGGINGS);
		registerRender(PYROWENE_BOOTS);
	}
	
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
 