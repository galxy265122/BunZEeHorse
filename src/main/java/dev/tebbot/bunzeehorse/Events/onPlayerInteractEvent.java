package dev.tebbot.bunzeehorse.Events;

import dev.tebbot.bunzeehorse.Main;
import org.bukkit.entity.AbstractHorse;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class onPlayerInteractEvent implements Listener {

    private Main plugin;

    public onPlayerInteractEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent e) {
        Player p = e.getPlayer();
        AbstractHorse horse = (AbstractHorse) e.getRightClicked();

        if (horse instanceof Horse) {
            e.setCancelled(true);

            plugin.OpenHorseGUI(p, horse);
        }

    }


}
