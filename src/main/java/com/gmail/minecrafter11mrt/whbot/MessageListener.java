package com.gmail.minecrafter11mrt.whbot;

import org.javacord.api.listener.message.*;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;

public class MessageListener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event){
        Message message=event.getMessage();
    }
}
