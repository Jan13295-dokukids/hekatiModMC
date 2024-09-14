package net.sckj.hekati.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sckj.hekati.Hekati;
// IGNORE PLEASE!
public class ModBlocks {
public static final Block BLOCK_OF_RAW_RON = registerBlock("block_of_raw_ron",
        new Block(AbstractBlock.Settings.create().strength(3f).requiresTool()));
public static final Block BLOCK_OF_RON = registerBlock("block_of_ron",
        new Block(AbstractBlock.Settings.create().strength(4f)
                .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
public static final Block RON_ORE = registerBlock("ron_ore",
        new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block RON_DEEPSLATE_ORE = registerBlock("ron_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(Hekati.MOD_ID, name), block);
}
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Hekati.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        Hekati.LOGGER.info("Registering Mod Blocks for " + Hekati.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
         entries.add(ModBlocks.BLOCK_OF_RON);
         entries.add(ModBlocks.BLOCK_OF_RAW_RON);
        });
}

}
