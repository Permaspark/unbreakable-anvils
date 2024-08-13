package com.example;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class TutorialItems {
 
    private TutorialItems() {}
 
    public static final CustomItem UNBREAKABLE_ANVIL = new CustomItem(new Item.Settings());
 
    public static Item register(Item instance, String path) {

        return Registry.register(Registries.ITEM, new Identifier("unbreakable-anvils", path), instance);
    }
 
    public static void initialize() {
    }
}