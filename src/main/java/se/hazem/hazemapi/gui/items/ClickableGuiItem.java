package se.hazem.hazemapi.gui.items;


import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public abstract class ClickableGuiItem extends GuiItem {
     abstract public void run(ClickType clickType);

     public ClickableGuiItem(ItemStack itemStack) {
          super(itemStack);
     }
}
