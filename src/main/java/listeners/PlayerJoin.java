package listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
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

        Firework firework = playerJoined.getPlayer().getWorld().spawn(playerJoined.getPlayer().getLocation(), Firework.class);
        FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
        data.addEffects(FireworkEffect.builder().withColor(Color.PURPLE).withColor(Color.GREEN).with(FireworkEffect.Type.BALL_LARGE).withFlicker().build());
        data.setPower(1);
        firework.setFireworkMeta(data);
        playerJoined.sendTitle(ChatColor.RED  + "§c§lUHC", ChatColor.RED + oneWelcome + event.getPlayer().getName(), 40, 100, 1);
        int online = Bukkit.getOnlinePlayers().size();
        playerJoined.setPlayerListHeaderFooter(ChatColor.GOLD.toString() + ChatColor.BOLD + "UHC GAMES\n"
                        + ChatColor.GRAY + ChatColor.ITALIC+ "Online: " + ChatColor.ITALIC + ChatColor.GREEN + online
                        + ChatColor.DARK_GREEN+ "/20" + ChatColor.RED
                        + "\n<====================>\n",
                ChatColor.LIGHT_PURPLE.toString() + ChatColor.ITALIC +"\nby _AdryTech_ & Archiebold2250");
    }
}
