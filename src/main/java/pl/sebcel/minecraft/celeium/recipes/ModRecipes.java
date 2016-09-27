package pl.sebcel.minecraft.celeium.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.sebcel.minecraft.celeium.item.ModItems;

public class ModRecipes {
 
    public static void init() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.celeiumGrinder), "CCC", "RSR", " S ", 'C', ModItems.celeium, 'R', Items.REDSTONE, 'S', Items.STICK);
    }
    
}