package se.hazem.hazemapi.gui.items;

public class Slot {
    private int slotNumber;
    private GuiItem guiItem;

    public Slot(int slotNumber, GuiItem item) {
        this.slotNumber = slotNumber;
        this.guiItem = item;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public GuiItem getGuiItem() {
        return guiItem;
    }

    public void setGuiItem(StaticGuiItem guiItem) {
        this.guiItem = guiItem;
    }
}
