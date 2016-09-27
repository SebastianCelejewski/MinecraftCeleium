package pl.sebcel.minecraft.celeium.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ItemBase celeium;
    public static ItemBase celeiumGrinder;

    public static void init() {
        celeium = register(new ItemBase("celeium").setCreativeTab(CreativeTabs.MATERIALS));
        celeiumGrinder = register(new CeleiumGrinder("celeiumGrinder").setCreativeTab(CreativeTabs.TOOLS));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase) item).registerItemModel();
        }

        return item;
    }
}