package net.rogue238.imagine.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>
            CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Imaginative_biomes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> IMAGINATIVE_BIOMES = CREATIVE_MODE_TABS.register("imaginative_biomes",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HAPPY_PANSY.get()))
            .title(Component.translatable("creativetab.imaginative_biomes"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.FAIRY_FRUIT.get());
                pOutput.accept(ModItems.FAIRY_SEEDS.get());
                pOutput.accept(ModBlocks.PANSY.get());
                pOutput.accept(ModItems.HAPPY_PANSY.get());
                pOutput.accept(ModBlocks.FAIRY_TULIP.get());
                pOutput.accept(ModBlocks.GLOBE_THISEL.get());
                pOutput.accept(ModBlocks.LUNGWORT.get());
                pOutput.accept(ModBlocks.FAIRY_GRASS1.get());
                pOutput.accept(ModBlocks.FAIRY_BUSH.get());
                pOutput.accept(ModBlocks.FAIRY_DIRT.get());
                pOutput.accept(ModBlocks.FAIRY_FARMLAND.get());
                pOutput.accept(ModBlocks.FAIRY_SAPLING.get());
                pOutput.accept(ModBlocks.FAIRY_LOG.get());
                pOutput.accept(ModBlocks.FAIRY_WOOD.get());
                pOutput.accept(ModBlocks.STRIPPED_FAIRY_LOG.get());
                pOutput.accept(ModBlocks.STRIPPED_FAIRY_WOOD.get());
                pOutput.accept(ModBlocks.FAIRY_LEAVES.get());
                pOutput.accept(ModBlocks.FAIRY_PLANKS.get());
                pOutput.accept(ModBlocks.FAIRY_STAIRS.get());
                pOutput.accept(ModBlocks.FAIRY_SLAB.get());
                pOutput.accept(ModBlocks.FAIRY_FENCE.get());
                pOutput.accept(ModBlocks.FAIRY_GATE.get());
                pOutput.accept(ModBlocks.FAIRY_DOOR.get());
                pOutput.accept(ModBlocks.FAIRY_TRAPDOOR.get());
                pOutput.accept(ModBlocks.FAIRY_PRESSURE_PLATE.get());
                pOutput.accept(ModBlocks.FAIRY_BUTTON.get());
                pOutput.accept(ModBlocks.FAIRYSTONE.get());
                pOutput.accept(ModBlocks.FAIRYSTONE_STAIRS.get());
                pOutput.accept(ModBlocks.FAIRYSTONE_SLAB.get());
                pOutput.accept(ModBlocks.FAIRYSTONE_PRESSURE_PLATE.get());
                pOutput.accept(ModBlocks.FAIRYSTONE_BUTTON.get());
                pOutput.accept(ModBlocks.FAIRYCOBBLE.get());
                pOutput.accept(ModBlocks.FAIRYCOBBLE_STAIRS.get());
                pOutput.accept(ModBlocks.FAIRYCOBBLE_SLAB.get());
                pOutput.accept(ModBlocks.FAIRYCOBBLE_WALL.get());
                pOutput.accept(ModBlocks.FAIRY_BRICKS.get());
                pOutput.accept(ModBlocks.FAIRY_BRICK_STAIRS.get());
                pOutput.accept(ModBlocks.FAIRY_BRICK_SLAB.get());
                pOutput.accept(ModBlocks.FAIRY_BRICK_WALL.get());
                pOutput.accept(ModBlocks.CHISELED_FAIRYSTONE.get());
                pOutput.accept(ModBlocks.CRACKED_FAIRY_BRICKS.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
