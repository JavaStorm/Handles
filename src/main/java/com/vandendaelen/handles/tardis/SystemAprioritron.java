package com.vandendaelen.handles.tardis;

import com.vandendaelen.handles.init.Registries;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.tardis.mod.common.systems.SystemAntenna;
import net.tardis.mod.common.systems.TardisSystems;

import java.awt.*;

public class SystemAprioritron extends TardisSystems.BaseSystem {
    private static final float DAMAGE_PER_USE = 0.0005F;

    @Override
    public void onUpdate(World world, BlockPos consolePos) {

    }

    @Override
    public void damage() {
        this.setHealth(this.getHealth() - DAMAGE_PER_USE);
    }

    @Override
    public Item getRepairItem() {
        return Registries.aprioritron;
    }

    @Override
    public String getNameKey() {
        return "system.handles.aprioritron";
    }

    @Override
    public String getUsage() {
        return new TextComponentTranslation("tardis.aprioritron.usage").getUnformattedComponentText();
    }

    @Override
    public void wear() {

    }

    @Override
    public boolean shouldStopFlight() {
        return false;
    }


}
