package net.rogue238.imagine.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.block.custom.ModFoods;

public class ModItems {
    public static final DeferredRegister<Item>
            ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Imaginative_biomes.MOD_ID);

    public static final RegistryObject<Item>
            FAIRY_SEEDS = ITEMS.register("fairy_seeds", () -> new ItemNameBlockItem(ModBlocks.PANSY_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item>
            HAPPY_PANSY = ITEMS.register("happy_pansy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>
            FAIRY_FRUIT = ITEMS.register("fairy_fruit", () -> new Item(new Item.Properties().food(ModFoods.FAIRY_FRUIT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
