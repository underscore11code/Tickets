package com.gmail.minecrafter11mrt.whbot.util;

import org.javacord.api.entity.message.Message;
import java.util.HashMap;

public class Parser {
    private String content;
    Parser(Message message){
        content=message.getContent();
    }
    Parser(String text){
        content=text;
    }
    HashMap<String,String> splitFlags(){
        HashMap<String,String> flags;

    }
}
