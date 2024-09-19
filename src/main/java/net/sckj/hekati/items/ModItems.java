package net.sckj.hekati.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sckj.hekati.Hekati;

public class ModItems {
    public static final Item RON = registerItem("ron", new Item(new Item.Settings()));
    public static final Item RAW_RON = registerItem("raw_ron", new Item(new Item.Settings()));
    public static final Item ONECBUK = registerItem("onecbuk", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Hekati.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Hekati.LOGGER.info("Registering Mod Items for " + Hekati.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(RON);
           entries.add(RAW_RON);
        });

    }
}
