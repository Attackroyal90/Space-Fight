package com.ali.space.world.biomes;

import com.ali.space.init.BlockInit;

import net.minecraft.entity.Entity;
import net.minecraft.world.biome.Biome;

public class BiomeMoon_Ground extends Biome {
	public BiomeMoon_Ground() {
		super(new BiomeProperties("Moon_Ground").setRainDisabled().setTemperature(0f).setHeightVariation(0.1f));
		
		topBlock = BlockInit.moon_rock.getDefaultState();
		fillerBlock = BlockInit.moon_rock.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		
	}
	
	public int getSkyColor(Entity cameraEntity, float partialTicks) {
        return 0x000033; // Teinte sombre de bleu
    }
}
