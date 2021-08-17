package dev.tebbot.bunzeehorse.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.AbstractHorse;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;

public class horse implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            if (args.length > 0) {

            if (args[0].equals("claim")) {
                if (player.isInsideVehicle()) {
                    if (player.getVehicle() instanceof Horse) {
                            Horse horse = (Horse) player.getVehicle();
                            horse.setOwner(player);
                    } else {
                        sender.sendMessage(ChatColor.RED + "You need to be mounted to do that!");
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "You need to be mounted to do that!");
                }
            }


            } else {
                player.sendMessage(ChatColor.GOLD + "Please use either /h claim or /h transfer");
            }


        } else {
            sender.sendMessage(ChatColor.RED + "You need to be a player to do that!");
        }


        return true;
    }
}
