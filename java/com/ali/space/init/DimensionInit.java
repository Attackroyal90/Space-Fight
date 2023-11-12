package com.ali.space.init;

import com.ali.space.world.dimensions.DimensionMoon;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
    public static final DimensionType MOON = DimensionType.register("Moon", "_space", 2, DimensionMoon.class, false);
    
    public static void registerDimensions() {
    	DimensionManager.registerDimension(2, MOON);
    }
}
