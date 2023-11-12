package com.ali.space.utils.interfaces;

import com.ali.space.objects.items.armor.ArmorMod;
import com.ali.space.objects.items.tools.ItemAxeMod;
import com.ali.space.objects.items.tools.ItemPickaxeMod;
import com.ali.space.objects.items.tools.ItemShovelMod;
import com.ali.space.objects.items.tools.ItemSwordMod;
import com.ali.space.init.BlockInit;;

public interface IProxy {

	void preInit();
    // Définissez ici les méthodes que les classes ClientProxy et ServerProxy devront implémenter.

	void init();

	void postInit();

	void registerRender();

	void register();

	void registerItemRenderer(ArmorMod armorMod, int i);

	void registerItemRenderer(ItemAxeMod itemAxeMod, int i);

	void registerItemRenderer(ItemPickaxeMod itemPickaxeMod, int i);

	void registerItemRenderer(ItemShovelMod itemShovelMod, int i);

	void registerItemRenderer(ItemSwordMod itemSwordMod, int i);
	
	
}
