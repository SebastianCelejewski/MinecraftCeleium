package pl.sebcel.minecraft.celeium;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.sebcel.minecraft.celeium.block.ModBlocks;
import pl.sebcel.minecraft.celeium.item.ModItems;
import pl.sebcel.minecraft.celeium.proxy.CommonProxy;
import pl.sebcel.minecraft.celeium.recipes.ModRecipes;
import pl.sebcel.minecraft.celeium.world.CeleiumWorldGenerator;

@Mod(modid = CeleiumMod.modId, name = CeleiumMod.name, version = CeleiumMod.version, acceptedMinecraftVersions = "[1.10]")
public class CeleiumMod {
	
	public static final String modId = "celeium";
	public static final String name = "Celeium Mod";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static CeleiumMod instance;
	
	@SidedProxy(serverSide = "pl.sebcel.minecraft.celeium.proxy.CommonProxy", clientSide = "pl.sebcel.minecraft.celeium.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new CeleiumWorldGenerator(), 0);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}