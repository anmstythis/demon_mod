package net.anmstythis.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab DEMON_TAB = new CreativeModeTab("Demon tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Cross.get());
        }
    };
}
