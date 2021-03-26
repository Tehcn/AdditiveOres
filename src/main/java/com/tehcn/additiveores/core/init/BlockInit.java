package com.tehcn.additiveores.core.init;

import com.tehcn.additiveores.AdditiveOres;
import com.tehcn.additiveores.common.block.QuarryBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditiveOres.MOD_ID);

    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore",
            () -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock());
}
