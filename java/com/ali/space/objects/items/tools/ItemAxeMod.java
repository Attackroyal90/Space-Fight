package com.ali.space.objects.items.tools;

import java.util.Set;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.ItemInit;
import com.ali.space.utils.interfaces.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
 
public class ItemAxeMod extends ItemTool implements IHasModel{
 
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
 
    public ItemAxeMod(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(SpaceFight_Main.SpaceFightTab);
        
        ItemInit.ITEMS.add(this);
    }
 
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }
 
    @Override
    public void registerModels() 
    {
        SpaceFight_Main.proxy.registerItemRenderer(this, 0);
    }

	@Override
	public boolean onEntityItemUpdate(World worldIn, EntityItem entityItem, EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}
 
}
