package net.rogue238.imagine.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.rogue238.imagine.Imaginative_biomes;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> FAIRYWOOD = tag("fairywood");
        public static final TagKey<Block> BONEMEAL_FAIRY_GRASS_BLOCK = tag("bonemeal_fairy_grass_block");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Imaginative_biomes.MOD_ID, name));
        }

    }

    public static class Items {

    }
}
