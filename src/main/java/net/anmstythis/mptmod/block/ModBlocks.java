package net.anmstythis.mptmod.block;

import net.anmstythis.mptmod.MptMod;
import net.anmstythis.mptmod.item.ModCreativeModeTab;
import net.anmstythis.mptmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks
{
    public static final DeferredRegister<Block> Blocks =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MptMod.MOD_ID);

    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturns = Blocks.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus)
    {
        Blocks.register(eventBus);
    }

    public static final RegistryObject<Block> SOMETHING_BLOCK = registryBlock("something_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.BARRIER) //барьерный блок
                    .strength(5f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 3)), ModCreativeModeTab.DEMON_TAB);

    public static final RegistryObject<Block> BLOOD_BLOCK = registryBlock("blood_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.CLAY) //глиняный блок
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 3)), ModCreativeModeTab.DEMON_TAB);

    public static final RegistryObject<Block> AZAZEL_BLOCK = registryBlock("azazel_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.GLASS) //стеклянный блок
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 3)), ModCreativeModeTab.DEMON_TAB);

    public static final RegistryObject<Block> GODHEAD_BLOCK = registryBlock("godhead_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.ICE) //ледяной блок
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 3)), ModCreativeModeTab.DEMON_TAB);

}
