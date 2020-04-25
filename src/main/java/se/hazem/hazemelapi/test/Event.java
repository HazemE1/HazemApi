package se.hazem.hazemelapi.test;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import se.hazem.hazemelapi.gui.GUI;
import se.hazem.hazemelapi.gui.items.ClickableGuiItem;
import se.hazem.hazemelapi.gui.items.Slot;
import se.hazem.hazemelapi.gui.items.StaticGuiItem;

public class Event implements Listener {

    @EventHandler
    public void crouch(PlayerToggleSneakEvent e) {
        if(e.isSneaking()) return;

        GUI testGui = new GUI("Test", 3, false);

        testGui.addSlot(new Slot(0, new ClickableGuiItem(new ItemStack(Material.DIAMOND_SWORD)) {
            @Override
            public void run() {
                e.getPlayer().setHealth(0);
                e.getPlayer().sendMessage("YoUR DEAD");
            }
        }));
        testGui.addSlot(new Slot(1, new StaticGuiItem(new ItemStack(Material.DIAMOND))));

        e.getPlayer().openInventory(testGui.getInventory());
    }
}
