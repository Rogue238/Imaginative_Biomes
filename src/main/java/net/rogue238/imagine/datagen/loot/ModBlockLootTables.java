package net.rogue238.imagine.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.block.custom.PansyCropBlock;
import net.rogue238.imagine.item.ModItems;

import java.util.Random;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PANSY.get());
        this.dropSelf(ModBlocks.FAIRY_BUSH.get());
        this.dropSelf(ModBlocks.FAIRY_DIRT.get());
        this.dropSelf(ModBlocks.FAIRY_BRICKS.get());
        this.dropSelf(ModBlocks.FAIRY_TULIP.get());
        this.dropSelf(ModBlocks.GLOBE_THISEL.get());
        this.dropSelf(ModBlocks.LUNGWORT.get());
        this.dropSelf(ModBlocks.FAIRY_PLANKS.get());
        this.dropSelf(ModBlocks.FAIRY_LOG.get());
        this.dropSelf(ModBlocks.FAIRY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FAIRY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FAIRY_WOOD.get());
        this.dropSelf(ModBlocks.FAIRYCOBBLE.get());
        this.dropSelf(ModBlocks.FAIRY_FENCE.get());
        this.dropSelf(ModBlocks.FAIRY_BUTTON.get());
        this.dropSelf(ModBlocks.FAIRY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FAIRY_GATE.get());
        this.dropSelf(ModBlocks.FAIRY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FAIRY_STAIRS.get());
        this.dropSelf(ModBlocks.FAIRYSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.FAIRYCOBBLE_STAIRS.get());
        this.dropSelf(ModBlocks.FAIRY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.FAIRYSTONE_SLAB.get());
        this.dropSelf(ModBlocks.FAIRYCOBBLE_SLAB.get());
        this.dropSelf(ModBlocks.FAIRY_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.FAIRYSTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FAIRYSTONE_BUTTON.get());
        this.dropSelf(ModBlocks.FAIRYCOBBLE_WALL.get());
        this.dropSelf(ModBlocks.FAIRY_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_FAIRYSTONE.get());
        this.dropSelf(ModBlocks.CRACKED_FAIRY_BRICKS.get());
        this.dropSelf(ModBlocks.FAIRY_SAPLING.get());


        this.dropOther(ModBlocks.FAIRYSTONE.get(), ModBlocks.FAIRYCOBBLE.get());
        this.dropOther(ModBlocks.FAIRY_FARMLAND.get(), ModBlocks.FAIRY_DIRT.get());

        this.add(ModBlocks.FAIRY_GRASS1.get(),
                item -> createShearsOnlyDrop(ModItems.FAIRY_SEEDS.get()));  //FIX THIS!!

        this.add(ModBlocks.FAIRY_LEAVES.get(),
                block -> createLeavesDrops(ModBlocks.FAIRY_LEAVES.get(), ModBlocks.FAIRY_SAPLING.get(), 1.0f));


        this.add(ModBlocks.FAIRY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FAIRY_SLAB.get()));
        this.add(ModBlocks.FAIRY_DOOR.get(),
                block -> createDoorTable(ModBlocks.FAIRY_DOOR.get()));

        this.add(ModBlocks.POTTED_PANSY.get(),
                block -> createPotFlowerItemTable(ModBlocks.PANSY.get()));
        this.add(ModBlocks.POTTED_FAIRY_BUSH.get(),
                block -> createPotFlowerItemTable(ModBlocks.FAIRY_BUSH.get()));
        this.add(ModBlocks.POTTED_FAIRY_TULIP.get(),
                block -> createPotFlowerItemTable(ModBlocks.FAIRY_TULIP.get()));
        this.add(ModBlocks.POTTED_FAIRY_GRASS1.get(),
                block -> createPotFlowerItemTable(ModBlocks.FAIRY_GRASS1.get()));
        this.add(ModBlocks.POTTED_GLOBE_THISEL.get(),
                block -> createPotFlowerItemTable(ModBlocks.GLOBE_THISEL.get()));
        this.add(ModBlocks.POTTED_LUNGWORT.get(),
                block -> createPotFlowerItemTable(ModBlocks.LUNGWORT.get()));
        this.add(ModBlocks.POTTED_FAIRY_SAPLING.get(),
                block -> createPotFlowerItemTable(ModBlocks.FAIRY_SAPLING.get()));

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.PANSY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PansyCropBlock.AGE, 7));

        this.add(ModBlocks.PANSY_CROP.get(), createCropDrops(ModBlocks.PANSY_CROP.get(), Item.byBlock(ModBlocks.PANSY.get()),
                ModItems.FAIRY_SEEDS.get(), lootitemcondition$builder));
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
