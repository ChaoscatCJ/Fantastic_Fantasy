package net.ChaoscatCJ.FantasticFantasy.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB).ModItems.Fantastic_Fantasy.MOD_ID;

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MOD_TABS.register("fantastic_fantasy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(net.ChaoscatCJ.FantasticFantasy.item.ModItems.STAR_METAL_INGOT.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(net.ChaoscatCJ.FantasticFantasy.item.ModItems.STAR_METAL_INGOT.get());
                        pOutput.accept(net.ChaoscatCJ.FantasticFantasy.item.ModItems.RAW_STAR_METAL.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}