/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_16_R3.block.impl;

public final class CraftRedstoneTorchWall extends org.bukkit.craftbukkit.v1_16_R3.block.data.CraftBlockData implements org.bukkit.block.data.type.RedstoneWallTorch, org.bukkit.block.data.Directional, org.bukkit.block.data.Lightable {

    public CraftRedstoneTorchWall() {
        super();
    }

    public CraftRedstoneTorchWall(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.v1_16_R2.block.data.CraftDirectional

    private static final net.minecraft.state.EnumProperty<?> FACING = getEnum(net.minecraft.block.RedstoneWallTorchBlock.class, "facing");

    @Override
    public org.bukkit.block.BlockFace getFacing() {
        return get(FACING, org.bukkit.block.BlockFace.class);
    }

    @Override
    public void setFacing(org.bukkit.block.BlockFace facing) {
        set(FACING, facing);
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getFaces() {
        return getValues(FACING, org.bukkit.block.BlockFace.class);
    }

    // org.bukkit.craftbukkit.v1_16_R2.block.data.CraftLightable

    private static final net.minecraft.state.BooleanProperty LIT = getBoolean(net.minecraft.block.RedstoneWallTorchBlock.class, "lit");

    @Override
    public boolean isLit() {
        return get(LIT);
    }

    @Override
    public void setLit(boolean lit) {
        set(LIT, lit);
    }
}