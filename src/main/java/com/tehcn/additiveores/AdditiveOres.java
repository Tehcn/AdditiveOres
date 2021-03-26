package com.tehcn.additiveores;

import com.tehcn.additiveores.core.init.BlockInit;
import com.tehcn.additiveores.core.init.FeatureInit;
import com.tehcn.additiveores.core.init.ItemInit;
import com.tehcn.additiveores.core.init.TileEntityTypesInit;
import com.tehcn.additiveores.core.itemgroup.AdditiveOresItemGroup;
//import net.minecraft.block.Block;
//import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
//import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
//import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
//import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("additiveores")
@Mod.EventBusSubscriber(modid = AdditiveOres.MOD_ID, bus = Bus.MOD)
public class AdditiveOres {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "additiveores";

    public AdditiveOres() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(AdditiveOresItemGroup.ADDITIVE_ORES))
                    .setRegistryName(block.getRegistryName()));
        });
    }
}
