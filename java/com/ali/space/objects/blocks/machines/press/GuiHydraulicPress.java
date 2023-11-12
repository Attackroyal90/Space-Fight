package com.ali.space.objects.blocks.machines.press;

import com.ali.space.utils.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiHydraulicPress extends GuiContainer{
	
	private static final ResourceLocation background = new ResourceLocation(Reference.MODID,"textures/gui/container/hydraulic_press.png");
	private final TileEntityHydraulicPress tile;
	
	public GuiHydraulicPress(TileEntityHydraulicPress tile, InventoryPlayer playerInv) {
        super(new ContainerHydraulicPress(tile, playerInv));
        this.tile = tile;
}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawDefaultBackground();
		this.mc.getTextureManager().bindTexture(background);
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
		
		int timePassed = this.tile.getField(1);
		int textureWidth = (int) (23f / 200f * timePassed);
		this.drawTexturedModalRect(i+81, j+24, 177, 18, textureWidth, 7);
		
		if (this.tile.isBurning()) {
			int burningTime = this.tile.getField(0);
			int textureHeight = (int) (12f / this.tile.getFullBurnTime() * burningTime);
			this.drawTexturedModalRect(i +37, j + 26 + 12 - textureHeight, 177, 12 - textureHeight, 27, textureHeight);
		}
		
		this.fontRenderer.drawString(this.tile.getName(), i+80, j +45, 0xFFFFFF);
	}
	
	@Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) 
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
