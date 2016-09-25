package pl.sebcel.minecraft.celeium.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import pl.sebcel.minecraft.celeium.CeleiumMod;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelResourceLocation location = new ModelResourceLocation(CeleiumMod.modId + ":" + id, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, meta, location);
    }
}