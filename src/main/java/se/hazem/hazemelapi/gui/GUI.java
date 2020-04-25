package se.hazem.hazemelapi.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import se.hazem.hazemelapi.gui.items.Slot;

import java.util.ArrayList;
import java.util.List;

public class GUI {

    private List<Slot> slots;
    private Inventory inventory;
    private boolean isStatic;

    public GUI(String name, int rows, boolean isStatic){
        slots = new ArrayList<>();
        inventory = Bukkit.createInventory(null, 9*rows, name);
        this.isStatic = isStatic;
    }

    public Slot getSlot(int slotNr){
        for (Slot s : this.getSlots()){
            if(s.getSlotNumber()  == slotNr){
                return s;
            }
        }
        return null;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        this.isStatic = aStatic;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
