package be.yodatoutvert.poopmod;

import be.yodatoutvert.poopmod.proxy.CommonProxy;
import be.yodatoutvert.poopmod.tab.PoopTab;
import be.yodatoutvert.poopmod.utils.Reference;
import be.yodatoutvert.poopmod.utils.handlers.RecipesHandler;
import be.yodatoutvert.poopmod.utils.handlers.SoundsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    public static final CreativeTabs PoopTab = new PoopTab("poop_tab");

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        RecipesHandler.registerSmeltingRecipes();
        RecipesHandler.registerCraftingRecipes();
        SoundsHandler.init();

    }

}
