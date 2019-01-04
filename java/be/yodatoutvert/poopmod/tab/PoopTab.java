package be.yodatoutvert.poopmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class PoopTab extends CreativeTabs
{
    public PoopTab(String label)
    {
        super("PoopTab");
    }

    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.RED_FLOWER);
    }
}
