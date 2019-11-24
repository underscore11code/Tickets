package io.github.underscore11code.tickets;

import github.scarsz.discordsrv.DiscordSRV;

import io.github.underscore11code.tickets.util.Debugger;

import org.bukkit.plugin.java.JavaPlugin;

public class Tickets extends JavaPlugin {
    private static String ver;
    private Debugger debugger;
    
    @Override
    public void onEnable() {
        long startTime=System.currentTimeMillis();
        debugger=new Debugger(getLogger(),getConfig().getBoolean("debug"),"Main");
        ver=getDescription().getVersion();
        this.saveDefaultConfig();
        debugger.info("Running WHBot "+ver);
        long totaltime=startTime-System.currentTimeMillis();
        debugger.info("Done! Init took "+totaltime+"ms");
    }
    @Override
    public void onDisable() {

    }
    private void checkForDiscordSrvThenSubscribe()
    {
        if (getServer().getPluginManager().isPluginEnabled("DiscordSRV"))
        {
            debugger.debug("DiscordSRV is enabled.");

            //debugger.debug("Subscribing to DiscordSRV's API...");
            //DiscordSRV.api.subscribe();
        }
        else
        {
            debugger.debug("DiscordSRV is not enabled. Please enable it and restart");
            this.setEnabled(false);
        }
    }
}
