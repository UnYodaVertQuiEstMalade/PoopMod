package be.yodatoutvert.poopmod.object.blocks;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.BlockInit;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PoopGround extends Block implements IHasModel
{
    public PoopGround(String name, net.minecraft.block.material.Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(1.5F);
        setResistance(10F);
        setCreativeTab(Main.PoopTab);
        setSoundType(SoundType.SLIME);



        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    protected static final AxisAlignedBB AXIS_ALIGNED_BB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.30D, 0.75D);

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AXIS_ALIGNED_BB;
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
