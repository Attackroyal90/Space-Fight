package com.ali.space.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.ali.space.SpaceFight_Main;

public class ItemBase extends Item {
	public ItemBase (String name, CreativeTabs tabs) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tabs);
	}
}