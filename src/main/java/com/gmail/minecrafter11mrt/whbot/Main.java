package com.gmail.minecrafter11mrt.whbot;

import com.gmail.minecrafter11mrt.whbot.util.Parser;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey!");
        System.out.println("I'm a spigot plugin");
        System.out.println("Don't run me directly, put me in your plugin folder");
        if(args[0].equalsIgnoreCase("true")){new WHBot();}
        if(args[1].equalsIgnoreCase("true")){
            Parser parser=new Parser("-t:test -a");
            HashMap<String,String> parseResults=parser.splitFlags();
            parseResults.forEach();
        }
    }
}
