package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

import java.util.Collection;

public class Start implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player;
        if (sender instanceof Player) {
            player = (Player) sender;
            if (player.hasPermission("uhc.ops")) {

                //Logic

                /*
                * - messaggio di inizio (La partita è iniziata...)
                * - creare un comando time che ti faccia vedere il tempo rimanente una volta eseguito (nopermission)
                * - teletrasporto randomico di tutti i player
                * - worldborder
                */
                player.sendMessage(ChatColor.RED + "Hai usato il comando Start");

                Bukkit.broadcastMessage(ChatColor.RED + "The Game is on Starting");



            } else {
                player.sendMessage();
            }

        }
        return true;
    }

}
