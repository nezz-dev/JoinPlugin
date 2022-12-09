package de.nezz.joinlistener.listener;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer(); //defines the player
        player.setGameMode(GameMode.SPECTATOR); //sets the players gamemode to spectator mode (gamemode 3)
        event.setJoinMessage(""); //removes the player join message
    }
}
