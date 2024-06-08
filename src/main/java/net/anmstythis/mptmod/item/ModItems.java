package net.anmstythis.mptmod.item;

import net.anmstythis.mptmod.MptMod;
import net.anmstythis.mptmod.item.custom.SwordCrossItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);
    }

    //создание оружия.
    // ForgeTier - параметры инструмента. везде были указаны нули, потому что параметры оружия были указаны в классе.
    // урон 40, скорость 5
    public static final RegistryObject<Item> Cross = Items.register("cross",
            () -> new SwordCrossItem(new ForgeTier(0, 0, 0,
                    0, 0, null,
                    () -> Ingredient.EMPTY), 40, 5,
                    new Item.Properties().tab(ModCreativeModeTab.DEMON_TAB)));

//    создание глаза. глаз по задумке съедобный, поэтому было добавлено свойство food(). питательность 7
    public static final RegistryObject<Item> Eye = Items.register("eye",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(0)
                            .build()).tab(ModCreativeModeTab.DEMON_TAB)));

    //    создание яблока. питательность 4
    public static final RegistryObject<Item> Apple = Items.register("apple",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(0)
                            .build()).tab(ModCreativeModeTab.DEMON_TAB)));

    public static final RegistryObject<Item> Demonus = Items.register("demonus",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DEMON_TAB))); //бутылка демонического напитка. обычный предмет

    public static final RegistryObject<Item> ExortBook = Items.register("exort_book",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DEMON_TAB))); //книга для экзорцизма. обычный предмет
}
