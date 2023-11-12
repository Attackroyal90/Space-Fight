package com.ali.space.world.dimensions;

import com.ali.space.init.BiomeInit;
import com.ali.space.init.DimensionInit;
import com.ali.space.utils.handlers.RegistryHandler;
import com.ali.space.world.generation.chunks.ChunkGeneratorMoon;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionMoon extends WorldProvider
{
	public DimensionMoon() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.MOON_GROUND);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.MOON;
	}
	
	public BiomeProvider createBiomeProvider() {
        return new BiomeProviderSingle(BiomeInit.MOON_GROUND);
    }
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorMoon(world, 2);
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}