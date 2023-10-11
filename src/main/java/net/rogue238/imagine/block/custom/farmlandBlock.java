package net.rogue238.imagine.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.IPlantable;
import net.rogue238.imagine.block.ModBlocks;

import javax.annotation.Nullable;

public class farmlandBlock extends FarmBlock {

    public farmlandBlock(Properties pProperties) {
        super(pProperties);

    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        // Specify your conditions for allowing plants to be sustained on this block
        return true;
    }

    @Override
    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        if (!pLevel.isClientSide) {
            if (net.minecraftforge.common.ForgeHooks.onFarmlandTrample(pLevel, pPos, ModBlocks.FAIRY_DIRT.get().defaultBlockState(), pFallDistance, pEntity)) {
                turnToFairyDirt(pEntity, pState, pLevel, pPos);
            }
        }
        super.fallOn(pLevel, pState, pPos, pEntity, pFallDistance);
    }

    public static void turnToFairyDirt(Entity pEntity, BlockState pState, Level pLevel, BlockPos pPos) {
        BlockState blockstate = pushEntitiesUp(pState, ModBlocks.FAIRY_DIRT.get().defaultBlockState(), pLevel, pPos);
        pLevel.setBlockAndUpdate(pPos, blockstate);
        pLevel.gameEvent(GameEvent.BLOCK_CHANGE, pPos, GameEvent.Context.of(pEntity, blockstate));
    }

}

