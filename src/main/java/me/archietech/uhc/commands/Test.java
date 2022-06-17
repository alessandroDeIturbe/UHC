package me.archietech.uhc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        Player player;

        if (sender instanceof Player) {
            player = (Player) sender;

            if (player.hasPermission("uhc.ops")) {
                sender.sendMessage(String.valueOf(Bukkit.getOnlinePlayers()));
         creload
            }
        }

        return true;
    }
}
