package se.hazem.hazemelapi.gui.items;

import org.bukkit.inventory.ItemStack;

public class GuiItem {
    private ItemStack itemStack;

    public GuiItem(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }
}
