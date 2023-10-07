package net.rogue238.imagine;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.block.custom.FarmlandTransformHandler;
import net.rogue238.imagine.item.ModCreativeModeTabs;
import net.rogue238.imagine.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Imaginative_biomes.MOD_ID)
public class Imaginative_biomes
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "imagine";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Imaginative_biomes()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(FarmlandTransformHandler.class);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PANSY.getId(), ModBlocks.POTTED_PANSY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FAIRY_BUSH.getId(), ModBlocks.POTTED_FAIRY_BUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FAIRY_TULIP.getId(), ModBlocks.POTTED_FAIRY_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GLOBE_THISEL.getId(), ModBlocks.POTTED_GLOBE_THISEL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LUNGWORT.getId(), ModBlocks.POTTED_LUNGWORT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FAIRY_GRASS1.getId(), ModBlocks.POTTED_FAIRY_GRASS1);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FAIRY_SAPLING.getId(), ModBlocks.POTTED_FAIRY_SAPLING);

        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = Imaginative_biomes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            
        }
    }
}
