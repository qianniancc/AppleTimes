package com.github.qianniancc;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;public class appleAxe{

public appleAxe(){}

public static Item block;
public static Object instance;public void load(){
ItemStack stack = new ItemStack(block, 1);
GameRegistry.addRecipe(stack, new Object[]{
	"X12", "X45", "X7X", Character.valueOf('1'), new ItemStack(Items.apple, 1), Character.valueOf('2'), new ItemStack(Items.apple, 1), Character.valueOf('4'), new ItemStack(Items.stick, 1), Character.valueOf('5'), new ItemStack(Items.apple, 1), Character.valueOf('7'), new ItemStack(Items.stick, 1), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
Item.ToolMaterial enumt = EnumHelper.addToolMaterial("APPLEAXE", 1, 100, 4F, 5, 2);block = (Item)(new ItemAxe(enumt){public Set<String> getToolClasses(ItemStack stack){
HashMap<String, Integer> ret = new HashMap<String, Integer>();
ret.put("axe", 1);
return ret.keySet();
}
}).setUnlocalizedName("AppleAxe").setTextureName("appleaxe");
Item.itemRegistry.addObject(436, "AppleAxe", block);

}

}
