package net.rogue238.imagine.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Imaginative_biomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //Overworld Tags
        this.tag(BlockTags.DIRT)
                .add(ModBlocks.FAIRY_DIRT.get());
        this.tag(Tags.Blocks.STONE)
                .add(ModBlocks.FAIRYSTONE.get());
        this.tag(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.PANSY.get())
                .add(ModBlocks.FAIRY_BUSH.get())
                .add(ModBlocks.FAIRY_TULIP.get())
                .add(ModBlocks.GLOBE_THISEL.get())
                .add(ModBlocks.LUNGWORT.get());

        this.tag(ModTags.Blocks.BONEMEAL_FAIRY_GRASS_BLOCK)
                .add(ModBlocks.FAIRY_GRASS1.get())
                .add(ModBlocks.PANSY.get())
                .add(ModBlocks.FAIRY_BUSH.get())
                .add(ModBlocks.FAIRY_TULIP.get())
                .add(ModBlocks.GLOBE_THISEL.get())
                .add(ModBlocks.LUNGWORT.get());


        //Wood Tags
        this.tag(BlockTags.LOGS)
                .add(ModBlocks.FAIRY_LOG.get())
                .add(ModBlocks.FAIRY_WOOD.get())
                .add(ModBlocks.STRIPPED_FAIRY_LOG.get())
                .add(ModBlocks.STRIPPED_FAIRY_WOOD.get());
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.FAIRY_LOG.get())
                .add(ModBlocks.FAIRY_WOOD.get())
                .add(ModBlocks.STRIPPED_FAIRY_LOG.get())
                .add(ModBlocks.STRIPPED_FAIRY_WOOD.get());
        this.tag(ModTags.Blocks.FAIRYWOOD)
                .add(ModBlocks.FAIRY_LOG.get())
                .add(ModBlocks.FAIRY_WOOD.get())
                .add(ModBlocks.STRIPPED_FAIRY_LOG.get())
                .add(ModBlocks.STRIPPED_FAIRY_WOOD.get());
        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.FAIRY_PLANKS.get());
        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.FAIRY_DOOR.get());


        //Fence and Wall Tags
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.FAIRY_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.FAIRY_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.FAIRYCOBBLE_WALL.get())
                .add(ModBlocks.FAIRY_BRICK_WALL.get());

        //Tool Tags
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.FAIRY_LOG.get())
                .add(ModBlocks.FAIRY_WOOD.get())
                .add(ModBlocks.STRIPPED_FAIRY_LOG.get())
                .add(ModBlocks.STRIPPED_FAIRY_WOOD.get())
                .add(ModBlocks.FAIRY_PLANKS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FAIRYSTONE.get(),
                        ModBlocks.FAIRYCOBBLE.get(),
                        ModBlocks.FAIRY_BRICKS.get());

    }
}
