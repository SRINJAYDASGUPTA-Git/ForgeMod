package net.theendermanguy.enderman.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theendermanguy.enderman.EndermansSapphireForge;
import net.theendermanguy.enderman.item.custom.SapphireStaffItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EndermansSapphireForge.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ENDERMANS_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            ()-> new SapphireStaffItem(new Item.Properties().tab(ModCreativeModeTab.ENDERMANS_TAB).durability(350)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ENDERMANS_TAB).food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ENDERMANS_TAB).food(ModFoods.HAMBURGER)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
