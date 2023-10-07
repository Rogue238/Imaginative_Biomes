package net.rogue238.imagine.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.ToolAction;
import net.rogue238.imagine.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

public class soilBlock extends Block {
    public soilBlock(Properties properties) {
        super(properties);
    }
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction,
                                                     boolean simulate) {
        if(context.getItemInHand().getItem() instanceof HoeItem){
            if(state.is(ModBlocks.FAIRY_DIRT.get())) {
                return ModBlocks.FAIRY_FARMLAND.get().defaultBlockState();
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

}

