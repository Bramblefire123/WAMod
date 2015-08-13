package com.Bramblefire.WAMod;

import com.Bramblefire.WAMod.proxy.IProxy;
import com.Bramblefire.WAMod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_ID, name = Reference.Mod_NAME, version = Reference.VERSION)

public class WAMod {

    @Mod.Instance(Reference.Mod_ID)
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