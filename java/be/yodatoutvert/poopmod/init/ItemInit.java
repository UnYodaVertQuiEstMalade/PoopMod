package be.yodatoutvert.poopmod.init;

import be.yodatoutvert.poopmod.object.items.ItemBase;
import be.yodatoutvert.poopmod.object.items.PoopBread;
import be.yodatoutvert.poopmod.object.items.armor.ArmorBase;
import be.yodatoutvert.poopmod.object.items.tool.*;
import be.yodatoutvert.poopmod.utils.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item.ToolMaterial POOP_TOOL = EnumHelper.addToolMaterial("poop_tool",1, 25, 2.5F, 0.7F, 3);
    public static final ItemArmor.ArmorMaterial POOP_ARMOR = EnumHelper.addArmorMaterial("poop_armor", Reference.MODID + ":poop",  12, new int[]{1, 2, 3, 1}, 10, SoundEvents.BLOCK_SLIME_PLACE, 0.0F);

    public static final Item.ToolMaterial POOP_COOKED_TOOL = EnumHelper.addToolMaterial("poop_cooked_tool",3, 1500, 9.0F, 6.0F, 23);
    public static final ItemArmor.ArmorMaterial POOP_COOKED_ARMOR = EnumHelper.addArmorMaterial("poop_cooked_armor", Reference.MODID + ":poop_cooked",  33, new int[]{5, 7, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);


    public static final Item POOP = new ItemBase("poop");
    public static final Item POOP_INGOT_RAW = new ItemBase("poop_ingot_raw");
    public static final Item POOP_INGOT_COOKED = new ItemBase("poop_ingot_cooked");

    public static final Item POOP_BREAD = new PoopBread("bread_poop", 2, false);



    public static final Item AXE_POOP = new ToolAxe("poop_axe", POOP_TOOL);
    public static final Item HOE_POOP = new ToolHoe("poop_hoe", POOP_TOOL);
    public static final Item PICKAXE_POOP = new ToolPickaxe("poop_pickaxe", POOP_TOOL);
    public static final Item SHOVEL_POOP = new ToolShovel("poop_shovel", POOP_TOOL);
    public static final Item SWORD_POOP = new ToolSword("poop_sword", POOP_TOOL);
    public static final Item HELMET_POOP = new ArmorBase("poop_helmet", POOP_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_POOP = new ArmorBase("poop_chestplate", POOP_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_POOP = new ArmorBase("poop_leggings", POOP_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_POOP = new ArmorBase("poop_boots", POOP_ARMOR, 1, EntityEquipmentSlot.FEET);

    public static final Item AXE_POOP_COOKED = new ToolAxe("poop_cooked_axe", POOP_COOKED_TOOL);
    public static final Item HOE_POOP_COOKED = new ToolHoe("poop_cooked_hoe", POOP_COOKED_TOOL);
    public static final Item PICKAXE_POOP_COOKED = new ToolPickaxe("poop_cooked_pickaxe", POOP_COOKED_TOOL);
    public static final Item SHOVEL_POOP_COOKED = new ToolShovel("poop_cooked_shovel", POOP_COOKED_TOOL);
    public static final Item SWORD_POOP_COOKED = new ToolSword("poop_cooked_sword", POOP_COOKED_TOOL);
    public static final Item HELMET_POOP_COOKED = new ArmorBase("poop_cooked_helmet", POOP_COOKED_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_POOP_COOKED = new ArmorBase("poop_cooked_chestplate", POOP_COOKED_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_POOP_COOKED = new ArmorBase("poop_cooked_leggings", POOP_COOKED_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_POOP_COOKED = new ArmorBase("poop_cooked_boots", POOP_COOKED_ARMOR, 1, EntityEquipmentSlot.FEET);


}
