package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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

            } else {
                player.sendMessage(ChatColor.RED + "You don't have the permission to run this command!");
            }

        }
        return true;
    }

}
