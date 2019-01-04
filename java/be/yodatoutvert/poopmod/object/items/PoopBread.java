package be.yodatoutvert.poopmod.object.items;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import be.yodatoutvert.poopmod.utils.handlers.SoundsHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.config.GuiConfigEntries;

import java.util.List;

public class PoopBread extends ItemFood implements IHasModel
{
    private PotionEffect[] effects;

    public PoopBread(String name, int amount, boolean isWolfFood)
    {
        super(amount, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.PoopTab);

        ItemInit.ITEMS.add(this);
    }


    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 180, 3));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 240, 3));
        worldIn.playSound(player, player.getPosition(), SoundsHandler.FART_SOUND, SoundCategory.AMBIENT, 1.5F, 1.0F);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("§6Fond dans la bouche.");
        tooltip.add("§4Peu comestible cependant.");
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
