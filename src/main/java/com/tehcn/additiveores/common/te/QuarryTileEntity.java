package com.tehcn.additiveores.common.te;

import com.tehcn.additiveores.core.init.TileEntityTypesInit;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

    public QuarryTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public QuarryTileEntity() {
        this(TileEntityTypesInit.QUARRY_TILE_ENTITY_TYPE.get());
    }

    @Override
    public void tick() {
        this.world.setBlockState(this.pos.down(), Blocks.AIR.getDefaultState());
    }
}
