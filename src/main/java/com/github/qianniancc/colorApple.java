package com.github.qianniancc;

import java.util.Random;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class colorApple {

public colorApple(){}

public static Item block;public static Object instance;public void load(){
GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"012", "345", "678", Character.valueOf('0'), new ItemStack(Items.dye, 1, 10), Character.valueOf('1'), new ItemStack(Items.dye, 1, 9), Character.valueOf('2'), new ItemStack(Items.dye, 1, 11), Character.valueOf('3'), new ItemStack(Items.dye, 1, 12), Character.valueOf('4'), new ItemStack(Items.apple, 1), Character.valueOf('5'), new ItemStack(Items.dye, 1, 1), Character.valueOf('6'), new ItemStack(Items.dye, 1, 4), Character.valueOf('7'), new ItemStack(Items.dye, 1, 5), Character.valueOf('8'), new ItemStack(Items.dye, 1, 14), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
block = (Item)(new Qianniancc(15, 0.3F, false));block = ((Qianniancc)block).setUnlocalizedName("ColorApple").setTextureName("colorapple");
block.setMaxStackSize(64);
Item.itemRegistry.addObject(430, "ColorApple", block);

}

public static class Qianniancc extends ItemFood{public Qianniancc(int par2, float par3, boolean par4){super(par2, par3, par4);}}
}
