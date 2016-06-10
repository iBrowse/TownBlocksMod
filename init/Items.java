package com.juraka.TBM.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.juraka.TBM.Reference;

public class Items {
	
	public static Item town_block; //is this ok being named the same as the Block?
	
	public static void init() 
	{
		town_block = new Item().setUnlocalizedName("TBM:block/town_block");
	}
	
	public static void register() 
	{
		GameRegistry.register(town_block, new ResourceLocation("TBM:town_block"));
	}
	
	public static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5)));
	}
	
	public static void registerRenders()
	{
		registerRender(town_block);
	}
	
	
}
