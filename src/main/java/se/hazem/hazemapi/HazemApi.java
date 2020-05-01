package se.hazem.hazemapi;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import se.hazem.hazemapi.gui.GuiHandler;
import se.hazem.hazemapi.test.Event;

import java.io.File;
import java.io.IOException;

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
