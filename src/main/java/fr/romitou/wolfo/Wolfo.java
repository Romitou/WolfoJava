package fr.romitou.wolfo;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Wolfo extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[Wolfo] Enabled.");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[Wolfo] Disabled.");
    }

}
