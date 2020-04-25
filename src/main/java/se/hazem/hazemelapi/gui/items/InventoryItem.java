package se.hazem.hazemelapi.gui.items;

import org.bukkit.inventory.ItemStack;

public class InventoryItem  implements ClickableItem{
    private ItemStack itemStack;
    private boolean clickable;


    @Override
    public void run() {

    }

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public InventoryItem(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }
}
