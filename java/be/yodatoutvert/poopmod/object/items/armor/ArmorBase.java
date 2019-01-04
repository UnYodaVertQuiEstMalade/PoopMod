package be.yodatoutvert.poopmod.object.items.armor;

import be.yodatoutvert.poopmod.Main;
import be.yodatoutvert.poopmod.init.ItemInit;
import be.yodatoutvert.poopmod.utils.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IHasModel
{
    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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



    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {

        ItemStack boots = player.inventory.armorItemInSlot(0);
        ItemStack leggings = player.inventory.armorItemInSlot(1);
        ItemStack chestplate = player.inventory.armorItemInSlot(2);
        ItemStack helmet = player.inventory.armorItemInSlot(3);

        boolean bootsOk = (boots != null) && boots.getItem() == ItemInit.BOOTS_POOP;
        boolean legginsOk = (leggings != null) && leggings.getItem() == ItemInit.LEGGINGS_POOP;
        boolean chestplateOk = (chestplate != null) && chestplate.getItem() == ItemInit.CHESTPLATE_POOP;
        boolean helmetOk = (helmet != null) && helmet.getItem() == ItemInit.HELMET_POOP;

        boolean bootsCookedOk = (boots != null) && boots.getItem() == ItemInit.BOOTS_POOP_COOKED;
        boolean legginsCookedOk = (leggings != null) && leggings.getItem() == ItemInit.LEGGINGS_POOP_COOKED;
        boolean chestplateCookedOk = (chestplate != null) && chestplate.getItem() == ItemInit.CHESTPLATE_POOP_COOKED;
        boolean helmetCookedOk = (helmet != null) && helmet.getItem() == ItemInit.HELMET_POOP_COOKED;


        if(bootsOk && legginsOk && chestplateOk && helmetOk)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 100, 2));
        }

        if(bootsCookedOk && legginsCookedOk && chestplateCookedOk && helmetCookedOk)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 100, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 100, 1));
        }
    }
}
