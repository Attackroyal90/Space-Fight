package com.ali.space.utils.handlers;

import com.ali.space.objects.blocks.machines.press.TileEntityHydraulicPress;
import com.ali.space.utils.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityHydraulicPress.class, new ResourceLocation(Reference.MODID + ":hydraulic_press"));
	}
}
