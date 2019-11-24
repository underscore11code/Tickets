package io.github.underscore11code.tickets.ticket;

import github.scarsz.discordsrv.dependencies.jda.api.entities.User;
import github.scarsz.discordsrv.dependencies.jda.api.entities.TextChannel;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Ticket {
    @Getter @Setter private String id;
    @Getter @Setter private String name;
    @Getter @Setter private ArrayList<Player> players;
    @Getter @Setter private ArrayList<User> users;
    @Getter @Setter private TextChannel channel;
    @Getter @Setter private TicketLevel level;
    public void sendMessage(User user, String message){

    }
    public void sendMessage(Player player, String message){

    }
}