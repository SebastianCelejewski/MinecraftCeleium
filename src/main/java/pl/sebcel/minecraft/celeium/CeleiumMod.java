package pl.sebcel.minecraft.celeium;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pl.sebcel.minecraft.celeium.block.ModBlocks;
import pl.sebcel.minecraft.celeium.item.ModItems;
import pl.sebcel.minecraft.celeium.proxy.CommonProxy;

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
		System.out.println(name + " is loading!");
		ModItems.init();
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}