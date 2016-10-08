package pl.sebcel.minecraft.celeium.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.sebcel.minecraft.celeium.item.ModItems;

public class ModBlocks {

    public static BlockOre oreCeleium;
    public static BlockBase stoneDirt;
    public static BlockBase terracottaOrange;
    public static BlockBase glazeGreen;
    public static BlockBase gypsumWhite;

    public static void init() {
        oreCeleium = register(new BlockOre("oreCeleium", 3f, 5f, ModItems.celeium).setCreativeTab(CreativeTabs.MATERIALS));
        stoneDirt = register(new BlockBase(Material.ROCK, "stoneDirt").setCreativeTab(CreativeTabs.MATERIALS));
        terracottaOrange = register(new BlockBase(Material.ROCK, "terracottaOrange").setCreativeTab(CreativeTabs.MATERIALS));
        glazeGreen = register(new BlockBase(Material.ROCK, "glazeGreen").setCreativeTab(CreativeTabs.MATERIALS));
        gypsumWhite = register(new BlockBase(Material.ROCK, "gypsumWhite").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase) block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}