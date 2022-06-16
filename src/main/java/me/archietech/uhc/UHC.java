package me.archietech.uhc;

import me.archietech.uhc.commands.Setup;
import me.archietech.uhc.commands.Start;
import me.archietech.uhc.listeners.PlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class UHC extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getLogger().info("Plugin UHC ON");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

        this.getCommand("start").setExecutor(new Start());
        this.getCommand("setup").setExecutor(new Setup());
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("Plugin UHC OFF");
    }

}
