package com.ali.space.proxy;

import com.ali.space.objects.items.armor.ArmorMod;
import com.ali.space.objects.items.tools.ItemAxeMod;
import com.ali.space.objects.items.tools.ItemPickaxeMod;
import com.ali.space.objects.items.tools.ItemShovelMod;
import com.ali.space.objects.items.tools.ItemSwordMod;
import com.ali.space.utils.interfaces.IProxy;

public class ClientProxy implements IProxy {
    @Override
    public void preInit() {
        // Code spécifique au client pour la phase de pré-initialisation
    }

    @Override
    public void init() {
        // Code spécifique au client pour la phase d'initialisation
    }

    @Override
    public void postInit() {
        // Code spécifique au client pour la phase de post-initialisation
    }

	@Override
	public void registerRender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemRenderer(ArmorMod armorMod, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemRenderer(ItemAxeMod itemAxeMod, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemRenderer(ItemPickaxeMod itemPickaxeMod, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemRenderer(ItemShovelMod itemShovelMod, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerItemRenderer(ItemSwordMod itemSwordMod, int i) {
		// TODO Auto-generated method stub
		
	}
}