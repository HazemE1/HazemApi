package se.hazem.hazemelapi.gui.items;


import org.bukkit.inventory.ItemStack;

public abstract class ClickableGuiItem extends GuiItem {
     abstract public void run();

     public ClickableGuiItem(ItemStack itemStack) {
          super(itemStack);
     }
}
