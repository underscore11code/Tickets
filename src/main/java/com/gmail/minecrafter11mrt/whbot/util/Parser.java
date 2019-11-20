package com.gmail.minecrafter11mrt.whbot.util;

import org.javacord.api.entity.message.Message;
import java.util.HashMap;

public class Parser {
    private String content;
    public Parser(Message message){
        content=message.getContent();
    }
    public Parser(String text){
        content=text;
    }
    public HashMap<String,String> splitFlags(){
        HashMap<String,String> flags=new HashMap<>();
        String[] argsSplit=content.split(" ");
        for(String arg : argsSplit){
            if(arg.startsWith("-")){
                if(arg.contains(":")){
                    flags.put(arg.split(":")[0],arg.split(":")[1]);
                } else{
                    flags.put(arg.substring(1),"");
                }
            }
        }
        return flags;
    }
}
