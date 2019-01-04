package be.yodatoutvert.poopmod.utils.handlers;

import be.yodatoutvert.poopmod.utils.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundsHandler
{
    private static int size = 0;

    public static SoundEvent FART_SOUND;
    public static SoundEvent POOP_BLOCK_SOUND;

    public static void init()
    {
        size = SoundEvent.REGISTRY.getKeys().size();

        FART_SOUND = register("fart_sound");
        POOP_BLOCK_SOUND = register("poop_block_sound");
    }

    public static SoundEvent register(String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent e = new SoundEvent(location);

        SoundEvent.REGISTRY.register(size, location, e);
        size++;
        return e;
    }
}
