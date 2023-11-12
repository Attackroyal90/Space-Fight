package com.ali.space.utils.handlers;


import com.ali.space.events.MoonGravityEvent;

import net.minecraftforge.common.MinecraftForge;


public class EventHandler 
{
        public static void registerEvents()
        {
                MoonGravityEvent MoonEvent = new MoonGravityEvent();
                
                MinecraftForge.EVENT_BUS.register(MoonEvent);
        }
}
