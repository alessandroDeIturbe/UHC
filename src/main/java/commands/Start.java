package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;


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

                Bukkit.broadcastMessage(ChatColor.RED + "The Game is on Starting");

                createScoreboard(player.getPlayer());


            } else {
                player.sendMessage();
            }

        }
        return true;
    }

    public void createScoreboard(Player player) {

        ScoreboardManager manager = Bukkit.getScoreboardManager();

        Scoreboard board = manager.getMainScoreboard();

        Team red = board.registerNewTeam("Red");
        Team blue = board.registerNewTeam( "Blue");
        Team yellow = board.registerNewTeam("Yellow");
        Team green = board.registerNewTeam("Green");

        red.setPrefix(ChatColor.RED + "[RED]" + ChatColor.WHITE);
        blue.setPrefix(ChatColor.BLUE + "[BLUE]" + ChatColor.WHITE);
        yellow.setPrefix(ChatColor.YELLOW + "[YELLOW]" + ChatColor.WHITE);
        green.setPrefix(ChatColor.GREEN + "[GREEN]" + ChatColor.WHITE);

        red.setColor(ChatColor.RED);
        blue.setColor(ChatColor.BLUE);
        yellow.setColor(ChatColor.YELLOW);
        green.setColor(ChatColor.GREEN);

    }

}
