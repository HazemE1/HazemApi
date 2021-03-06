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

    public ItemStack buildItem() {
        ItemStack i = new ItemStack(type);
        ItemMeta im = i.getItemMeta();
        im.setLore(lore);
        im.setDisplayName(this.name);
        i.setItemMeta(im);
        for (CustomEnchantment ce : enchantments) {
            i.addEnchantment(ce.enchantment, ce.level);
        }
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getType() {
        return type;
    }

    public void setType(Material type) {
        this.type = type;
    }

    public List<String> getLore() {
        return lore;
    }

    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    public List<CustomEnchantment> getEnchantments() {
        return enchantments;
    }

    public void setEnchantments(List<CustomEnchantment> enchantments) {
        this.enchantments = enchantments;
    }
}
