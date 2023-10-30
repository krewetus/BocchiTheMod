package com.shrimpo.bocchithemod.item;

import com.shrimpo.bocchithemod.BocchiTheMod;
import com.shrimpo.bocchithemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BocchiTheMod.MOD_ID);


        public static final RegistryObject<CreativeModeTab> BOCCHI_TAB = CREATIVE_MOD_TABS.register("bocchi_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOCCHINGOT.get()))
                        .title(Component.translatable("creativetab.bocchi_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.BOCCHINGOT.get());
                            pOutput.accept(ModItems.RAWBOCCHINGOT.get());
                            pOutput.accept(ModBlocks.BLOCKOFBOCCHINIUM.get());
                            pOutput.accept(ModBlocks.BLOCKOFRAWBOCCHINIUM.get());
                        })
                        .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}