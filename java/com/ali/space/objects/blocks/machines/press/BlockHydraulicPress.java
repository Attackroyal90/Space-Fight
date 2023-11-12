package com.ali.space.objects.blocks.machines.press;

import com.ali.space.SpaceFight_Main;
import com.ali.space.init.BlockInit;
import com.ali.space.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockHydraulicPress extends BlockContainer {
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
	    event.getRegistry().register(BlockInit.hydraulic_press);
	}

	public BlockHydraulicPress(String name, Material material) {
		super(material);
		setRegistryName(name);
		setCreativeTab(SpaceFight_Main.SpaceFightTab);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityHydraulicPress();
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);
		
		if(tileentity instanceof TileEntityHydraulicPress) {
			InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityHydraulicPress) tileentity);
		}
		super.breakBlock(worldIn, pos, state);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player,EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		}else {
			TileEntity tileentity = world.getTileEntity(pos);
			
			if(tileentity instanceof TileEntityHydraulicPress) {
				player.openGui(SpaceFight_Main.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return true;
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,ItemStack stack) {
		if(stack.hasDisplayName()) {
			TileEntity tileentity = worldIn.getTileEntity(pos);
			
			if(tileentity instanceof TileEntityHydraulicPress) {
				((TileEntityHydraulicPress)tileentity).setCustomName(stack.getDisplayName());
			}
		}
	}
}
