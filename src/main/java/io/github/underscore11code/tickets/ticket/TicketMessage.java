package io.github.underscore11code.tickets.ticket;

import github.scarsz.discordsrv.dependencies.jda.api.entities.User;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

public class TicketMessage {
    @Getter private Ticket ticket;
    @Getter @Setter private String message;
    @Getter @Setter private User dauthor;
    @Getter @Setter private Player mcauthor;
    @Getter private MessageOrigin origin;



    public enum MessageOrigin{
        DISCORD,
        MINECRAFT
    }
}
