package se.hazem.hazemelapi.gui;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import se.hazem.hazemelapi.gui.items.InventoryItem;
import se.hazem.hazemelapi.gui.items.Slot;

import java.util.HashSet;
import java.util.Set;

public class GuiHandler implements Listener {
    public static GuiHandler instance;

    private Set<GUI> guis;

    public GuiHandler(){
        instance = this;
        guis = new HashSet<>();
    }

    @EventHandler
    public void inventoryPressEvent(InventoryClickEvent e){
        Inventory pressedInventory = e.getClickedInventory();
        GUI gui = getGui(pressedInventory);
        if (gui == null) return;
        Slot slot = gui.getSlot(e.getSlot());
        InventoryItem pressedItem = slot.getItem();

        if(pressedItem.isClickable()){
            pressedItem.run();
        }

        if(gui.isStatic()){
            e.setCancelled(true);
        }



    }

    public GUI getGui(Inventory i){
        for (GUI g : guis){
            if(g.getInventory().equals(i)){
                return g;
            }
        }

        return null;
    }



}
