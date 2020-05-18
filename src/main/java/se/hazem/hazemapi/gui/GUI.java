package se.hazem.hazemapi.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import se.hazem.hazemapi.gui.items.Slot;

import java.util.ArrayList;
import java.util.List;

public class GUI {

    private List<Slot> slots;
    private Inventory inventory;
    private boolean isStatic;
    private boolean closableGui;

    public GUI(String name, int rows, boolean isStatic, boolean closableGui){
        slots = new ArrayList<>();
        inventory = Bukkit.createInventory(null, 9*rows, name);
        this.isStatic = isStatic;
        GuiHandler.instance.getGuis().add(this);
        this.closableGui = closableGui;
    }

    public Slot getSlot(int slotNr){
        for (Slot s : this.getSlots()){
            if(s.getSlotNumber()  == slotNr){
                return s;
            }
        }
        return null;
    }

    public void addSlot(Slot slot){
        this.slots.add(slot);
        this.getInventory().setItem(slot.getSlotNumber(), slot.getGuiItem().getItemStack());
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

    public boolean isClosableGui() {
        return closableGui;
    }

    public void setClosableGui(boolean closableGui) {
        this.closableGui = closableGui;
    }
}
