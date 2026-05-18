package com.sprintxxl.primitivetweaks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PrimitiveTweaks.MODID, name = PrimitiveTweaks.NAME, version = PrimitiveTweaks.VERSION)
public class PrimitiveTweaks
{
    public static final String MODID = "primitivetweaks";
    public static final String NAME = "Primitive Tweaks";
    public static final String VERSION = "0.4.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
