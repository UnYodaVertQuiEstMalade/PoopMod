package be.yodatoutvert.poopmod.proxy;

import be.yodatoutvert.poopmod.utils.handlers.RecipesHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void registerItemRenderer(Item item, int meta, String id)
    {

    }

    public void preInit(FMLPreInitializationEvent event)
    {
        RecipesHandler.registerCraftingRecipes();
        RecipesHandler.registerSmeltingRecipes();
    }

}
