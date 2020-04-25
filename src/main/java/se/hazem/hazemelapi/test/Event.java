package se.hazem.hazemelapi.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class Event implements Listener {

    @EventHandler
    public void crouch(PlayerToggleSneakEvent e) {
        if(e.isSneaking()) return;

    }
}
