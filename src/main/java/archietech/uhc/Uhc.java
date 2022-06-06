package archietech.uhc;

import listeners.PlayerJoin;
import listeners.PlayerQuit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Uhc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin UHC ON");

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown log

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin UHC OFF");

    }


}
