package com.tehcn.additiveores.core.itemgroup;

import com.tehcn.additiveores.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AdditiveOresItemGroup extends ItemGroup {

    public static final AdditiveOresItemGroup ADDITIVE_ORES = new AdditiveOresItemGroup(ItemGroup.GROUPS.length, "additiveores");

    public AdditiveOresItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.MITHRIL_INGOT.get());
    }
}
