package net.rogue238.imagine.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.ModBlocks;
import net.rogue238.imagine.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Imaginative_biomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FAIRY_FRUIT);
        simpleItem(ModItems.FAIRY_SEEDS);
        simpleItem(ModItems.HAPPY_PANSY);

        simpleBlockItem(ModBlocks.FAIRY_DOOR);

        fenceItem(ModBlocks.FAIRY_FENCE, ModBlocks.FAIRY_PLANKS);
        buttonItem(ModBlocks.FAIRY_BUTTON, ModBlocks.FAIRY_PLANKS);
        buttonItem(ModBlocks.FAIRYSTONE_BUTTON, ModBlocks.FAIRYSTONE);

        evenSimplerBlockItem((ModBlocks.FAIRY_STAIRS));
        evenSimplerBlockItem((ModBlocks.FAIRYSTONE_STAIRS));
        evenSimplerBlockItem((ModBlocks.FAIRYCOBBLE_STAIRS));
        evenSimplerBlockItem((ModBlocks.FAIRY_BRICK_STAIRS));
        evenSimplerBlockItem(ModBlocks.FAIRY_GATE);
        evenSimplerBlockItem(ModBlocks.FAIRY_SLAB);
        evenSimplerBlockItem(ModBlocks.FAIRYSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.FAIRYCOBBLE_SLAB);
        evenSimplerBlockItem(ModBlocks.FAIRY_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.FAIRY_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.FAIRYSTONE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.FAIRY_LOG);
        evenSimplerBlockItem(ModBlocks.STRIPPED_FAIRY_LOG);
        evenSimplerBlockItem(ModBlocks.FAIRY_LEAVES);

        trapdoorItem(ModBlocks.FAIRY_TRAPDOOR);

        simpleBlockItemBlockTexture(ModBlocks.PANSY);
        simpleBlockItemBlockTexture(ModBlocks.FAIRY_BUSH);
        simpleBlockItemBlockTexture(ModBlocks.FAIRY_TULIP);
        simpleBlockItemBlockTexture(ModBlocks.FAIRY_GRASS1);
        simpleBlockItemBlockTexture(ModBlocks.GLOBE_THISEL);
        simpleBlockItemBlockTexture(ModBlocks.LUNGWORT);
        simpleBlockItemBlockTexture(ModBlocks.FAIRY_SAPLING);



        wallItem(ModBlocks.FAIRYCOBBLE_WALL, ModBlocks.FAIRYCOBBLE);
        wallItem(ModBlocks.FAIRY_BRICK_WALL, ModBlocks.FAIRY_BRICKS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Imaginative_biomes.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Imaginative_biomes.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Imaginative_biomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(Imaginative_biomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Imaginative_biomes.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Imaginative_biomes.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Imaginative_biomes.MOD_ID, "block/" + item.getId().getPath()));
    }
}
