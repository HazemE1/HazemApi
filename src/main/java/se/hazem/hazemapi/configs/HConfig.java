package se.hazem.hazemapi.configs;

import org.bukkit.configuration.file.FileConfiguration;
import se.hazem.hazemapi.HazemApi;

import java.io.File;

public class HConfig {
    private File file;
    private FileConfiguration config;

    public HConfig(String fileName, String path) {
        this.file = HazemApi.instance.loadFile(fileName, path);
        this.config = HazemApi.instance.loadConfig(this.file);
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
