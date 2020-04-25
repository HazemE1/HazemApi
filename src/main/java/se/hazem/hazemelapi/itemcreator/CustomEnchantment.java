package se.hazem.hazemelapi.itemcreator;

import org.bukkit.enchantments.Enchantment;

public class CustomEnchantment {
    Enchantment enchantment;
    int level;

    public CustomEnchantment(Enchantment e, int level) {
        this.enchantment = e;
        this.level = level;
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public void setEnchantment(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
