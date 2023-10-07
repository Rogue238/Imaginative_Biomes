package net.rogue238.imagine.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.block.custom.PansyCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Imaginative_biomes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.FAIRY_DIRT);
        blockWithItem(ModBlocks.FAIRY_PLANKS);
        blockWithItem(ModBlocks.FAIRYSTONE);
        blockWithItem(ModBlocks.FAIRYCOBBLE);
        blockWithItem(ModBlocks.FAIRY_BRICKS);
        blockWithItem(ModBlocks.CHISELED_FAIRYSTONE);
        blockWithItem(ModBlocks.CRACKED_FAIRY_BRICKS);
        //blockWithItem(ModBlocks.FAIRY_WOOD);
        //blockWithItem(ModBlocks.STRIPPED_FAIRY_WOOD);

        stairsBlock(((StairBlock) ModBlocks.FAIRY_STAIRS.get()), blockTexture(ModBlocks.FAIRY_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.FAIRYSTONE_STAIRS.get()), blockTexture(ModBlocks.FAIRYSTONE.get()));
        stairsBlock(((StairBlock) ModBlocks.FAIRYCOBBLE_STAIRS.get()), blockTexture(ModBlocks.FAIRYCOBBLE.get()));
        stairsBlock(((StairBlock) ModBlocks.FAIRY_BRICK_STAIRS.get()), blockTexture(ModBlocks.FAIRY_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FAIRY_SLAB.get()), blockTexture(ModBlocks.FAIRY_PLANKS.get()),
                blockTexture(ModBlocks.FAIRY_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FAIRYSTONE_SLAB.get()), blockTexture(ModBlocks.FAIRYSTONE.get()),
                blockTexture(ModBlocks.FAIRYSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.FAIRYCOBBLE_SLAB.get()), blockTexture(ModBlocks.FAIRYCOBBLE.get()),
                blockTexture(ModBlocks.FAIRYCOBBLE.get()));
        slabBlock(((SlabBlock) ModBlocks.FAIRY_BRICK_SLAB.get()), blockTexture(ModBlocks.FAIRY_BRICKS.get()),
                blockTexture(ModBlocks.FAIRY_BRICKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.FAIRY_BUTTON.get()), blockTexture(ModBlocks.FAIRY_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FAIRY_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FAIRY_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.FAIRYSTONE_BUTTON.get()), blockTexture(ModBlocks.FAIRYSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FAIRYSTONE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FAIRYSTONE.get()));


        logBlock(((RotatedPillarBlock) ModBlocks.FAIRY_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FAIRY_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.FAIRY_WOOD.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FAIRY_WOOD.get()));

        fenceBlock(((FenceBlock) ModBlocks.FAIRY_FENCE.get()), blockTexture(ModBlocks.FAIRY_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FAIRY_GATE.get()), blockTexture(ModBlocks.FAIRY_PLANKS.get()));

        wallBlock(((WallBlock) ModBlocks.FAIRYCOBBLE_WALL.get()), blockTexture(ModBlocks.FAIRYCOBBLE.get()));
        wallBlock(((WallBlock) ModBlocks.FAIRY_BRICK_WALL.get()), blockTexture(ModBlocks.FAIRY_BRICKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.FAIRY_DOOR.get()),
                modLoc("block/fairy_door_bottom"), modLoc("block/fairy_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FAIRY_TRAPDOOR.get()),
                modLoc("block/fairy_trapdoor"), true, "cutout");

        makePansyCrop(((CropBlock) ModBlocks.PANSY_CROP.get()), "happy_sprout", "happy_sprout");

        simpleBlockWithItem(ModBlocks.PANSY.get(), models().cross(blockTexture(ModBlocks.PANSY.get()).getPath(),
                blockTexture(ModBlocks.PANSY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PANSY.get(), models().singleTexture("potted_pansy", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PANSY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.FAIRY_BUSH.get(), models().cross(blockTexture(ModBlocks.FAIRY_BUSH.get()).getPath(),
                blockTexture(ModBlocks.FAIRY_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FAIRY_BUSH.get(), models().singleTexture("potted_fairy_bush", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.FAIRY_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.FAIRY_TULIP.get(), models().cross(blockTexture(ModBlocks.FAIRY_TULIP.get()).getPath(),
                blockTexture(ModBlocks.FAIRY_TULIP.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FAIRY_TULIP.get(), models().singleTexture("potted_fairy_tulip", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.FAIRY_TULIP.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.FAIRY_GRASS1.get(), models().cross(blockTexture(ModBlocks.FAIRY_GRASS1.get()).getPath(),
                blockTexture(ModBlocks.FAIRY_GRASS1.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FAIRY_GRASS1.get(), models().singleTexture("potted_fairy_grass1", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.FAIRY_GRASS1.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.GLOBE_THISEL.get(), models().cross(blockTexture(ModBlocks.GLOBE_THISEL.get()).getPath(),
                blockTexture(ModBlocks.GLOBE_THISEL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_GLOBE_THISEL.get(), models().singleTexture("potted_globe_thisel", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GLOBE_THISEL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LUNGWORT.get(), models().cross(blockTexture(ModBlocks.LUNGWORT.get()).getPath(),
                blockTexture(ModBlocks.LUNGWORT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_LUNGWORT.get(), models().singleTexture("potted_lungwort", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LUNGWORT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.FAIRY_LEAVES.get(), models().cubeAll(blockTexture(ModBlocks.FAIRY_LEAVES.get()).getPath(),
                blockTexture(ModBlocks.FAIRY_LEAVES.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.FAIRY_SAPLING.get(), models().cross(blockTexture(ModBlocks.FAIRY_SAPLING.get()).getPath(),
                blockTexture(ModBlocks.FAIRY_SAPLING.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FAIRY_SAPLING.get(), models().singleTexture("potted_fairy_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.FAIRY_SAPLING.get())).renderType("cutout"));
    }
    public void makePansyCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> pansyStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] pansyStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((PansyCropBlock) block).getAgeProperty()),
                new ResourceLocation(Imaginative_biomes.MOD_ID, "block/" + textureName + state.getValue(((PansyCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


}
