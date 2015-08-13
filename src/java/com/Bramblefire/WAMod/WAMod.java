package com.Bramblefire.WAMod;

import com.Bramblefire.WAMod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "WAMod", name = "WA Support Mod", version = "1.7.10-0.0.1")

public class WAMod {

    @Mod.Instance("WAMod")
    public static WAMod instance;

    @SidedProxy(clientSide = "com.Bramblefire.WAMod.proxy.clientProxy", serverSide = "com.Bramblefire.WAMod.proxy.serverProxy")
    public static IProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent inEvent)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent poEvent)
    {

    }
}