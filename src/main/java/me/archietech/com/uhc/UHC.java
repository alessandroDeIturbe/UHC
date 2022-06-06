package me.archietech.com.uhc;

import listeners.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class UHC extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin UHC ON");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin UHC OFF");
    }
}
