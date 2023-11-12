package com.ali.space.events;

import com.ali.space.init.DimensionInit;
import com.ali.space.utils.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class MoonGravityEvent {

    private static final String JUMPING_KEY = "moon_jump";

    @SubscribeEvent
    public static void onLivingJump(LivingEvent.LivingJumpEvent event) {
        if (!(event.getEntityLiving() instanceof EntityPlayer)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) event.getEntityLiving();

        if (player.dimension != DimensionInit.MOON.getId()) {
            return;
        }

        NBTTagCompound playerData = player.getEntityData();
        playerData.setBoolean(JUMPING_KEY, true);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.START || event.player.isSneaking() || !(event.player instanceof EntityPlayer)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) event.player;

        if (player.dimension != DimensionInit.MOON.getId()) {
            return;
        }

        handleFalling(player);
    }

    private static void handleFalling(EntityPlayer player) {
        if (player.motionY < -0.2) {
            player.motionY *= 0.8; // Ralentir la chute en réduisant la vitesse
            player.fallDistance = 0;
        }

        NBTTagCompound playerData = player.getEntityData();
        if (playerData.getBoolean(JUMPING_KEY)) {
            player.motionY += 0.5; // Ajouter de la vitesse verticale lors du saut
            playerData.setBoolean(JUMPING_KEY, false);
        }
    }
}
