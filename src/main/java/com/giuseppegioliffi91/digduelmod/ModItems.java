package com.giuseppegioliffi91.digduelmod;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public
class ModItems {
    public static final Item TIER0_PICKAXE = new Item(new Item.Settings());
    public static final Item TIER1_PICKAXE = new Item(new Item.Settings());
    public static final Item TIER2_PICKAXE = new Item(new Item.Settings());
    public static final Item TIER3_PICKAXE = new Item(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registries.ITEM, DigDuelMod.id("tier0_pickaxe"), TIER0_PICKAXE);
        Registry.register(Registries.ITEM, DigDuelMod.id("tier1_pickaxe"), TIER1_PICKAXE);
        Registry.register(Registries.ITEM, DigDuelMod.id("tier2_pickaxe"), TIER2_PICKAXE);
        Registry.register(Registries.ITEM, DigDuelMod.id("tier3_pickaxe"), TIER3_PICKAXE);
    }
}
