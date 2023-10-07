package net.rogue238.imagine.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.grower.CherryTreeGrower;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rogue238.imagine.Imaginative_biomes;
import net.rogue238.imagine.block.custom.ModFlammableRotatedPillarBlock;
import net.rogue238.imagine.block.custom.PansyCropBlock;
import net.rogue238.imagine.block.custom.farmlandBlock;
import net.rogue238.imagine.block.custom.soilBlock;
import net.rogue238.imagine.item.ModItems;
import net.rogue238.imagine.worldgen.tree.FairyTreeGrower;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static net.minecraft.world.effect.MobEffects.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Imaginative_biomes.MOD_ID);

    public static final RegistryObject<Block> FAIRY_DIRT =
            registerBlock("fairy_dirt", () -> new soilBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> FAIRY_LOG =
            registerBlock("fairy_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));
    public static final RegistryObject<Block> FAIRY_WOOD =
            registerBlock("fairy_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final RegistryObject<Block> STRIPPED_FAIRY_LOG =
            registerBlock("stripped_fairy_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final RegistryObject<Block> STRIPPED_FAIRY_WOOD =
            registerBlock("stripped_fairy_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final RegistryObject<Block> FAIRY_LEAVES =
            registerBlock("fairy_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)){

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });
    public static final RegistryObject<Block> FAIRY_SAPLING =
            registerBlock("fairy_sapling", () -> new SaplingBlock(new FairyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING)));
    public static final RegistryObject<Block> POTTED_FAIRY_SAPLING =BLOCKS.register("potted_fairy_sapling",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FAIRY_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> FAIRY_PLANKS =
            registerBlock("fairy_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)) {

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> FAIRY_STAIRS =
            registerBlock("fairy_stairs", () -> new StairBlock(() -> ModBlocks.FAIRY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FAIRYSTONE_STAIRS =
            registerBlock("fairystone_stairs", () -> new StairBlock(() -> ModBlocks.FAIRYSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRYCOBBLE_STAIRS =
            registerBlock("fairycobble_stairs", () -> new StairBlock(() -> ModBlocks.FAIRYCOBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRY_BRICK_STAIRS =
            registerBlock("fairy_brick_stairs", () -> new StairBlock(() -> ModBlocks.FAIRY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRY_FENCE =
            registerBlock("fairy_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FAIRYCOBBLE_WALL =
            registerBlock("fairycobble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));
    public static final RegistryObject<Block> FAIRY_BRICK_WALL =
            registerBlock("fairy_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));
    public static final RegistryObject<Block> FAIRY_GATE =
            registerBlock("fairy_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS),
                    SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN, SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> FAIRY_DOOR =
            registerBlock("fairy_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(),
                    BlockSetType.CHERRY));
    public static final RegistryObject<Block> FAIRY_TRAPDOOR =
            registerBlock("fairy_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));
    public static final RegistryObject<Block> FAIRY_BUTTON =
            registerBlock("fairy_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON),
                    BlockSetType.CHERRY, 20, true ));
    public static final RegistryObject<Block> FAIRYSTONE_BUTTON =
            registerBlock("fairystone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.STONE, 20, false ));
    public static final RegistryObject<Block> FAIRY_PRESSURE_PLATE =
            registerBlock("fairy_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), BlockSetType.CHERRY));
    public static final RegistryObject<Block> FAIRYSTONE_PRESSURE_PLATE =
            registerBlock("fairystone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
    public static final RegistryObject<Block> FAIRY_SLAB =
            registerBlock("fairy_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FAIRYSTONE_SLAB =
            registerBlock("fairystone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRYCOBBLE_SLAB =
            registerBlock("fairycobble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRY_BRICK_SLAB =
            registerBlock("fairy_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRYSTONE =
            registerBlock("fairystone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_FAIRYSTONE =
            registerBlock("chiseled_fairystone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FAIRYCOBBLE =
            registerBlock("fairycobble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> FAIRY_BRICKS =
            registerBlock("fairy_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_FAIRY_BRICKS =
            registerBlock("cracked_fairy_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FAIRY_FARMLAND =
            registerBlock("fairy_farmland", () -> new farmlandBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND)));
    public static final RegistryObject<Block> PANSY_CROP =
            BLOCKS.register("happy_sprout", () -> new PansyCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)
                    .noOcclusion().noCollission()));
    public static final RegistryObject<Block> PANSY =
            registerBlock("pansy_flower", () -> new FlowerBlock(() -> REGENERATION,
                    7, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_PANSY = BLOCKS.register("potted_pansy",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PANSY, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> FAIRY_BUSH =
            registerBlock("fairy_bush", () -> new FlowerBlock(() -> GLOWING, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).sound(SoundType.SWEET_BERRY_BUSH)
                            .noOcclusion().noCollission().lightLevel(s -> 5)));
    public static final RegistryObject<Block> POTTED_FAIRY_BUSH = BLOCKS.register("potted_fairy_bush",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FAIRY_BUSH,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).sound(SoundType.SWEET_BERRY_BUSH)
                            .noOcclusion().lightLevel(s -> 5)));
    public static final RegistryObject<Block> FAIRY_TULIP =
            registerBlock("fairy_tulip", () -> new FlowerBlock(() -> REGENERATION,
                    7, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_FAIRY_TULIP = BLOCKS.register("potted_fairy_tulip",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FAIRY_TULIP,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> GLOBE_THISEL =
            registerBlock("globe_thisel", () -> new FlowerBlock(() -> HARM,
                    7, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_GLOBE_THISEL = BLOCKS.register("potted_globe_thisel",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.GLOBE_THISEL,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> LUNGWORT =
            registerBlock("lungwort", () -> new FlowerBlock(() -> HEALTH_BOOST,
                    7, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_LUNGWORT = BLOCKS.register("potted_lungwort",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LUNGWORT, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> FAIRY_GRASS1 =
            registerBlock("fairy_grass1", () -> new FlowerBlock(() -> REGENERATION,
                    0, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission().replaceable()));
    public static final RegistryObject<Block> POTTED_FAIRY_GRASS1 = BLOCKS.register("potted_fairy_grass1",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.FAIRY_GRASS1, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
