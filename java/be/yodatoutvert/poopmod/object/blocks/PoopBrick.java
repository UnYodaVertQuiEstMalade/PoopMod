package be.yodatoutvert.poopmod.object.blocks;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.BlockInit;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PoopBrick extends Block implements IHasModel
{
    public PoopBrick(String name, net.minecraft.block.material.Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(8.5F);
        setResistance(60F);
        setCreativeTab(Main.PoopTab);


        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
