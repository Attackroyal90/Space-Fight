package com.ali.space.objects.blocks;

import java.util.Random;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.BlockInit;
import com.ali.space.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PyroweneOreMod extends Block{
	
	public PyroweneOreMod(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SpaceFight_Main.SpaceFightTab);
		setHardness(5.0F);
		setHarvestLevel(null, 2);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)

	    {

	        return ItemInit.pyrowene_crystal;

	    }


}
