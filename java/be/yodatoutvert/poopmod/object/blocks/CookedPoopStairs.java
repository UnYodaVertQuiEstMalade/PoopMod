package be.yodatoutvert.poopmod.object.blocks;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.BlockInit;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class CookedPoopStairs extends BlockStairs implements IHasModel
{

    public CookedPoopStairs(String name, IBlockState modelState)
    {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.PoopTab);
        useNeighborBrightness = true;
        setHardness(7);


        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
