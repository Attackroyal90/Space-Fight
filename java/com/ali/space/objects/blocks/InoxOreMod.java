package com.ali.space.objects.blocks;

import java.util.Random;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class InoxOreMod extends Block{
	
	public InoxOreMod(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SpaceFight_Main.SpaceFightTab);
		setHardness(5.0F);
		setHarvestLevel(null, 2);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)

	    {

	        return ItemInit.INOX_INGOT;

	    }


}
