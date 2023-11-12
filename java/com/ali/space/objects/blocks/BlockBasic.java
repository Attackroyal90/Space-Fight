package com.ali.space.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.ali.space.SpaceFight_Main;

public class BlockBasic extends Block {
		public BlockBasic(String name, Material materialIn) 
		{
			super(materialIn);
			setUnlocalizedName(name);
			setRegistryName(name);
			setResistance(2.0F);
		    setHardness(2.0F);
		    setCreativeTab(SpaceFight_Main.SpaceFightTab);	  
	   }
}
