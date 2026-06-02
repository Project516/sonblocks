package dev.project516.playerevolutions.items;

import dev.project516.playerevolutions.PlayerEvolutions;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(PlayerEvolutions.TAB));
    }
}
