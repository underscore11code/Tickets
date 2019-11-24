package io.github.underscore11code.tickets.util;

import org.bukkit.plugin.PluginLogger;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Debugger{
    private static Logger logger;
    private static boolean debug=false;
    private String fileName="";

    //Should only be called once in onEnable()
    public Debugger(Logger pluginLogger, boolean debugging, String file){
        logger=pluginLogger;
        debug=debugging;
        fileName=file;
    }
    //for all other files or when appending a location is useful
    public Debugger(String file){
        fileName=file;
    }

    //Getters and Setters
    public boolean getDebug(){return debug;}
    public boolean setDebug(boolean state){
        debug=state;
        return debug;
    }
    public void info(String message){
        logger.log(new LogRecord(Level.INFO, message));
    }
    public void warn(String message){
        logger.log(new LogRecord(Level.WARNING, message));
    }
    public void severe(String message){
        logger.log(new LogRecord(Level.SEVERE, message));
    }
    public void debug(String message){
        if(debug){
            if(!this.fileName.equals("")) {
                logger.log(Level.INFO, "[Debug " + this.fileName + "] " + message);
            }else{
                logger.log(Level.INFO, "[Debug] " + message);
            }
        }
    }
}
