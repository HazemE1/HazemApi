package se.hazem.hazemelapi.gui.items;

public class Slot {
    private int slotNumber;
    private InventoryItem item;

    public Slot(int slotNumber, InventoryItem item) {
        this.slotNumber = slotNumber;
        this.item = item;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public InventoryItem getItem() {
        return item;
    }

    public void setItem(InventoryItem item) {
        this.item = item;
    }
}
