package se.hazem.hazemapi.gui.items;


import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public abstract class ClickableGuiItem extends GuiItem {
    abstract public void run(InventoryClickEvent event);

    public ClickableGuiItem(ItemStack itemStack) {
        super(itemStack);
    }
}
