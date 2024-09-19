package net.sckj.hekati.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sckj.hekati.Hekati;
import net.sckj.hekati.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup HEKATI_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Hekati.MOD_ID, "hekati_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.RON))
                    .displayName(Text.translatable("itemgroup.hekati.hekati_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RON);
                        entries.add(ModItems.RAW_RON);
                        entries.add(ModBlocks.BLOCK_OF_RON);
                        entries.add(ModBlocks.BLOCK_OF_RAW_RON);
                        entries.add(ModBlocks.RON_ORE);
                        entries.add(ModBlocks.RON_DEEPSLATE_ORE);
                        entries.add(ModItems.ONECBUK);
                    })
                    .build());
    public static void registerItemGroups() {
        Hekati.LOGGER.info("Registering Item Groups for " + Hekati.MOD_ID);

    }
}
