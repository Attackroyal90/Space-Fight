package com.ali.space.utils.handlers;

import com.ali.space.objects.blocks.machines.press.ContainerHydraulicPress;
import com.ali.space.objects.blocks.machines.press.GuiHydraulicPress;
import com.ali.space.objects.blocks.machines.press.TileEntityHydraulicPress;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
        if(te instanceof TileEntityHydraulicPress) {
            return new ContainerHydraulicPress((TileEntityHydraulicPress)te, player.inventory);
        }
        return null;
    }
 

	 @Override
	    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
	        if(te instanceof TileEntityHydraulicPress) {
	            return new GuiHydraulicPress((TileEntityHydraulicPress)te, player.inventory);
	        }
	        return null;
	    }

}
