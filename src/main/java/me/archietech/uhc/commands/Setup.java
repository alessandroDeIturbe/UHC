package me.archietech.uhc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Setup implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player player;
        if (sender instanceof Player) {
            player = (Player) sender;
            if (player.hasPermission("uhc.ops")) {

                /*
                 * creare team
                 * randomizzare 2 player nei team
                 *
                 *
                 */

                int all = Bukkit.getServer().getOnlinePlayers().size();

                if (all < 4) {
                    sender.sendMessage(ChatColor.RED + "The game cannot start until the number of players is at least 4!");
                } else if ((all % 2) != 0) {
                    sender.sendMessage(ChatColor.RED + "The game cannot start because the number of players is odd ");
                } else {
                    createScoreboard(player.getPlayer());

                }


            } else {

            }

        }
        return true;
    }

    public void createScoreboard(Player player) {

        ScoreboardManager manager = Bukkit.getScoreboardManager();

        Scoreboard board = manager.getMainScoreboard();


        Team red = board.registerNewTeam("Red");
        Team blue = board.registerNewTeam("Blue");
        Team yellow = board.registerNewTeam("Yellow");
        Team green = board.registerNewTeam("Green");
        Team playerOnlineTeam = board.registerNewTeam("Online");

        red.setPrefix(ChatColor.RED + "[RED]" + ChatColor.WHITE);
        blue.setPrefix(ChatColor.BLUE + "[BLUE]" + ChatColor.WHITE);
        yellow.setPrefix(ChatColor.YELLOW + "[YELLOW]" + ChatColor.WHITE);
        green.setPrefix(ChatColor.GREEN + "[GREEN]" + ChatColor.WHITE);

        red.setColor(ChatColor.RED);
        blue.setColor(ChatColor.BLUE);
        yellow.setColor(ChatColor.YELLOW);
        green.setColor(ChatColor.GREEN);
        playerOnlineTeam.setColor(ChatColor.GRAY);

        playerOnlineTeam.allowFriendlyFire();
        red.allowFriendlyFire();
        blue.allowFriendlyFire();
        yellow.allowFriendlyFire();
        green.allowFriendlyFire();

        List<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
        List<Player> players2 = new ArrayList<>(Bukkit.getOnlinePlayers());
        Player randomp1= players.get(new Random().nextInt(players.size()));
        Player randomp2= players.get(new Random().nextInt(players.size()));



    }
}
