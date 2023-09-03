package net.ChaoscatCJ.FantasticFantasy.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Fantastic_Fantasy =
            DeferredRegister.create(ForgeRegistries.ITEMS, Fantastic_Fantasy.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = Fantastic_Fantasy.register("star_metal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = Fantastic_Fantasy.register("raw_star_metal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        Fantastic_Fantasy.register(eventBus);
    }
}