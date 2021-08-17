package dev.tebbot.bunzeehorse;

import dev.tebbot.bunzeehorse.Events.onPlayerInteractEvent;
import dev.tebbot.bunzeehorse.commands.horse;
import org.bukkit.entity.AbstractHorse;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("Horse").setExecutor(new horse());
        // getServer().getPluginManager().registerEvents(new onPlayerInteractEvent(this), this);
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void OpenHorseGUI(Player player, AbstractHorse horse) {

    }
}
