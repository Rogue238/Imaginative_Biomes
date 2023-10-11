package net.rogue238.imagine.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rogue238.imagine.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Mod.EventBusSubscriber(modid = "imagine", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FarmlandTransformHandler {

    private static final Map<UUID, Long> lastTrampleTimes = new HashMap<>();
    private static final Map<BlockPos, Long> lastMoistureChangedTimes = new HashMap<>();

    @SubscribeEvent
    public static void onTrample(BlockEvent.EntityPlaceEvent event) {
        BlockState blockState = event.getState();
        LevelAccessor world = event.getLevel();
        BlockPos pos = event.getPos();
        Entity entity = event.getEntity();

        if (blockState.getBlock() instanceof farmlandBlock && entity instanceof Player) {
            long currentTime = System.currentTimeMillis();
            UUID playerUUID = entity.getUUID();
            long lastTrampleTime = lastTrampleTimes.getOrDefault(playerUUID, 0L);

            // Delay before transforming to fairy_dirt after trampling (e.g., 5 seconds)
            long trampleDelay = 5000;

            if (currentTime - lastTrampleTime >= trampleDelay) {
                world.setBlock(pos, ModBlocks.FAIRY_DIRT.get().defaultBlockState(), 3);
                lastTrampleTimes.put(playerUUID, currentTime);
            }
        }
    }

    @SubscribeEvent
    public static void onTick(LivingEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player) {
            Level world = entity.level();
            BlockPos pos = entity.blockPosition();
            BlockState blockState = world.getBlockState(pos);

            if (blockState.getBlock() instanceof farmlandBlock && blockState.getValue(FarmBlock.MOISTURE) == 0) {
                long currentTime = System.currentTimeMillis();
                long lastMoistureChangedTime = lastMoistureChangedTimes.getOrDefault(pos, 0L);

                // Delay before transforming to fairy_dirt after moisture reaches 0 (e.g., 10 seconds)
                long moistureDelay = 10000;

                if (currentTime - lastMoistureChangedTime >= moistureDelay) {
                    world.setBlock(pos, ModBlocks.FAIRY_DIRT.get().defaultBlockState(), 3);
                    lastMoistureChangedTimes.put(pos, currentTime);
                }
            }
        }
    }
}





