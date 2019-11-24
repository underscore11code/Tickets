package com.gmail.minecrafter11mrt.whbot;

import github.scarsz.discordsrv.DiscordSRV;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class WHBot extends JavaPlugin {
    static String ver;
    static Logger logger;
    
    @Override
    public void onEnable() {
        long startTime=System.currentTimeMillis();
        logger=getLogger();
        ver=getDescription().getVersion();
        this.saveDefaultConfig();
        logger.log(Level.INFO,"Running WHBot "+ver);
        long totaltime=startTime-System.currentTimeMillis();
        logger.log(Level.INFO,"Done! Init took "+totaltime+"ms");
    }
    @Override
    public void onDisable() {

    }
}
