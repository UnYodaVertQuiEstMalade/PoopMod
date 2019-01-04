package be.yodatoutvert.poopmod.object.blocks;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.BlockInit;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import be.yodatoutvert.poopmod.utils.handlers.SoundsHandler;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class PoopStairs extends BlockStairs implements IHasModel
{

    public PoopStairs(String name, IBlockState modelState)
    {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.PoopTab);
        useNeighborBrightness = true;
        setHardness(0.5F);
        slipperiness = 0.8F;
        setSoundType(SoundType.SLIME);


        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        if (Math.abs(entityIn.motionY) < 0.1D && !entityIn.isSneaking())
        {
            double d0 = 0.4D + Math.abs(entityIn.motionY) * 0.2D;
            entityIn.motionX *= d0;
            entityIn.motionZ *= d0;
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }

    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
