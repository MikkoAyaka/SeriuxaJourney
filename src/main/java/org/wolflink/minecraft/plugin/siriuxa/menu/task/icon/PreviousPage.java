package org.wolflink.minecraft.plugin.siriuxa.menu.task.icon;

import lombok.NonNull;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.wolflink.minecraft.plugin.siriuxa.api.view.Icon;
import org.wolflink.minecraft.plugin.siriuxa.menu.task.TaskRecordStaticMenu;

public class PreviousPage extends Icon {
    private final TaskRecordStaticMenu taskRecordMenu;

    public PreviousPage(TaskRecordStaticMenu taskRecordMenu) {
        super(0);
        this.taskRecordMenu = taskRecordMenu;
    }

    @Override
    protected @NonNull ItemStack createIcon() {
        return fastCreateItemStack(Material.ENDER_PEARL, 1, "上一页");
    }

    @Override
    public void leftClick(Player player) {
        if (taskRecordMenu.hasPreviousPage()) taskRecordMenu.setPage(taskRecordMenu.getPage() - 1);
    }

    @Override
    public void rightClick(Player player) {
        // do nothing
    }
}
