package se.hazem.hazemelapi;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import se.hazem.hazemelapi.gui.GuiHandler;
import se.hazem.hazemelapi.test.Event;

public final class HazemelApi extends JavaPlugin {
    public static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;

        this.getServer().getPluginManager().registerEvents(new GuiHandler(), this);
        this.getServer().getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {

    }
}
