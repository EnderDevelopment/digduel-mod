package com.giuseppegioliffi91.digduelmod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.world.World;

public
class TraderEntity extends VillagerEntity {
    public TraderEntity(EntityType<? extends VillagerEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
    }
}
