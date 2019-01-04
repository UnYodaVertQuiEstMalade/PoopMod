package be.yodatoutvert.poopmod.object.items.tool;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{
    public ToolHoe(String name, ToolMaterial material)
    {
        super(material);
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
