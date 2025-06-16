package net.pencil.consume.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pencil.consume.Consume;
import net.pencil.consume.block.MoBlocks;

import java.util.function.Supplier;

public class MoCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Consume.MOD_ID);

    public static final Supplier<CreativeModeTab> CONSUME_ITEMS_TAB = CREATIVE_MODE_TAB.register("consume_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MoItems.BLUEBERRIES.get()))
                    .title(Component.translatable("creativetab.consume.consume_items"))
                    .displayItems((parameters, output) -> {

                        output.accept(MoItems.BLUEBERRIES);
                        output.accept(MoItems.SWEET_BERRY_JUICE);
                        output.accept(MoItems.GOLDEN_SWEET_BERRIES);
                        output.accept(MoItems.GOLDEN_BEETROOT);
                        output.accept(MoItems.GOLDEN_POTATO);
                        output.accept(MoItems.CHOCOLATE);

                    }).build());

    public static final Supplier<CreativeModeTab> CONSUME_BLOCKS_TAB = CREATIVE_MODE_TAB.register("consume_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MoBlocks.CHOCOLATE_BRICKS_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Consume.MOD_ID, "consume_items_tab"))
                    .title(Component.translatable("creativetab.consume.consume_blocks"))
                    .displayItems((parameters, output) -> {

                        output.accept(MoBlocks.CHOCOLATE_BRICKS_BLOCK);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
