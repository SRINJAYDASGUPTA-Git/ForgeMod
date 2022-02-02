package net.theendermanguy.enderman.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ENDERMANS_TAB = new CreativeModeTab("endermanstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SAPPHIRE.get());
        }
    };
}
