package net.rogue238.imagine.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

import static net.rogue238.imagine.block.ModBlocks.FAIRY_BRICKS;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> FAIRY_COBBLE = List.of(ModBlocks.FAIRYCOBBLE.get());
    private static final List<ItemLike> FAIRY_BRICKS = List.of(ModBlocks.FAIRY_BRICKS.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_BRICKS.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.FAIRYSTONE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYSTONE.get()), has(ModBlocks.FAIRYSTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_FAIRYSTONE.get(), 1)
                .pattern("S")
                .pattern("S")
                .define('S', ModBlocks.FAIRYSTONE_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYSTONE_SLAB.get()), has(ModBlocks.FAIRYSTONE_SLAB.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_PLANKS.get(), 4)
                .requires(ModBlocks.FAIRY_LOG.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_LOG.get()), has(ModBlocks.FAIRY_LOG.get()))
                .save(pWriter);

        wood_doorBuilder(ModBlocks.FAIRY_DOOR.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_trapdoorBuilder(ModBlocks.FAIRY_TRAPDOOR.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_fenceBuilder(ModBlocks.FAIRY_FENCE.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_fenceGateBuilder(ModBlocks.FAIRY_GATE.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_stairBuilder(ModBlocks.FAIRY_STAIRS.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_stairBuilder(ModBlocks.FAIRYSTONE_STAIRS.get(), ModBlocks.FAIRYSTONE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYSTONE.get()), has(ModBlocks.FAIRYSTONE.get()))
                .save(pWriter);
        wood_stairBuilder(ModBlocks.FAIRYCOBBLE_STAIRS.get(), ModBlocks.FAIRYCOBBLE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYCOBBLE.get()), has(ModBlocks.FAIRYCOBBLE.get()))
                .save(pWriter);
        wood_stairBuilder(ModBlocks.FAIRY_BRICK_STAIRS.get(), ModBlocks.FAIRY_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_BRICKS.get()), has(ModBlocks.FAIRY_BRICKS.get()))
                .save(pWriter);
        wood_slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_SLAB.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRYSTONE_SLAB.get(), ModBlocks.FAIRYSTONE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYSTONE.get()), has(ModBlocks.FAIRYSTONE.get()))
                .save(pWriter);
        wood_slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRYCOBBLE_SLAB.get(), ModBlocks.FAIRYCOBBLE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYCOBBLE.get()), has(ModBlocks.FAIRYCOBBLE.get()))
                .save(pWriter);
        wood_slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_BRICK_SLAB.get(), ModBlocks.FAIRY_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_BRICKS.get()), has(ModBlocks.FAIRY_BRICKS.get()))
                .save(pWriter);
        wood_buttonBuilder(ModBlocks.FAIRY_BUTTON.get(), ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_PRESSURE_PLATE.get(),
                ModBlocks.FAIRY_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_PLANKS.get()), has(ModBlocks.FAIRY_PLANKS.get()))
                .save(pWriter);
        wood_buttonBuilder(ModBlocks.FAIRYSTONE_BUTTON.get(), ModBlocks.FAIRYSTONE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYSTONE.get()), has(ModBlocks.FAIRYSTONE.get()))
                .save(pWriter);
        wood_pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRYSTONE_PRESSURE_PLATE.get(),
                ModBlocks.FAIRYSTONE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYSTONE.get()), has(ModBlocks.FAIRYSTONE.get()))
                .save(pWriter);
        stone_wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRYCOBBLE_WALL.get(), ModBlocks.FAIRYCOBBLE.get())
                .unlockedBy(getHasName(ModBlocks.FAIRYCOBBLE.get()), has(ModBlocks.FAIRYCOBBLE.get()))
                .save(pWriter);
        stone_wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRY_BRICK_WALL.get(), ModBlocks.FAIRY_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.FAIRY_BRICKS.get()), has(ModBlocks.FAIRY_BRICKS.get()))
                .save(pWriter);

        oreSmelting(pWriter, FAIRY_COBBLE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FAIRYSTONE.get(), 0.1F, 200, "stone");
        oreSmelting(pWriter, FAIRY_BRICKS, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_FAIRY_BRICKS.get(), 0.25F, 200, "stone");



    }

    protected static RecipeBuilder stone_wallBuilder(RecipeCategory pCategory, ItemLike pWall, Block pMaterial) {
        return ShapedRecipeBuilder.shaped(pCategory, pWall, 6).define('#', pMaterial).pattern("###").pattern("###");
    }

    protected static RecipeBuilder wood_doorBuilder(ItemLike pDoor, Block pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pDoor, 3).define('#', pMaterial).pattern("##").pattern("##").pattern("##");
    }
    protected static RecipeBuilder wood_trapdoorBuilder(ItemLike pTrapdoor, Block pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pTrapdoor, 2).define('#', pMaterial).pattern("###").pattern("###");
    }
    protected static RecipeBuilder wood_fenceBuilder(ItemLike pFence, Block pMaterial) {
        int i = pFence == Blocks.NETHER_BRICK_FENCE ? 6 : 3;
        Item item = pFence == Blocks.NETHER_BRICK_FENCE ? Items.NETHER_BRICK : Items.STICK;
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pFence, i).define('W', pMaterial).define('#', item).pattern("W#W").pattern("W#W");
    }
    protected static RecipeBuilder wood_buttonBuilder(ItemLike pButton, Block pMaterial) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, pButton).requires(pMaterial);
    }
    protected static RecipeBuilder wood_pressurePlateBuilder(RecipeCategory pCategory, ItemLike pPressurePlate,
                                                             Block pMaterial) {
        return ShapedRecipeBuilder.shaped(pCategory, pPressurePlate).define('#', pMaterial).pattern("##");
    }
    protected static RecipeBuilder wood_fenceGateBuilder(ItemLike pFenceGate, Block pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pFenceGate).define('#', Items.STICK).define('W', pMaterial).pattern("#W#").pattern("#W#");
    }
    protected static RecipeBuilder wood_slabBuilder(RecipeCategory pCategory, ItemLike pSlab, Block pMaterial) {
        return ShapedRecipeBuilder.shaped(pCategory, pSlab, 6).define('#', pMaterial).pattern("###");
    }

    protected static RecipeBuilder wood_stairBuilder(ItemLike pStairs, Block pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pStairs, 4).define('#', pMaterial).pattern("#  ").pattern("## ").pattern("###");
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike),
                    pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,Imaginative_biomes.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
