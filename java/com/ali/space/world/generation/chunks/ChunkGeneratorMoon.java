package com.ali.space.world.generation.chunks;

import java.util.List;
import java.util.Random;

import com.ali.space.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld;

public class ChunkGeneratorMoon implements IChunkGenerator {
    private final World world;
    private final Random random;
    private NoiseGeneratorOctaves perlinNoise = new NoiseGeneratorOctaves(new Random(1000), 4);
    private final IBlockState moonRock = BlockInit.moon_rock.getDefaultState(); // Remplacez par votre bloc moon_rock

    public ChunkGeneratorMoon(World worldIn, long seed) {
        this.world = worldIn;
        this.random = new Random(seed);

        ContextOverworld ctx = new ContextOverworld(perlinNoise, perlinNoise, perlinNoise, null, null, null, null);
        ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, this.random, ctx);
        this.perlinNoise = ctx.getLPerlin1();
    }

    @Override
    public Chunk generateChunk(int x, int z) {
        Chunk chunk = new Chunk(this.world, x, z);
        IBlockState[] chunkBlocks = new IBlockState[16 * 256 * 16];

        for (int i = 0; i < chunkBlocks.length; i++) {
            chunkBlocks[i] = this.moonRock;
        }

        for (int xIndex = 0; xIndex < 16; xIndex++) {
            for (int zIndex = 0; zIndex < 16; zIndex++) {
                for (int yIndex = 0; yIndex < 256; yIndex++) {
                    chunk.setBlockState(new BlockPos(xIndex, yIndex, zIndex), chunkBlocks[(yIndex * 16 + zIndex) * 16 + xIndex]);
                }
            }
        }

        chunk.generateSkylightMap();
        return chunk;
    }

    @Override
    public void populate(int x, int z) {
        // Vous pouvez ajouter des structures, des entités, etc. ici
    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        // TODO : Générez vos structures ici
        return false;
    }

    @Override
    public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
        // TODO : Définissez les créatures possibles dans votre dimension
        return null;
    }

    @Override
    public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
        // TODO : Définissez les structures de votre dimension
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {
        // TODO : Recréez les structures dans votre dimension
    }

    @Override
    public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
        // Vérifiez si une structure est à l'intérieur des coordonnées spécifiées
        return false;
    }
}
