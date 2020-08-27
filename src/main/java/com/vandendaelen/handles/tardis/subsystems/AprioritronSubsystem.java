package com.vandendaelen.handles.tardis.subsystems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;

public class AprioritronSubsystem extends Subsystem {

    public AprioritronSubsystem(ConsoleTile console, Item item) {
        super(console, item);
    }

    @Override
    public CompoundNBT serializeNBT() {
        return new CompoundNBT();
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {

    }

    @Override
    public boolean stopsFlight() {
        return false;
    }

    @Override
    public void onTakeoff() {

    }

    @Override
    public void onLand() {

    }

    @Override
    public void onFlightSecond() {

    }

    @Override
    public boolean shouldSpark() {
        ItemStack stack = this.getItem();
        if (stack == ItemStack.EMPTY){
            return false;
        }
        return (double)(1.0F - (float)stack.getDamage() / (float)stack.getMaxDamage()) < 0.3D;
    }
}
