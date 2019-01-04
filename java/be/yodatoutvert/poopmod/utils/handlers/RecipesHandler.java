package be.yodatoutvert.poopmod.utils.handlers;

import be.yodatoutvert.poopmod.init.BlockInit;
import be.yodatoutvert.poopmod.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler
{
    public static void registerCraftingRecipes()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.POOP_INGOT_RAW, 1), "PPP", "PPP", "PPP", 'P', ItemInit.POOP);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.POOP_BREAD, 1), "P", "B", "P", 'P', ItemInit.POOP_INGOT_RAW, 'B', Items.BREAD);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_BLOCK, 1), "PPP", "PPP", "PPP", 'P', ItemInit.POOP_INGOT_RAW);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_BLOCK_COOKED, 1), "PPP", "PPP", "PPP", 'P', ItemInit.POOP_INGOT_COOKED);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_GROUND, 4), " P ", "PPP", 'P', ItemInit.POOP_INGOT_RAW);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_BRICK, 4), "PP", "PP", 'P', ItemInit.POOP_INGOT_COOKED);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_BLOCK_COOKED_PILLAR, 1), "P", "P", 'P', BlockInit.POOP_BLOCK_COOKED);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_TROPHY, 4), "GPG", "GGG", " G ", 'P', BlockInit.POOP_BLOCK_COOKED, 'G', Blocks.GOLD_BLOCK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.POOP, 8), "CCC", "CSC", "CCC", 'C', new ItemStack(Items.DYE, 1, EnumDyeColor.BROWN.getDyeDamage()), 'S', Items.SLIME_BALL);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.POOP_STAIRS, 4), "P  ", "PP ", "PPP", 'P', ItemInit.POOP_INGOT_RAW);
        GameRegistry.addShapedRecipe(new ItemStack(BlockInit.COOKED_POOP_STAIRS, 4), "P  ", "PP ", "PPP", 'P', ItemInit.POOP_INGOT_COOKED);

        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.HELMET_POOP, 1), "PPP", "P P", 'P', ItemInit.POOP_INGOT_RAW);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.CHESTPLATE_POOP, 1), "P P", "PPP", "PPP", 'P', ItemInit.POOP_INGOT_RAW);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.LEGGINGS_POOP, 1), "PPP", "P P", "P P", 'P', ItemInit.POOP_INGOT_RAW);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.BOOTS_POOP, 1), "P P", "P P", 'P', ItemInit.POOP_INGOT_RAW);
        
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.PICKAXE_POOP, 1), "PPP", " S ", " S ", 'P', ItemInit.POOP_INGOT_RAW, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.AXE_POOP, 1), "PP", "PS", " S", 'P', ItemInit.POOP_INGOT_RAW, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.SHOVEL_POOP, 1), "P", "S", "S", 'P', ItemInit.POOP_INGOT_RAW, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.HOE_POOP, 1), "PP", " S", " S", 'P', ItemInit.POOP_INGOT_RAW, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.SWORD_POOP, 1), "P", "P", "S", 'P', ItemInit.POOP_INGOT_RAW, 'S', Items.STICK);


        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.HELMET_POOP_COOKED, 1), "PPP", "P P", 'P', ItemInit.POOP_INGOT_COOKED);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.CHESTPLATE_POOP_COOKED, 1), "P P", "PPP", "PPP", 'P', ItemInit.POOP_INGOT_COOKED);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.LEGGINGS_POOP_COOKED, 1), "PPP", "P P", "P P", 'P', ItemInit.POOP_INGOT_COOKED);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.BOOTS_POOP_COOKED, 1), "P P", "P P", 'P', ItemInit.POOP_INGOT_COOKED);

        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.PICKAXE_POOP_COOKED, 1), "PPP", " S ", " S ", 'P', ItemInit.POOP_INGOT_COOKED, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.AXE_POOP_COOKED, 1), "PP", "PS", " S", 'P', ItemInit.POOP_INGOT_COOKED, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.SHOVEL_POOP_COOKED, 1), "P", "S", "S", 'P', ItemInit.POOP_INGOT_COOKED, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.HOE_POOP_COOKED, 1), "PP", " S", " S", 'P', ItemInit.POOP_INGOT_COOKED, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.SWORD_POOP_COOKED, 1), "P", "P", "S", 'P', ItemInit.POOP_INGOT_COOKED, 'S', Items.STICK);


    }

    public static void registerSmeltingRecipes()
    {
        GameRegistry.addSmelting(new ItemStack(ItemInit.POOP_INGOT_RAW), new ItemStack(ItemInit.POOP_INGOT_COOKED), 2);
        GameRegistry.addSmelting(new ItemStack(BlockInit.POOP_BLOCK), new ItemStack(BlockInit.POOP_BLOCK_COOKED), 2);
    }
}
