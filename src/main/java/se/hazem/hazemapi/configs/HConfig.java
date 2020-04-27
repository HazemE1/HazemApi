package se.hazem.hazemapi.configs;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import se.hazem.hazemapi.HazemApi;

import java.io.File;
import java.io.IOException;

public class HConfig {
    private File file;
    private FileConfiguration config;

    public HConfig(String fileName, String path) {
        this.file = HazemApi.instance.loadFile(fileName, path);
        this.config = HazemApi.instance.loadConfig(this.file);
    }

    public void saveConfig(){
        try {
            config.save(this.file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reloadConfig(){
        try {
            config.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileConfiguration getConfig() {
        return config;
    }

    public void setConfig(FileConfiguration config) {
        this.config = config;
    }
}
