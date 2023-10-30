package com.shrimpo.bocchithemod.item;


import com.shrimpo.bocchithemod.BocchiTheMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BocchiTheMod.MOD_ID);

    public static final RegistryObject<Item> BOCCHINGOT = ITEMS.register("bocchingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOCKOFBOCCHINIUM = ITEMS.register("blockofbocchinium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
