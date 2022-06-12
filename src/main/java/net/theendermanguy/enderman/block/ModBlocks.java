package net.theendermanguy.enderman.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theendermanguy.enderman.EndermansSapphireForge;
import net.theendermanguy.enderman.block.custom.JumpBlock;
import net.theendermanguy.enderman.item.ModCreativeModeTab;
import net.theendermanguy.enderman.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EndermansSapphireForge.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.ENDERMANS_TAB);

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.ENDERMANS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), ModCreativeModeTab.ENDERMANS_TAB);

    public static final RegistryObject<Block> JUMP_BLOCK = registerBlock("jump_block",
            ()->new JumpBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.SLIME_BLOCK)), ModCreativeModeTab.ENDERMANS_TAB);

    public static final RegistryObject<Block> REDSTONE_TABLE = registerBlock("redstone_table",
            ()->new JumpBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0f).requiresCorrectToolForDrops().sound(SoundType.WOOD)), ModCreativeModeTab.ENDERMANS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
