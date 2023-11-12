package com.ali.space.utils.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler {
	public static void RegisterRecipes() {
		GameRegistry.addSmelting(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.COAL, 1), 1.5f);
	}
}
