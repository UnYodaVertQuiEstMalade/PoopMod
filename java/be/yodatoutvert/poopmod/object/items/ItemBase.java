package be.yodatoutvert.poopmod.object.items;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.PoopTab);

        ItemInit.ITEMS.add(this);


    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
