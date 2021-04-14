package se.hazem.hazemapi.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.scheduler.BukkitRunnable;
import se.hazem.hazemapi.HazemApi;
import se.hazem.hazemapi.gui.items.ClickableGuiItem;
import se.hazem.hazemapi.gui.items.GuiItem;
import se.hazem.hazemapi.gui.items.Slot;
import se.hazem.hazemapi.gui.items.StaticGuiItem;

import java.util.HashSet;
import java.util.Set;

public class GuiHandler implements Listener {
    public static GuiHandler instance;

    private Set<GUI> guis;

    public GuiHandler() {
        instance = this;
        guis = new HashSet<>();
    }


    @EventHandler
    public void inventoryPressEvent(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) return;
        Inventory pressedInventory = e.getClickedInventory();
        GUI gui = getGui(pressedInventory);
        if (gui == null) return;
        Slot slot = gui.getSlot(e.getSlot());
        GuiItem pressedItem = slot.getGuiItem();
        Player p = (Player) e.getWhoClicked();
        if (pressedItem instanceof ClickableGuiItem) {
            ClickableGuiItem c = ((ClickableGuiItem) pressedItem);
            c.run(e);

            e.setCancelled(true);
            p.updateInventory();

        }
        if (pressedItem instanceof StaticGuiItem) {
            e.setCancelled(true);
            p.updateInventory();
        }


    }

    @EventHandler
    public void guiClosedEvent(InventoryCloseEvent e) {
        Inventory pressedInventory = e.getInventory();
        GUI gui = getGui(pressedInventory);
        if (gui == null) return;

        if (!gui.isClosableGui())
            new BukkitRunnable() {
                @Override
                public void run() {
                    e.getPlayer().openInventory(gui.getInventory());
                    this.cancel();
                }
            }.runTaskTimer(HazemApi.instance, 0, 0);
    }

    public GUI getGui(Inventory i) {
        for (GUI g : guis) {

            if (g.getInventory().hashCode() == i.hashCode()) {
                return g;
            }
        }

        return null;
    }

    public Set<GUI> getGuis() {
        return guis;
    }

    public void setGuis(Set<GUI> guis) {
        this.guis = guis;
    }
}
