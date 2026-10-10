package com.giuseppegioliffi91.digduelmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public
class ModBlocks {
    public static final Block TIER0_SHARD_BLOCK = new Block(Block.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block TIER1_CRYSTAL_BLOCK = new Block(Block.Settings.copy(Blocks.DIAMOND_BLOCK));
    public static final Block TIER2_CORE_BLOCK = new Block(Block.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block TIER3_STAR_BLOCK = new Block(Block.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block VICTORY_BLOCK = new Block(Block.Settings.copy(Blocks.GOLD_BLOCK));

    public static void registerBlocks() {
        registerBlock("tier0_shard_block", TIER0_SHARD_BLOCK);
        registerBlock("tier1_crystal_block", TIER1_CRYSTAL_BLOCK);
        registerBlock("tier2_core_block", TIER2_CORE_BLOCK);
        registerBlock("tier3_star_block", TIER3_STAR_BLOCK);
        registerBlock("victory_block", VICTORY_BLOCK);
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, DigDuelMod.id(name), block);
        Registry.register(Registries.ITEM, DigDuelMod.id(name), new BlockItem(block, new Item.Settings()));
    }
}
