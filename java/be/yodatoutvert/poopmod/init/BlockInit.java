package be.yodatoutvert.poopmod.init;

import be.yodatoutvert.poopmod.object.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block POOP_BLOCK = new PoopBlock("poop_block", Material.GROUND);
    public static final Block POOP_GROUND = new PoopGround("poop_ground", Material.GROUND);
    public static final Block POOP_BLOCK_COOKED = new PoopBlockCooked("poop_block_cooked", Material.IRON);
    public static final Block POOP_BLOCK_COOKED_PILLAR = new PoopBlockCookedPillar("poop_block_cooked_pillar", Material.IRON);
    public static final Block POOP_BRICK = new PoopBrick("poop_bricks", Material.IRON);
    public static final Block POOP_TROPHY = new PoopTrophy("poop_trophy", Material.ANVIL);
    public static final Block POOP_STAIRS = new PoopStairs("poop_stairs", POOP_BLOCK.getDefaultState());
    public static final Block COOKED_POOP_STAIRS = new CookedPoopStairs("cooked_poop_stairs", POOP_BLOCK_COOKED.getDefaultState());


}
