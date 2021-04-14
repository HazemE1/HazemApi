package se.hazem.hazemapi.gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import se.hazem.hazemapi.gui.items.ClickableGuiItem;
import se.hazem.hazemapi.gui.items.Slot;

import java.util.List;

public class PagedGui {
    private int currentPage;
    private List<GUI> pages;

    public PagedGui(List<GUI> pages, Player player) {
        this.currentPage = 0;
        this.pages = pages;

        ClickableGuiItem nextPage = new ClickableGuiItem(new ItemStack(Material.ARROW)) {
            @Override
            public void run(InventoryClickEvent inventoryClickEvent) {
                if (currentPage == pages.size())
                    return;
                currentPage++;
                player.openInventory(pages.get(currentPage).getInventory());
            }
        };
        ClickableGuiItem prevPage = new ClickableGuiItem(new ItemStack(Material.ACACIA_SIGN)) {
            @Override
            public void run(InventoryClickEvent inventoryClickEvent) {
                if (currentPage == pages.size())
                    return;
                currentPage--;
                player.openInventory(pages.get(currentPage).getInventory());
            }
        };
        for (GUI page : pages) {
            int rows = page.getInventory().getSize() / 9;
            page.addSlot(new Slot(rows + 2, prevPage));
            page.addSlot(new Slot(rows + 7, nextPage));
        }

    }


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    public List<GUI> getPages() {
        return pages;
    }

    public void setPages(List<GUI> pages) {
        this.pages = pages;
    }
}
