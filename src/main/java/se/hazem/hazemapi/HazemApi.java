package se.hazem.hazemapi;

import org.bukkit.plugin.java.JavaPlugin;
import se.hazem.hazemapi.gui.GuiHandler;
import se.hazem.hazemapi.test.Event;

public final class HazemApi extends JavaPlugin {
    public static HazemApi instance;

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
