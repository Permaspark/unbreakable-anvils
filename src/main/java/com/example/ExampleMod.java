package com.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {
 
    // an instance of our new item
    public static final Item UNBREAKABLE_ANVIL = new Item(new Item.Settings());
 
    @Override
    public void onInitialize() {
        TutorialItems.initialize();
        Registry.register(Registries.ITEM, new Identifier("unbreakable-anvils", "unbreakable_anvil"), UNBREAKABLE_ANVIL);
    }
}