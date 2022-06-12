package me.archietech.com.uhc;

import commands.Setup;
import commands.Start;
import listeners.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public final class UHC extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin UHC ON");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

        this.getCommand("start").setExecutor(new Start());
        this.getCommand("setup").setExecutor(new Setup());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin UHC OFF");
    }

}
