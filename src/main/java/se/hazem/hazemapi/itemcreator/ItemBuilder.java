package se.hazem.hazemapi.itemcreator;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {
    String name;
    Material type;
    List<String> lore;
    List<CustomEnchantment> enchantments;

    public ItemBuilder(String name, Material type) {
        this.name = name;
        this.type = type;
        lore = new ArrayList<>();
        enchantments = new ArrayList<>();
    }

    public void addEnchantment(int level, Enchantment enchantment) {
        enchantments.add(new CustomEnchantment(enchantment, level));
    }

    public void addLore(String message) {
        lore.add(message);
    }

    public ItemStack buildItem() {
        ItemStack i = new ItemStack(type);
        ItemMeta im = i.getItemMeta();
        im.setLore(lore);
        i.setItemMeta(im);
        for (CustomEnchantment ce : enchantments) {
            i.addEnchantment(ce.enchantment, ce.level);
        }
        return i;
    }
}
