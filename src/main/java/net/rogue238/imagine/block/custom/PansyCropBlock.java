package net.rogue238.imagine.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.rogue238.imagine.item.ModItems;

public class PansyCropBlock extends CropBlock {
    public static final int MAX_AGE = 7;
    public static IntegerProperty AGE = BlockStateProperties.AGE_7;

    public PansyCropBlock(Properties pProperties) {
        super(pProperties);
    }



    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.FAIRY_SEEDS.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
