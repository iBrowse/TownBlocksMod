package com.juraka.TBM.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespacedDefaultedByKey;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.juraka.TBM.Reference;
import com.juraka.TBM.blocks.BlockTown;

public class Blocks {
	
	public static Block town_block;
	
	public static void init()
	{
		town_block = new BlockTown(Material.ROCK).setUnlocalizedName("TBM:town_block");
	}
	
	public static void register()
	{
		GameRegistry.register(town_block, new ResourceLocation("TBM:block/town_block"));
	}
	
	public static void registerRenders()
	{
		registerRender(town_block);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5)));

	}
	
}
