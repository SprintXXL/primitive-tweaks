package com.sprintxxl.primitivetweaks.events;

import com.sprintxxl.primitivetweaks.PrimitiveTweaks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = PrimitiveTweaks.MODID)
public class BlockDropEvents {

    @SubscribeEvent
    public static void onBlockDrops(BlockEvent.HarvestDropsEvent event)
    {
        if (event.getState().getBlock() == Blocks.GRAVEL) {
            event.getDrops().removeIf(drop -> drop.getItem() == Items.FLINT);
        }
        if (event.getState().getBlock() == Blocks.LEAVES || event.getState().getBlock() == Blocks.LEAVES2) {
            if (Math.random() < 0.10) {
                event.getDrops().add(new ItemStack(Items.STICK));
            }
        }
    }
}