package com.ali.space.utils.interfaces;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public interface IHasModel {
	public void registerModels();

	boolean onEntityItemUpdate(World worldIn, EntityItem entityItem, EntityPlayer playerIn);
}
