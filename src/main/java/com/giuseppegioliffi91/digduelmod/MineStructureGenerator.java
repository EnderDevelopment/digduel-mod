package com.giuseppegioliffi91.digduelmod;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public
class MineStructureGenerator {
    public static void generateMine(World world, BlockPos startPos) {
        for (int x = 0; x < 50; x++) {
            for (int z = 0; z < 50; z++) {
                for (int y = 0; y < 10; y++) {
                    BlockPos pos = startPos.add(x, y, z);
                    BlockState state = Blocks.STONE.getDefaultState();
                    world.setBlockState(pos, state, 3);
                }
            }
        }
    }
}
