package com.ali.space.objects.items.tools;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.ItemInit;
import com.ali.space.utils.interfaces.IHasModel;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.world.World;

public class ItemPickaxeMod extends ItemPickaxe implements IHasModel{

	public ItemPickaxeMod(String name, ToolMaterial material) {
		super(material);
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
	public boolean onEntityItemUpdate(World worldIn, EntityItem entityItem, EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}

}
