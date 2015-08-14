package com.Bramblefire.WAMod.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class configHandler {

    public static void init( File configFile)
    {
        //create config object from given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            configuration.load();
            //load config, then read in properties
            configValue = configuration.get("TestyMcTesty", "configValue", true, "This an example config value.").getBoolean(true);
        }
        catch (Exception e)
        {
           //log exceptions
        }
        finally
        {
            //save config
            configuration.save();
        }

        System.out.println(configValue);
    }
}
