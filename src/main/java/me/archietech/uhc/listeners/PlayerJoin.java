package me.archietech.uhc.listeners;

import org.bukkit.*;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class PlayerJoin implements Listener {
    @EventHandler

    public void onPlayerJoin(PlayerJoinEvent event) {

        Player playerJoined = event.getPlayer();
        String oneWelcome = "§c§lHello! Welcome, ";

        //Tab and join-effect
        Firework firework = playerJoined.getPlayer().getWorld().spawn(playerJoined.getPlayer().getLocation(), Firework.class);
        FireworkMeta data = firework.getFireworkMeta();
        data.addEffects(FireworkEffect.builder().withColor(Color.PURPLE).withColor(Color.GREEN).with(FireworkEffect.Type.BALL_LARGE).withFlicker().build());
        data.setPower(1);
        firework.setFireworkMeta(data);


        playerJoined.sendTitle(ChatColor.RED + "§c§lUHC", ChatColor.RED + oneWelcome + event.getPlayer().getName(), 40, 100, 1);

        int online = Bukkit.getOnlinePlayers().size();

        playerJoined.setPlayerListHeaderFooter(ChatColor.GOLD.toString() + ChatColor.BOLD + "UHC GAMES\n"
                        + ChatColor.GRAY + ChatColor.ITALIC + "Online: " + ChatColor.ITALIC + ChatColor.GREEN + online
                        + ChatColor.DARK_GREEN + "/20" + ChatColor.RED
                        + "\n<====================>\n",
                ChatColor.LIGHT_PURPLE.toString() + ChatColor.ITALIC + "\nby _AdryTech_ & Archiebold2250");


        // Set Gamemode playerJoined & add player to team Online
        Bukkit.getServer().getScoreboardManager().getMainScoreboard().getTeam("Online").addPlayer(playerJoined);
        playerJoined.setGameMode(GameMode.CREATIVE);

        //spawn
        World world = Bukkit.getServer().getWorld("world");
        double x = 0;
        double z = 0;
        double y = 0;

        Location location = new Location(world, x, y, z);

        playerJoined.teleport(location);

    }



}
