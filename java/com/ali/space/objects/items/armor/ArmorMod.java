package com.ali.space.objects.items.armor;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.ItemInit;
import com.ali.space.utils.interfaces.IHasModel;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorMod extends ItemArmor implements IHasModel{

	public ArmorMod(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SpaceFight_Main.SpaceFightTab);
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		SpaceFight_Main.proxy.registerItemRenderer(this, 0);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		super.onArmorTick(world, player, itemStack);
	}

	@Override
	public boolean onEntityItemUpdate(World worldIn, EntityItem entityItem, EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}

}
