package com.ali.space.utils.handlers;

import com.ali.space.SpaceFight_Main;
import com.ali.space.commands.CommandTeleportDimension;
import com.ali.space.init.BiomeInit;
import com.ali.space.init.BlockInit;
import com.ali.space.init.DimensionInit;
import com.ali.space.init.ItemInit;
import com.ali.space.objects.blocks.machines.press.TileEntityHydraulicPress;
import com.ali.space.utils.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {
	
	public static void preInitRegistries(FMLPreInitializationEvent event) {
		ItemInit.init();	
		BlockInit.init();
		BiomeInit.registerBiomes();
		DimensionInit.registerDimensions();
		EventHandler.registerEvents();
		SpaceFight_Main.proxy.registerRender();
		NetworkRegistry.INSTANCE.registerGuiHandler(SpaceFight_Main.instance, new GuiHandler());
        GameRegistry.registerTileEntity(TileEntityHydraulicPress.class, new ResourceLocation(Reference.MODID + "/textures/gui/hydraulic_press.png"));
		}
	
    public static void initRegistries(FMLInitializationEvent event) {
		RecipesHandler.RegisterRecipes();
		SpaceFight_Main.proxy.register();
	}
    
    public static void postInitRegistries(FMLPostInitializationEvent event) {
		
	}

	public static void serverRegistries(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandTeleportDimension());
		
	}
	
}