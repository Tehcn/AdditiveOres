package com.tehcn.additiveores.core.init;

import com.tehcn.additiveores.AdditiveOres;
import com.tehcn.additiveores.core.itemgroup.AdditiveOresItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditiveOres.MOD_ID);

    public static final RegistryObject<Item> STAFF = ITEMS.register("staff",
            () -> new Item(new Item.Properties().group(AdditiveOresItemGroup.ADDITIVE_ORES)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().group(AdditiveOresItemGroup.ADDITIVE_ORES)));
}
